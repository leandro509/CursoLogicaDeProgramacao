import javax.swing.JOptionPane;

public class UrnaEletronica {
    public static void main(String[] args) {

        String candidato1;
        String candidato2;
        String candidato3;

        

        int votos;
        int votosCd1 = 0;
        int votosCd2 = 0;
        int votosCd3 = 0;

        candidato1 = JOptionPane.showInputDialog("Digite o nome do candidato 1");
        candidato2 = JOptionPane.showInputDialog("Digite o nome do candidato 2");
        candidato3 = JOptionPane.showInputDialog("Digite o nome do candidato 3");

        System.out.println("candidato 1: " + candidato1 + "\n" + "candidato 2: " + candidato2 + "\n" + "candidato 3: "
                + candidato3);

        do {

            

            

            

            

            votos = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do seu candidato para votar!"));

            switch (votos) {

                case 1:
                    System.out.println("Voce votou no candidato: " + candidato1);
                    votosCd1++;
                    break;

                case 2:
                    votosCd2++;
                    System.out.println("Voce votou no candidato: " + candidato2);
                    break;

                case 3:
                    votosCd3++;
                    System.out.println("Voce votou no candidato: " + candidato3);
                    break;

                default:

                    if(votos != 0)
                    System.out.println("Numero de candidato invalido!");
                    break;

            }

        } while (votos != 0);

        System.out.println("O candidato " + candidato1 + " recebeu " + votosCd1 + " votos");
        System.out.println("O candidato " + candidato2 + " recebeu " + votosCd2 + " votos");
        System.out.println("O candidato " + candidato3 + " recebeu " + votosCd3 + " votos");

        if (votosCd1 > votosCd2 && votosCd1 > votosCd3) {

            System.out.println("O candidato 1 foi o vencedor com " + votosCd1 + " votos!");

        } else if (votosCd2 > votosCd1 && votosCd2 > votosCd3) {

            System.out.println("O candidato 2 foi o vencedor com " + votosCd2 + " votos!");

        } else if (votosCd3 > votosCd1 && votosCd3 > votosCd2) {

            System.out.println("O candidato 3 foi o vencedor com " + votosCd3 + " votos!");

        } else {

            System.out.println("Nenhum ganhador foi definido!");

        }
    }
}
