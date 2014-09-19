import java.util.ArrayList;

public class Solution {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(ArrayList<ArrayList<Integer>> matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;
        int end = rows * cols - 1;
        // Treat the matrix as a 1D sorted array
        while (start < end + 1) {
            int mid = start + (end - start) / 2;
            int current = matrix[mid / cols][mid % cols];
            if (current == target) {
                return true;
            } else if (current < target){
                start = mid;
            } else {
                end = mid;
            }
        }
        if (matrix[start / cols][start % cols] == target) {
            return true;
        }
        if (matrix[end / cols][end % cols] == target) {
            return true;
        }
        return false;
    }
}
