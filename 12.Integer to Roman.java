package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    public String intToRoman(int num){
        String[] M = {"","M","MM","MMM"};
        String[] C = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] X = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] I = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String roman = M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
        return roman;
    }
    /*
    public String intToRoman(int num){
        String roman = "";
        while (num > 1000){
            num -= 1000;
            roman += "M";
        }
        while (num >= 900){
            num -= 900;
            roman += "CM";
        }
        while (num >= 500){
            num -= 500;
            roman += "D";
        }
        while (num >= 400){
            num -= 400;
            roman += "CD";
        }
        while (num >= 100){
            num -= 100;
            roman += "C";
        }
        while (num >= 90){
            num -= 90;
            roman += "XC";
        }
        while (num >= 50){
            num -= 50;
            roman += "L";
        }
        while (num >= 40){
            num -= 40;
            roman += "XL";
        }
        while (num >= 10){
            num -= 10;
            roman += "X";
        }
        while (num >= 9){
            num -= 9;
            roman += "IX";
        }
        while (num >= 5){
            num -= 5;
            roman += "V";
        }
        while (num >= 4){
            num -= 4;
            roman += "IV";
        }
        while (num > 0){
            num -= 1;
            roman += "I";
        }
        return roman;
    }*/
}
