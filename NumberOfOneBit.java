public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans=0;
        int i=0;
        while(i<32){
            if((n&1)==1){
                ans++;
            }
              n=n>>1;
                i++;
        }
        return ans;
    }
}
