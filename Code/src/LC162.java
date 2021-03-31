import java.util.HashSet;

public class LC162 {
    public int findPeakElement(int[] nums) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) return i;
        }
        return -1;
    }
    public String replaceSpaces(StringBuffer str) {
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                str.delete(i,i+1);
                str.insert(i,"%20");
            }
        }
        return str.toString();
    }
    public boolean searchArray(int[][] array, int target) {
        int i = 0, j = array[0].length - 1;
        while (i < array.length && j >= 0) {
            if (array[i][j] == target) return true;
            if (array[i][j] > target) j -- ;
            else i ++ ;
        }
        return false;
    }
    public static void main(String[]args){
        LC162 s=new LC162();
        int[]nums={1,2,1,2,1};
        int[][]arrays={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(s.findPeakElement(nums));
        StringBuffer str=new StringBuffer("i am liuyi");

        System.out.println(s.searchArray(arrays,7));
    }
}
