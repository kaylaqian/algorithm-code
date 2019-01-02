/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class searchIn2dArray {
    public boolean searchIn2dArray(int[][] array, int target) {
        if (array == null || array.length == 0) return false;
        int row = array.length;
        int col = array[0].length;
        int i,j;
        for (i = row -1, j = 0;i >= 0 &&j < col;) {
            if (target == array[i][j]) {
                return true;
            }else if (target < array[i][j]) {
                i--;
                continue;
            }else if (target > array[i][j]) {
                j++;
                continue;
            }
        }
        return false;
    }
}
