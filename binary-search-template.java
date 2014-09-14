/**
 *  By : Zehan Zhao , i@allenzhao.com
 *  Blog : http://blog.allenzhao.com
 *  LintCode Link: http://lintcode.com/en/problem/binary-search/
 *  Blog Post Link: http://blog.allenzhao.com/lintcode/2014/09/13/Template-for-Binary-search/
 */
import java.util.Arrays;

class Solution {
    /**
     * @param array source array
     * @param target target to search
     * @return the first occurrence position of target
     */
    public int binarySearch(int[] array, int target) {
        if (array.length == 0 || array == null){
            return -1;
        }

        int start = 0;
        int end = array.length - 1;
        int mid;

        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                end = mid;
            } else if (array[mid] < target) {
                start = mid;
            }
        }
        if (array[start] == target) {
            return start;
        }
        if (array[end] == target) {
            return end;
        }
        return -1;
    }
}
