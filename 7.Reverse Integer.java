package com.company;

 /** @author Veronica
 * @author https://github.com/openVeronica
 */

 //注意溢出问题，int 类型范围 -1247483648（-2^31） ~ 1247483647（2^31 -1）
public class Solution {
    // 不引入长数据类型，用过滤的方法防止溢出问题
    public int reverse(int x){
        int rev = 0;
        while (x != 0){
            if (Math.abs(rev) > Integer.MAX_VALUE/10){
                return 0;
            }
            rev = x % 10 + rev * 10;
            x /= 10;
        }
        return rev;
    }
    /*用长数据类型处理int的溢出
    public int reverse(int x) {
        long rev = 0;
        while (x != 0){
            rev = x%10 + rev*10;
            x = x/10;
        }
        if (Math.abs(rev) > Integer.MAX_VALUE){
            return 0;
        }
        return (int) rev;
    }
    */
}
