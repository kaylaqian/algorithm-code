/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class replaceSpace {
    public String replaceSpace(StringBuffer input) {
        if (input == null || input.length() == 0) return input.toString();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++){
            String temp = input.substring(i,i+1);
            if (temp.equals( " ")) {
                sb.append("%20");
            }else {
                sb.append(temp);
            }
        }
        return sb.toString();
    }
}
