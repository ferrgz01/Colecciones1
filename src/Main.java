import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Deck deck = new Deck();
    public static int opc=0;
    public static boolean fin = false;


    public static void main(String[] args) {


        String[] palo = {"Pika", "Corazon", "Diamante", "Trebol"};
        String[] valor = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        Integer cont = 1;
        deck.setCard(new ArrayList<Card>());
        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < valor.length; j++) {
                Card card = new Card(palo[i], getColor(palo[i]), valor[j]);
                deck.getCard().add(card);
            }

        }
        System.out.println("Bienvenido a Poker!");

while (fin == false){
    try {
        showMenu();
    } catch (Exception e) {
        System.out.println("Opción no válida");
        fin = false;
    }
}
    }




    public static void showMenu() throws Exception {
        Scanner sn = new Scanner(System.in);



            while (fin != true){
                System.out.println("\nSelecciona una opción:");
                System.out.println("1 Mezclar deck");
                System.out.println("2 Sacar una carta");
                System.out.println("3 Carta al azar");
                System.out.println("4 Generar una mano de 5 cartas");
                System.out.println("0 Salir");

                opc = sn.nextInt();

                switch (opc) {
                    case 1:
                        System.out.println(deck.mezclar());
                        break;
                    case 2:

                        try {
                            System.out.println("\nPrimer carta del deck: ");
                            deck.primerCarta();
                        } catch (Exception e){
                            System.out.println(e.getMessage());
                            fin = true;

                            }


                        break;
                    case 3:
                        try {
                            System.out.println("\nCarta al azar: ");
                            deck.random();
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                            fin = true;
                        }

                        break;
                    case 4:
                        try {
                            System.out.println("\nMano de 5 cartas: ");
                            deck.mano();
                        } catch (Exception e){
                            System.out.println(e.getMessage());
                            fin=true;
                        }

                        break;
                    case 0:
                        fin = true;
                        break;

                    default:
                        System.out.println("Opción no válida");
                }
            }


    }


    public static String getColor(String palo) {
        if (palo.equalsIgnoreCase("pika") || palo.equalsIgnoreCase("trebol")) {
            return "negro";
        }
        if (palo.equalsIgnoreCase("corazon") || palo.equalsIgnoreCase("diamante")) {
            return "rojo";
        }

        return null;
    }

}
