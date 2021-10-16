public class Card {

    //Atributos de una carta
    private String palo;
    private String color;
    private String valor;


    //Dónde se van a poner
    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    public Card() {

    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public String getValor(){
        return valor;
    }
    public void setValor(String valor){
        this.valor=valor;
    }
}
