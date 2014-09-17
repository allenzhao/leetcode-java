/**
 *  Binary search solution
 *  By : Zehan Zhao , i@allenzhao.com
 *  Blog : http://blog.allenzhao.com
 *  LeetCode Link: https://oj.leetcode.com/problems/search-in-rotated-sort-array-ii/
 *  Blog post link: http://blog.allenzhao.com/leetcode/2014/09/17/LeetCode-Search-in-Rotated-Sorted-Array-II/
 */
public class Solution {
    public boolean search(int[] A, int target) {
        if (A.length == 0) {
            return false;
        }
        int start = 0;
        int end = A.length - 1;
        int mid;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (A[mid] == target) {
                return true;
            }
            if(A[mid] == A[start]) {
                start++;
            }else if (A[mid] > A[start]) {
                if (A[mid] > target && A[start] <= target) {
                    end = mid;
                } else {
                    start = mid;
                }
            } else {
               if (A[mid] < target && A[end] >= target) {
                   start = mid;
               } else {
                   end = mid;
               }
            }
        }
        if (A[start] == target) {
            return true;
        }
        if (A[end] == target) {
            return true;
        }
        return false;
    }
}
