import java.util.Scanner;
public class Exe04If { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nomeUsuario = scan.nextLine();
        System.out.println("Digite sua senha: ");
        String senhaUsuario = scan.nextLine();
        if (nomeUsuario.equals("Roger") && senhaUsuario.equals("123")){

            System.out.printf("Usuario %s logado com sucesso!", nomeUsuario);

        }else{
            
            System.out.println("O nome de usuario ou a senha estao incorretos.");

        }
        scan.close();
    }
    
}
