package com.company;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s){
        Stack parentheses = new Stack();
        for (int i = 0; i < s.length(); i++ ){
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{'){//单引号表示字符，双引号表示字符串。。。醉了。。。真麻烦。。python是世界上最好的语言
                parentheses.push(c);
                continue;
            }else if(!parentheses.empty()) {
                char peek = (char) parentheses.peek();
                if ((c == ')' && peek == '(')||(c == ']' && peek == '[')||(c == '}' && peek == '{')){
                    parentheses.pop();
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }
        if (parentheses.empty()){
            return true;
        }
        else {
            return false;
        }
    }

}
