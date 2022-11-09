import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        while(true){
            int a = s.nextInt();
            int a1 = s.nextInt();
            if (a1 == 0 || a == 0) throw new Exception("на ноль делить нельзя");
            System.out.println(a / a1);
        }
    }
}
