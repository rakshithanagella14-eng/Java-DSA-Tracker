import java.util.Scanner;
public class ScannerTool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input value");
        int n = sc.nextInt();
        System.out.println("entered value :" + n);
        sc.close();
        
    }
}
