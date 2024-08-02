
public class fab{
    public static void main(String[] args) {
        int n = 10; 
        int a = 0, b = 1;
    
        for (int i = 1; i <= n; i++) {
            int num3 = a + b;
            System.out.print(" " + num3);
            a = b;
            b = num3;
        }
    }
}
