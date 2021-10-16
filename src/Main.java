import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] palo = {"Pika", "Corazon", "Diamante", "Trebol"};
        String[] valor = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        Integer cont = 1;
        Deck deck = new Deck();
        deck.setCard(new ArrayList<Card>());
        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < valor.length; j++) {
                Card card = new Card(palo[i], getColor(palo[i]), valor[j]);
                deck.getCard().add(card);
            }

        }
        System.out.println("El tamaño del deck es:" + deck.getCard().size());
        System.out.println("Mezclar Deck\n" + deck.mezclar());
        System.out.println("\nPrimer carta del deck: ");
        deck.primerCarta();
        System.out.println("\nCarta al azar: ");
        deck.random();
        System.out.println("\nMano de 5 cartas: ");
        deck.mano();


    }

    public static String getColor(String palo) {
        if (palo.toLowerCase().equals("pika") || palo.toLowerCase().equals("trebol")) {
            return "negro";
        }
        if (palo.toLowerCase().equals("corazon") || palo.toLowerCase().equals("diamante")) {
            return "rojo";
        }

        return null;
    }

}
