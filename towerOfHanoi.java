public class towerOfHanoi {
    static void tower(int n, char c, char d, char e){
        if(n==0){
            return;
        }

        tower(n-1, c, e, d);
        System.out.println("disc "+n+ " move from " +c+" to " +d);
        tower(n-1, d, c, e);
    }
    public static void main(String[] args) {
        tower(3, 'A', 'B', 'C');
    }
}
