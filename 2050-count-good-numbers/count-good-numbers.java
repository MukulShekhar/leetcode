class Solution {
    int MOD=1000000007;
    public int countGoodNumbers(long n) {
    long odd = helper(4, n / 2);
    long even = helper(5, n - n / 2);
    return (int)((odd * even) % MOD);
    }
    long helper(long a,long b){
        long res=1;
        while(b>0){
            if(b%2==1){
                res=(res*a)%MOD;
            }
            a=(a*a)%MOD;
            b/=2;
        }
        return res;
    }
}