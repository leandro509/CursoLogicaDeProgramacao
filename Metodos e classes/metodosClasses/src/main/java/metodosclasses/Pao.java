/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosclasses;

/**
 *
 * @author leandro
 */
public class Pao {

    //public - modificador de acesso    
    public String nomePao;
    static int quantidadePao = 5;
    public String tipoPao;

    public Pao(String nPao, int qtdPao, String tPao) {

        //this - referencia / aponta para o atributo na classe 
        this.nomePao = nPao;
        this.quantidadePao = qtdPao;
        this.tipoPao = tPao;
        
        System.out.println("Nome: " + nPao);
        System.out.println("Quantidade: " + qtdPao);
        System.out.println("Tipo: " + tPao);
        System.out.println("---------------------------- \n");

    }

    public void imprimir() {
        System.out.println("Nome: " + this.nomePao);
        System.out.println("Quantidade: " + this.quantidadePao);
        System.out.println("Tipo: " + this.tipoPao);
        System.out.println("---------------------------- \n");

    }
}
