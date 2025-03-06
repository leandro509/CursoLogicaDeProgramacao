/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosclasses;

/**
 *
 * @author kleut
 */
public class Materias {
    
    //Atributos
    //public - modificador de acesso
    //private - só pode ser lido ou alterado dentro da própria classe 
    public String nomeMateria;
    public int quantidadeHoras = 0;
    public int quantidadeAlunos = 0;
    
    public Materias(String nMateria, int qtdeHoras, int qtdeAlunos ) {
    
        System.out.println("Materia : " + nMateria);
        System.out.println("Carga horaria : " + qtdeHoras);
        System.out.println("Alunos matriculados : " + qtdeAlunos);
        System.out.println("--------------------------------\n");
    
    }
    
    int somaHoras = 0;
    int somaAlunos = 0;
    
    //Método para somar a quantidade de alunos e carga horária
    //de todos os cursos
    public void soma(int turma, int qtdHoras, int qtdAlunos) {
    
        somaHoras = somaHoras + qtdHoras;
        somaAlunos = somaAlunos + qtdAlunos;
        
        System.out.println("Turma : " + turma);
        System.out.println("Carga horaria : " + qtdHoras + " - Alunos " + qtdAlunos);
        System.out.println("Acumulado Horas: " + somaHoras + " - Acumulado de alunos: " + somaAlunos);
        System.out.println("--------------------------------\n");
        
    
    }
}
