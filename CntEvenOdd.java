public class CntEvenOdd {
    static void countEvenOdd(int n,int cntEven,int cntOdd){
        if(n==0){
            System.out.println(cntEven);
            System.out.println(cntOdd);
            return;
        }
        if(n%2==0){
            cntEven++;
        }else{
            cntOdd++;
        }
        countEvenOdd(n-1, cntEven, cntOdd);
    }
     static int[] cntNumber(int n){
        if(n==0){
            int[] res=new int[2];
            return res;
        }
        int []res=cntNumber(n-1);
        if(n%2==0){
            res[0]++;

        }else{
            res[1]++;
        }
        return res;

     }
    public static void main(String[] args) {
        countEvenOdd(14, 0, 0);
        int [] arr= cntNumber(10);
        System.out.println("EvenCount "+arr[0]);
        System.out.println("OddCount "+arr[1]);
        
    }
    
}
