class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int person = 0 ;  person < accounts.length ; person++){
            int sum = 0;
            for(int acc = 0 ; acc < accounts[person].length ; acc++){
                  sum += accounts[person][acc];
            }
           max = Math.max(sum,max);

        }
        return max;
    }
}