// EXERCICIO 3
public class Main {
    public static void main (String[]args){

        String [] marca =  {"Mercedes","Opel","Ford", "Yamaha"};
        String [] modelo = {"A1", };
        int NI =1;
        String [] Cor = {"Cinza", "Vermelho", "Cinza", "Preto"};
        double [] cilindrada = {2.0,1.6,2.0,0.7};
        boolean [] MundancasAutomaticas = {true,false,true,false};
        int [] ano = {2010,2019,2011,2019};
        int contadorCinza20 = 0;

        for (int i = 0; i < marca.length; i++) {
            if (Cor[i].equals("Cinza") && cilindrada[i] == 2.0) {
                contadorCinza20++;
                System.out.println("Encontrado o " + contadorCinza20
                        + " carro cor cinza com a cilindrada 2.0!");
            }
        }

        int contadorAno = 0;
        for (int i = 0; i < ano.length; i++) {
            if (ano[i] < 2020) {
                contadorAno++;
            }
        }

        if (contadorAno > 0) {
            System.out.println("Existem " + contadorAno + " veículos inferior a 2020");
        } else {
            System.out.println("Nenhum veículo encontrado");
        }
    }
}


