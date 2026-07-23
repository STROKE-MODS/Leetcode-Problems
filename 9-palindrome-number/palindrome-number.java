class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else{

        int a =x;
        int reverse_number=0;
        int ld=0;
        while(x!=0){
            ld = x%10;
            x/=10;
            reverse_number = (reverse_number*10)+ld;
        }
        if(reverse_number==a){
            return true;
        }
        else{
            return false;
        }
        }
    }
}