class Solution {
    public int findJudge(int n, int[][] trust) {
            int[] delta = new int[n+1];
           
            for(int[] t : trust) {
                delta[t[0]] -= 1; //outgoing trust
                delta[t[1]] += 1; //incoming trust
            }

            for(int i =1;i<=n;i++) {
                if(delta[i] == n-1) {
                    return i;
                }
            }
            return -1;
    }
}