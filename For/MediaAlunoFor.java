import java.util.Scanner;
public class MediaAlunoFor {

    public static void main(String[]args) {
        double media;
        double mediaTurma;
        double somaNotas = 0;
        Scanner scan = new Scanner(System.in);
        for( int aluno = 1; aluno <= 3; aluno++ ) {
        String nome = scan.next();
        int p1 = scan.nextInt();
        int p2 = scan.nextInt();
        media = (p1  + p2) / 2;
        System.out.println("Aluno: " + nome);
        System.out.println("Media = " + media);
        if(media >= 6.0){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }
        somaNotas = somaNotas + media;
        }
        mediaTurma = (somaNotas / 3);
        System.out.println("Media da Turma : " + mediaTurma);
        scan.close();

        
    
        
        
        
        
        
        

    }
    
}
