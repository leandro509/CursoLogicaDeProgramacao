import java.util.Scanner;
public class NumeroImparesFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        for(int num2 = 1; num2 <= num1; num2++) {
            if(num2 % 2 != 0) {
                System.out.println(num2);
            }    
        }
        scan.close(); 
    }    
}
