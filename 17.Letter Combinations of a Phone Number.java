package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */


public class Solution {
    public List<String> letterCombinations(String digits){
        List<String> combi = new ArrayList<String>();
        combi.add("");
        String[][] button = {{"a","b","c"},{"d","e","f"},{"g","h","i"},{"j","k","l"},{"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}};
        for (int i = 0; i< digits.length(); i++){
            if (digits.charAt(i) == '0' || digits.charAt(i) == '1'){
                combi.clear();
                return combi; //suppose to be null
            }
            int index = Character.getNumericValue(digits.charAt(i))-2;
            /*
            if (combi.size() == 0){
                for (int k = 0; k < button[index].length; k++){
                    combi.add(button[index][k]);
                }
                continue;
            }*/
            int preSize = combi.size();
            //FIFO, 先通过combi.add("")将combi初始化，使其中包含元素
            while (combi.size() != preSize * button[index].length){
                int j = 0;
                String tmp = combi.remove(j);
                //foreach 循环来简化集合的遍历
                for (int k = 0; k < button[index].length; k++){
                    combi.add(tmp + button[index][k]);
                }
            }
        }
        return combi;
    }
}
