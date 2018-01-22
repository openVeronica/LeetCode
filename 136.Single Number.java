package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

//哈希列表的方法 时间复杂度O(n) 空间复杂度 O(n)
public class Solution {
    public int singleNumber(int[] nums){
        Map m = new HashMap();
        for (int i = 0; i < nums.length; i++){
            if (m.containsKey(nums[i])){
                m.remove(nums[i]);
                continue;
            }
            m.put(nums[i], i);
        }
        Iterator iterator = m.entrySet().iterator();
        if (iterator.hasNext()){
            Map.Entry me = (Map.Entry)iterator.next();
            int single = (int) me.getKey();
            return single;
        }
        return 0;
    }
}
