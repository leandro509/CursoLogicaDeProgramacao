/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosclasses;

/**
 *
 * @author leandro
 */
public class ItensLoja {
    
    //public - modificador de acesso
    //private - So pode ser acessado dentro da propria classe ou atraves do get e set
    //Quando defino como publico posso acessar de qualquer lugar.
    
    public String nomeProduto;
    public int quantidadeProduto = 0;
    private String fabricanteProduto; 
    
    public ItensLoja(String nProduto, int qtdProduto, String fProduto ) {
    
        System.out.println("Nome : " + nProduto);
        System.out.println("Quantidade : " + qtdProduto);
        System.out.println("Fabricante : " + fProduto);   
        System.out.println("\n--------------------------" );   
        
    }
    
    //Set - Atribuir ou mudar valores de uma variavel de uma classe
    public void setFabricanteProduto(String fabricanteProduto) {
    
        if(fabricanteProduto.equals("Apple")){
        
            System.out.println("Nao trabalhamos com os produtos desse fabricante");
            
        }else{
        
            this.fabricanteProduto = fabricanteProduto;
        
        }
        
        
    }
    
    //Get obtem os valores das variaveis / atributos de uma classe  
    public String getFabricanteProduto() {
        //return - retorna o valor do atributo nomeProduto
        return this.fabricanteProduto;
    
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
    
    
}
