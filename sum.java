public class sum {
    public static int sumNo(int n){
        if(n<=1){
            return n;
        }
        return n+sumNo(n-1);
    }
    public static void main(String[] args) {
    int res = sumNo(10);
    System.out.println(res);
    }
}
