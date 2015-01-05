/**
 *  By : Zehan Zhao , i@allenzhao.com
 *  Blog : http://blog.allenzhao.com
 *  LeetCode Link: https://oj.leetcode.com/problems/search-for-a-range/
 *  Blog post link: http://blog.allenzhao.com/leetcode/2014/09/15/LeetCode-Search-for-a-Range/
 */

public class Solution {
    public int[] searchRange(int[] A, int target) {
        int result[] = new int[2];
        int start, end, mid;
        if (A.length == 0) {
            result[0] = result[1] = -1;
            return result;
        }
        // Search for the left bound
        start = 0;
        end = A.length - 1;
        while (start + 1 < end) {
            mid = start + (end - start) /2;
            if (A[mid] == target) {
                end = mid;
            } else if (A[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (A[start] == target) {
            result[0] = start;
        } else if (A[end] == target) {
            result[0] = end;
        } else {
            result[0] = result[1] = -1;
            return result;
        }
        // Search for the right bound.
        start = 0;
        end = A.length - 1;
        while (start + 1 < end) {
            mid = start + (end - start) /2;
            if (A[mid] == target) {
                start = mid;
            } else if (A[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
        }

        if (A[end] == target) {
            result[1] = end;
        } else if (A[start] == target) {
            result[1] = start;
        } else {
            result[0] = result[1] = -1;
            return result;
        }
        return result;
    }
}
