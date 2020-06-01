package me.xueyao.interview;

/**
 * 判断字符是否唯一
 * @author Simon.Xue
 * @date 2020-06-01 16:14
 **/
public class IsUniqueIcci {
    /**
     * 两次for循环
     * @param str
     * @return
     */
    public static boolean isUnique(String astr) {
        char[] chars = astr.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i+1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    return false;
                }
            }
        }
        return true;
    }



    public static void main(String[] args) {
        System.out.println(isUnique("abc"));
        System.out.println(isUnique("kzwunahkiz"));
    }
}
