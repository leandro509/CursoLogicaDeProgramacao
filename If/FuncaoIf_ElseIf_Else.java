import java.util.Scanner;
public class FuncaoIf_ElseIf_Else {
    public static void main(String[] args) {
        /* 
        //System.in - Lê as informações do teclado
        //Scanner - Objeto da class
        Scanner scan = new Scanner(System.in);

        int idade;

        System.out.println("Digite a sua idade");
        //NextInt - Lê e retorna um número inteiro
        idade = scan.nextInt();

        //if - se
        if(idade >= 18) {
            System.out.println("Maior de idade");
        }else {
            System.out.println("Menor de idade");
        }
        */

        //Exemplo Média aluno

        Scanner scan = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;

        System.out.println("Digite a nota 1");
        nota1 = scan.nextDouble();

        System.out.println("Digite a nota 2");
        nota2 = scan.nextDouble();

        System.out.println("Digite a nota 3");
        nota3 = scan.nextDouble();

        System.out.println("Digite a nota 4");
        nota4 = scan.nextDouble();
        //calcula a media
        media = (nota1 + nota2 + nota3 + nota4) /4;

        //if - se
        if(media >= 7) {
            System.out.println("Média: " + media + " Situação Aprovado(a)");
        //Else If - senão se
        }else if(media >=2){
            System.out.println("Média: " + media + " Situação Recuperação");
        //else - senão
        }else {
            System.out.println("Média: " + media + " Situação Reprovado"); 
        }
        scan.close();
    }  

}