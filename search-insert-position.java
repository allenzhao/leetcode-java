/**
 *  By : Zehan Zhao , i@allenzhao.com
 *  Blog : http://blog.allenzhao.com
 *  LeetCode Link: https://oj.leetcode.com/problems/search-insert-position/
 */

public class Solution {
    public int searchInsert(int[] A, int target) {
        // This can be seen as a binary search, in which we return the Kth number that is
        // smaller than the target.
        if (target < A[0]){
            return 0;
        }

        int start = 0;
        int end = A.length - 1;
        int mid;

        // Binary search:
        while ((start + 1) < end) {
            mid = start + (end - start) / 2;
            if (A[mid] == target) {
                return mid;
            } else if (A[mid] < target) {
                start = mid;
            } else if (A[mid] > target) {
                end = mid;
            }
        }

        // Now that target should be
        // 1.equals start or end. Then the index of start/end should be returned
        if (A[start] == target) {
            return start;
        }
        if (A[end] == target) {
            return end;
        }
        // 2. larger than end. Then it should be inserted after end. So index is end + 1.
        if (A[end] < target) {
            return end + 1;
        }
        // 3. larger than start but smaller than end. Should be inserted after start. So index is start + 1.
        return start + 1;
    }
}
