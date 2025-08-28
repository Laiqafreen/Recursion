class R{
    static void printDigits(int n){
        if(n==0){
            return;
        }
        int d=n%10;
        printDigits(n/10);
        System.out.println(d);

    }
    public static void main(String[] args) {
        printDigits(12345);
        
    }
}