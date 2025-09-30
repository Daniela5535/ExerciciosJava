import java.util.Scanner;
public class ex2 {
        public static void main (String[]args){

            Scanner scanf = new Scanner(System.in);
            String marca;
            double cilindrada;
            String mudancas;
            int Nidentificacao;

            System.out.println("Nome do carro?");
            marca = scanf.nextLine ();
            System.out.println("Quantas cilindradas tem?");
            cilindrada = scanf.nextDouble();
            System.out.println ("Qual é a mudança do carro?");
            mudancas = scanf.next();
            System.out.println("Identificação do Carro?");
            Nidentificacao = scanf.nextInt();

            if (marca.equals("Audi") || marca.equals("BMW")){
                System.out.println("Carro alemão");
            } else {
                System.out.println("Outro fabricante");
            }
            if(cilindrada >= 2000){
                System.out.println ("Motor potente");
            }else {
                System.out.println("Motor moderado");
            }
            if(mudancas.equals("Automáticas")){
                System.out.println("Caixa automáticas");
            }else {
                System.out.println("Caixa manual");
            }

            System.out.println("O número de identificação deste carro é: " + Nidentificacao);

        }
    }




