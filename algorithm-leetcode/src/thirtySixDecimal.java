import java.util.HashMap;

/**
 * 0-9a-z表示36进制 写一个方法计算36进制的和
**/
public class thirtySixDecimal {
    private static final String byte36 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // 十进制转化成36进制
    private static final char[] arr36 = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    public String addThirtySixDecimal(String s1, String s2){
        int res = byte36To10(s1) + byte36To10(s2);
        return byte10To36(res);
    }
    public int byte36To10(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 36; i++) {
            map.put(byte36.charAt(i),  i);
        }
        int size = s.length();
        char[] s1 = s.toCharArray();
        int num = 0;
        for (int i =0; i <  size; i++) {
            String char2str = String.valueOf(s.charAt(i)).toUpperCase();
            num = (int) (map.get(char2str.charAt(0)) * Math.pow(36, size - i - 1) + num);
        }
        return num;
    }
    public String byte10To36(int res) {
        StringBuffer sb = new StringBuffer();
        if (res == 0) {
            sb.append("0");
        }
        while (res > 0) {
            sb.append(arr36[res % 36]);
            res = res/36;
        }
        return sb.reverse().toString();
    }
}
