class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++){
            int count=0;
            int j=i;
            while(j!=0){
                if((j&1)==1){
                    count++;
                }
                j=j>>1;
            }
             ans[i]=count;
        }
        return ans;
    }
}
