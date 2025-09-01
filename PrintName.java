public class PrintName{
     public static void main(String args[]){
        printName("Afreen",8);
        int total print=(printNames("Hello", 8));


    }
    static void printName(String str,int n){
        if(n==0){
            return;
        }
        System.out.println(str);
        printName(str,n-1);

    }
    static int printNames(String str,int n){
        if(n==0){
            return 0;
        }
        System.out.println(str);
        return 1+printNames(str, n-1);
  
   

}
}