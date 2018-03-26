package com.company;
import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> hashMap_s = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hashMap_t = new HashMap<Character, Integer>();
        for (int i = 0; i< s.length(); i++) {
            if (!hashMap_s.containsKey(s.charAt(i)) && !hashMap_t.containsKey(t.charAt(i))) {
                hashMap_s.put(s.charAt(i), i);
                hashMap_t.put(t.charAt(i), i);
            } else if (hashMap_s.get(s.charAt(i)) == hashMap_t.get(t.charAt(i))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}