package me.xueyao.simple;

/**
 * 简单算法
 * @author Simon.Xue
 * @date 2020-03-25 09:56
 **/
public class Solution {
    /**
     * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
     * @param x
     * @return
     */
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            //取得最后一位数
            int pop = x % 10;
            //去掉原来数字上的最后一位
            x /= 10;

            if ((rev > Integer.MAX_VALUE/10)
                    || (rev == Integer.MAX_VALUE/10 && pop > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE/10
                    || (rev == Integer.MIN_VALUE/10 && pop < -8)) {
                return 0;
            }
            rev = rev * 10 + pop;

        }
        return rev;
    }


    public static void main(String[] args) {
        System.out.println(reverse(-123456));
    }
}
