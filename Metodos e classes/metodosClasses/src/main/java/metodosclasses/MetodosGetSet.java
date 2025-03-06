/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosclasses;

/**
 *
 * @author leandro
 */
public class MetodosGetSet {
    public static void main(String[] args) {
        
        //Instanciando - usando todas as propriedades e tudo que tem na classe
        ItensLoja produto1 = new ItensLoja("Celular", 50, "Motorola");
        
        //Aqui podemos alterar o valor do atributos de fora da classe 
        //por que ele esta definido como public
        produto1.nomeProduto = "Sapato";
        produto1.quantidadeProduto = 30;
        
        
        System.out.println(produto1.nomeProduto);
        System.out.println(produto1.quantidadeProduto);
        
        //Para alterar o valor private precisamos alterar pelo metodo set
        produto1.setFabricanteProduto("Apple");
        
        //Para acessar os itens de um atributo private fora 
        //da classe, precisamos usar o get
        System.out.println(produto1.getFabricanteProduto());
        
        
    }
        
    
    
}
