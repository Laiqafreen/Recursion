public class Palindrome {
   
static int palindrome(int n){
       if(n==0){
        return 0;
       }
       int rev=palindrome(n/10);
       return rev*10+n%10;
    }

static void palindromeCheck(int n,int rev,int cpy){
    if(n==0){
        System.out.println(cpy==rev?"Palindrome hai":"Not a Palindrome hai");
        return;
    }
    rev=rev*10+n%10;
    palindromeCheck(n/10, rev, cpy);

}   
   
    public static void main(String[] args) {
        int n=121;
        int cpy =n;
        int ans=palindrome(n);
        System.out.println(ans==n?"Palindrome":"Not a Palindrome");
        palindromeCheck(n, 0, cpy);   
    }
    
}
