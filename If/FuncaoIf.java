public class FuncaoIf {
    public static void main(String[] args) {
        int numero = 9;
        String nome = "Ana";
        /*
            == - Igual - Equals
            != - Diferente
            > - Maior 
            < - Menor
            >= - Maior ou igual
            <= - Menor ou igual 

         */

        if(numero > 10 ) {
                System.out.println("O número é maior do que 10");
            //else - Senão
         }else { 
                System.out.println("O número é menor do que 10");
        }

         //if - Se 
        if(nome.equals("Ana") ) {
        System.out.println("O nome é : " + nome);
        //else - Senão
        }else { 
        System.out.println( "Nome inválido");
    }


}

}