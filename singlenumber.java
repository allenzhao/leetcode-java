/**
 *  By : Zehan Zhao , i@allenzhao.com
 *  Blog : http://blog.allenzhao.com
 *  LeetCode Link: https://oj.leetcode.com/problems/single-number/
 *  Blog Post Link: http://blog.allenzhao.com/leetcode/2014/09/13/leetcode---single-number/
 */

public class Solution {
	public int singleNumber(int[] A) {
		// Do the check to see if A is null or nothing is in A.
		if(A == null || A.length == 0) {
			return -1;
		}
		
		// Do the XOR loop.
		int single = 0;

		for(int i = 0; i < A.length; i++) {
			single ^= A[i];
		}
		return single;
	}
}