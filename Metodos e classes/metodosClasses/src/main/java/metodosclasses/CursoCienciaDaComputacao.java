/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosclasses;
import java.util.Scanner;
/**
 *
 * @author kleut
 */
public class CursoCienciaDaComputacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        //Preenchendo os valores e imprimindo   
        Materias aluno1 = new Materias ("Python", 120, 59);
        Materias aluno2 = new Materias ("Java", 80, 109);
        
        aluno1.nomeMateria = "Algebra";
        aluno1.quantidadeHoras = 40;
        
        System.out.println(aluno1.nomeMateria);
        System.out.println(aluno1.quantidadeHoras);
        
        int qtdHoras, qtdAlunos;
        
            for(int contador = 1; contador <=3; contador++) {
            
                System.out.println("Digite a carga horaria do curso" + contador);
                qtdHoras = scan.nextInt();
                
                System.out.println("Digite a quantidade de alunos do curso" + contador);
                qtdAlunos = scan.nextInt();
            
            }
        
    }
}
