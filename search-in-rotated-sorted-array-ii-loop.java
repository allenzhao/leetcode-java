/**
 *  For-loop solution
 *  By : Zehan Zhao , i@allenzhao.com
 *  Blog : http://blog.allenzhao.com
 *  LeetCode Link: https://oj.leetcode.com/problems/search-in-rotated-sort-array-ii/
 *  Blog post link: http://blog.allenzhao.com/leetcode/2014/09/17/LeetCode-Search-in-Rotated-Sorted-Array-II/
 */
public class Solution {
    public boolean search(int[] A, int target) {
        for (int i = 0; i < A.length; i ++) {
            if (A[i] == target) {
                return true;
            }
        }
        return false;
    }
}
