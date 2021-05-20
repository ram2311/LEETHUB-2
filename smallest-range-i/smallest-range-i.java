class Solution {
    public int smallestRangeI(int[] A, int K) {
        Arrays.sort(A);
        int min = A[0];
        int max = A[A.length - 1];
        return (max - K) - (min + K) > 0?  ((max - K) - (min + K)) : 0;
    }
}