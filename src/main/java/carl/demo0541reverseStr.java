package carl;

/**
 * Demo demo0541reverseStr
 *
 * @author sunlianyu
 * @date 2022年1月17日 20:09
 */
public class demo0541reverseStr {
    public static String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder();
        int index = 0;
        int length = s.length();
        while (index < length) {
            int end = Math.min(index + k, length);
            StringBuilder temp = new StringBuilder(s.substring(index, end));
            if ((index / k) % 2 == 0) res.append(temp.reverse());
            else res.append(temp);
            index = end;
        }
        return res.toString();
    }

    public static void main(String[] args) {
       String s = "abcdefg";
        System.out.println(reverseStr(s, 2));
        String s1 = "abcd";
        System.out.println(reverseStr(s1, 2));

    }
}
