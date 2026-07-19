class Solution {
    public double myPow(double x, int n) {
       if(n<0 && n>Integer.MIN_VALUE){
          x = 1/x;
          n = -n;
          return myPow(x,n);
       }
       else if(n==0){
        return 1;
       }
       else if(n%2!=0){
        double half = myPow(x,n/2);
          return  x*half*half;
       }
       else if(n%2==0){
        double half = myPow(x,n/2);
          return half*half;
       }
       return 0;
    }
}