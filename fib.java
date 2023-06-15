class Solution {
    public int fib(int n) {
        int[] result = new int[n+1];
        int ans=0;
        if(n>0)
        {
        result[0]=0;
        result[1]=1;
        }
        if(n==0){
            ans=0;
        }
        if(n==1){
        ans=1;
        }
        else if(n==2){
            ans=1;
        }
        else{
        for(int i=2; i<=n; i++){
            result[i]=result[i-1]+result[i-2];
            ans=result[i];
        }
        }
        return ans;
    }
}
