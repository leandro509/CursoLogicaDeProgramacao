import java.util.Scanner;

public class MatrizExe03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Quantas pessoas vao ser entrevistadas : ");
        int qtdPessoas = scan.nextInt();
        int qtdFilhos = 0;
        //Matriz com apenas linhas
        String[][] nomeFilhos = new String[qtdPessoas][];

        for (int i = 0; i < qtdPessoas; i++) {

            System.out.println("Quantos filhos a pessoa " + (i+1) + " tem : ");
            qtdFilhos = scan.nextInt();
            scan.nextLine();

            //Matriz adiciona na linha atual a quantidade de colunas
            nomeFilhos[i] = new String[qtdFilhos];

            for (int j = 0; j < qtdFilhos ; j++) {

                System.out.println("Qual o nome do filho " + (j + 1) + " : ");
                nomeFilhos[i][j] = scan.nextLine();
                

            }

        }

        for(int i = 0; i < qtdPessoas; i++) {

            System.out.println("Pessoa " + (i+1) + " - " + (nomeFilhos[i].length) + " filhos");

            //nomeFilhos[i].length - Contando quantas colunas tem na linha
            for(int j = 0; j < nomeFilhos[i].length; j++) {

               
                System.out.println(nomeFilhos[i][j]);
                
                

            }


            System.out.println(" ");
           

        }
        scan.close();

    }
}
