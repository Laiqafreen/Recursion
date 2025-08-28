public class SumDigits {
    static int helper(int n,int sum){
        if(n==0){
            return sum;
        }
        sum=sum+n%10;
        return helper(n/10,sum);

    }
    static int sumDigits(int n){
        return helper(n,0);

    }
    public static void main(String[] args) {
        int ans=sumDigits(123);
        System.out.println(ans);
        
    }
    
}
