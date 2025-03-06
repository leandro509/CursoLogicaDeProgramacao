/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosclasses;

/**
 *
 * @author leandro
 */
public class MetodosStatic {
    public static void main(String[] args) {
        
        /*
        
        Quando crio um elemento e defino para static eu posso instanciar varios objetos dessa classe,
        mas todos que eu instanciar, vao apontar para o mesmo endereco da memoria,
        e como se eu tivesse varias variaveis e quando eu altero o valor de uma, todas 
        as variaveis que estao usando receberao o mesmo valor.
        
        */
        
        Pao pao1 = new Pao("Frances", 20, "Pequeno" );
        Pao pao2 = new Pao("Pao de Centeio", 50, "Medio" );
        Pao pao3 = new Pao("Pao Australiano", 35, "Grande" );
        
        //Metodos e Atributos static, temos acesso sem ter que instanciar um objeto da classe
        Pao.quantidadePao = 300;
        
        System.out.println("-------------------------\n\n");
        pao1.imprimir();
        pao2.imprimir();
        pao3.imprimir();
        
        
    }
}
