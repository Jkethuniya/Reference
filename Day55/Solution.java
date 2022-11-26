class Solution {
    public boolean judgeSquareSum(int c) {
        int a = mySqrt(c);
        int b = mySqrt(c-(a*a));
        do{
            if(chk(a,b,c)){return true;}
            
            a--; 
            b = mySqrt(c-(a*a));
        }while(a>0);
        return false;
    }
    public boolean chk(int a, int b, int c){
        return (a*a + b*b) == c; 
    }
    public int mySqrt(int x) {
        long n=x;
        long i=0;
        long res=0;
        if(x==1) return 1;
        while(i<=n){
            long mid = (i+n)/2;
            if(mid*mid<x){
                res=mid;
                i=mid+1;
            }else if(mid*mid>x){
                n=mid-1;
            }else{
                return (int)mid;
            }
        }
        return (int)res;
    }
}
