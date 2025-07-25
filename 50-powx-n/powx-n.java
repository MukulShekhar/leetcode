class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        return helper(x,N);
    }
    private double helper(double x,long n){
        if(n==0){
            return 1.0;
        }
        if(n%2==0){
            return helper(Math.pow(x,2),n/2);
        }else{
            return x * helper(Math.pow(x,2),n/2);
        }
    }
}