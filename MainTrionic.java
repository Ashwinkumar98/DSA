/*
* You are given an integer array nums of length n.

An array is trionic if there exist indices 0 < p < q < n − 1 such that:

nums[0...p] is strictly increasing,
nums[p...q] is strictly decreasing,
nums[q...n − 1] is strictly increasing.
Return true if nums is trionic, otherwise return false.

 

Example 1:

Input: nums = [1,3,5,4,2,6]

Output: true

Explanation:

Pick p = 2, q = 4:

nums[0...2] = [1, 3, 5] is strictly increasing (1 < 3 < 5).
nums[2...4] = [5, 4, 2] is strictly decreasing (5 > 4 > 2).
nums[4...5] = [2, 6] is strictly increasing (2 < 6).©leetcode
* */

public class MainTrionic {
    public static boolean isTrionic(int[] nums) {
        int p = 0, q, n = nums.length;

        if (n < 4) {
            return false;
        }

        while ((p + 1) < nums.length) {
            if (nums[p] < nums[p + 1]) {
                p++;
            } else {
                break;
            }
        }
        System.out.println(p);
        if (p == n - 1) {
            return false;
        } else {
            q = p;
            while (q + 1 < n) {
                if (nums[q] > nums[q + 1]) {
                    q++;
                } else {
                    break;
                }
            }
        }
        System.out.println(q);
        if (q == n - 1) {
            return false;
        } else {
            int k = q;
            while (k + 1 < n) {
                if (nums[k] < nums[k + 1]) {
                    k++;
                } else {
                    break;
                }
            }
            return k == n - 1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {9, 4, 6, 8};
        System.out.println(MainTrionic.isTrionic(nums));
    }
}
