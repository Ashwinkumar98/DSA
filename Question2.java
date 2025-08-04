
/*
You are given an integer array weight of length n, representing the weights of n parcels arranged in a straight line. A shipment is defined as a contiguous subarray of parcels. A shipment is considered balanced if the weight of the last parcel is strictly less than the maximum weight among all parcels in that shipment.

Select a set of non-overlapping, contiguous, balanced shipments such that each parcel appears in at most one shipment (parcels may remain unshipped).

Return the maximum possible number of balanced shipments that can be formed.

 

Example 1:

Input: weight = [2,5,1,4,3]

Output: 2

Explanation:

We can form the maximum of two balanced shipments as follows:

Shipment 1: [2, 5, 1]
Maximum parcel weight = 5
Last parcel weight = 1, which is strictly less than 5. Thus, it's balanced.
Shipment 2: [4, 3]
Maximum parcel weight = 4
Last parcel weight = 3, which is strictly less than 4. Thus, it's balanced.
It is impossible to partition the parcels to achieve more than two balanced shipments, so the answer is 2.

 */

public class Question2 {
    
    public static int maxBalancedShipments(int[] weight) {
        int i = 1, currMax = weight[0], cnt = 0, start = 0;
        while (i < weight.length) {
            currMax = Math.max(weight[i], currMax);

            if (currMax > weight[i]) {
                cnt++;
                start = i + 1;
                if (start < weight.length) {
                    currMax = weight[start];
                }
            }
            i++;
        }
        return cnt;
    }
    public static void main(String[] args) {

        int[] weights = {415, 616, 749};
        System.out.println(Question2.maxBalancedShipments(weights));

    }
}
