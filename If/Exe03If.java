import java.util.Scanner;
public class Exe03If {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    if(num1 >= num2){
        System.out.println("A ordem é " + num2 + " " + num1);
    }else{
        System.out.println("A ordem é " + num1 + " " + num2);
    }
    scan.close();
}
    
}
