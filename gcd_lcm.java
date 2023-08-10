public class gcd_lcm{
    public static void gcd(){
        int n1 = 10, n2 = 1500, prd=1;
        for(int i = 1; i<10; i++){
            if(n1%i==0 && n2%i==0){
                prd *= i;
            }
        }
        System.out.println(prd);
    }

    public static void lcm(){
        int n1 = 10, n2 = 15, prd=1;
        for(int i = n1; i<=n1*n2; i=i+n1){
            if(i%n2==0){
                prd = i;
            }
        }
        System.out.println(prd);
    }
    public static void main(String[] args) {
    gcd();
    lcm();     
    }
}