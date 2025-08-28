public class R2 {
    static void sumDigits(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        int d=n%10;
        sum=sum+d;
        sumDigits(n/10,sum);
       

    }
    public static void main(String[] args) {
    sumDigits(123,0);    
        
    }
    
}
