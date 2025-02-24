import java.util.Scanner;

public class MatrizExe03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Quantas pessoas vao ser entrevistadas : ");
        int qtdPessoas = scan.nextInt();
        int qtdFilhos = 0;
        String[][] nomeFilhos = new String[qtdPessoas][];

        for (int i = 0; i < qtdPessoas; i++) {

            System.out.println("Quantos filhos voce tem : ");
            qtdFilhos = scan.nextInt();
            scan.nextLine();

            nomeFilhos[i] = new String[qtdFilhos];

            for (int j = 0; j < qtdFilhos ; j++) {

                System.out.println("Qual o nome do seu filho " + (j + 1) + " : ");
                nomeFilhos[i][j] = scan.nextLine();
                

            }

        }

        for(int i = 0; i < qtdPessoas; i++) {

            System.out.println("Pessoa " + (i+1) + " - " + (nomeFilhos[i].length) + " filhos");

            for(int j = 0; j < nomeFilhos[i].length; j++) {

               
                System.out.print(nomeFilhos[i][j] + "  " );
                
                

            }


            System.out.println(" ");
           

        }
        scan.close();

    }
}
