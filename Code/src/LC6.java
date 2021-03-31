public class LC6 {
    public String convert(String s, int numRows) {
        if(numRows==1)return s;
        String[] strs = new String[numRows];
        int n = s.length();
        for (int i = 0; i < s.length(); i++) {
            int flag = i % (numRows - 1);
            int flag2 = i / (numRows - 1);
            int index=(flag2%2==0)?flag:numRows-1-flag;
            strs[index] = strs[index] == null ? "" : strs[index];
            strs[index] += String.valueOf(s.charAt(i));

        }
        String res = "";
        for (String str : strs) {
            if(str!=null)
                res += str;
        }
        return res;
    }

    public static void main(String[] args) {
        LC6 s = new LC6();
        System.out.println(s.convert("PAYPALISHIRING", 4));
    }
}
