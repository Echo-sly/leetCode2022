package carl;

/**
 * Demo demo0344reverseString
 *
 * @author sunlianyu
 * @date 2022年1月17日 19:55
 */
public class demo0344reverseString {

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] chars = new char[]{'h', 'e', 'l', 'l', 'o', 'g'};
        reverseString(chars);
        System.out.println(chars);
    }
}
