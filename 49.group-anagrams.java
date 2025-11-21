/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] array = s.toCharArray();
            Arrays.sort(array);
            String sortedString = new String(array);

            if(map.containsKey(sortedString)){
                List<String> list = map.get(sortedString);
                list.add(s);
                map.put(sortedString, list);
            }else{
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(sortedString, list);
            }
        }
        for(String key : map.keySet()){
            res.add(map.get(key));
        }
        return res;
    }
}
// @lc code=end

