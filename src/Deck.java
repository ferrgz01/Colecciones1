import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<Card> card;
    private Integer numCard = 52;

    public List<Card> getCard() {
        return card;
    }

    public void setCard(List<Card> card) {
        this.card = card;
    }

    public Integer getNumCard() {
        return numCard;
    }

    public void setNumCard(Integer numCard) {
        this.numCard = numCard;
    }

    //Revolver las cartas
    public String mezclar() {
        Collections.shuffle(card);
        return "mezclando...";
    }
    //Primer carta del deck
    public void primerCarta(){
        Card card= getCard().get(0);
        System.out.println("{"+card.getPalo()+"}, {"+card.getColor()+"}, {"+card.getValor()+"}");
        this.card.remove(0);
        System.out.println("Quedan {"+getCard().size()+"}");
    }

    //Carta al azar
    public void random(){
        Random random = new Random();
        int numRandom=random.nextInt(getCard().size());
        Card card = getCard().get(numRandom);
        System.out.println("{"+card.getPalo()+"}, {"+card.getColor()+"}, {"+card.getValor()+"}");
        this.card.remove(numRandom);
        System.out.println("Quedan {"+getCard().size()+"}");

    }

    //Mano de cartas
    public void mano(){
        for (int i =0; i<5;i++ ){
            Random random = new Random();
            int numRandom=random.nextInt(getCard().size());
            Card card = getCard().get(numRandom);
            System.out.println("{"+card.getPalo()+"}, {"+card.getColor()+"}, {"+card.getValor()+"}");
            this.card.remove(numRandom);

        }
        System.out.println("Quedan {"+getCard().size()+"}");
    }



}