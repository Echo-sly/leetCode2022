package carl;

/**
 * Demo demo0242isAnagram
 *
 * @author sunlianyu
 * @date 2022年1月17日 16:35
 */
public class demo0242isAnagram {
    public static boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        int sLength = s.length();
        int tLength = t.length();
        for(int i = 0;i<sLength;++i){
            arr[s.charAt(i)-'a']++;
        }
        for(int i = 0;i<tLength;++i){
            arr[t.charAt(i)-'a']--;
        }
        for(int i =0;i<26;++i){
            if(arr[i]!=0)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }
}
