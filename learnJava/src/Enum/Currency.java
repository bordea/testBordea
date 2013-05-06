package Enum;
// Exercise 21: (1) Create an enum of the least-valuable six types of paper currency. Loop through the values( )
// and print each value and its ordinal( ).


public class Currency {
    public enum CurrencyType {
        Pound, Euro, Dollar, Marca, Leu, Rubla
    }

    CurrencyType value;
    public Currency(CurrencyType value) {
        this.value = value;
    }

    public void describe() {
        System.out.print("Currency --> ");
        switch(value) {
            case Pound: System.out.println("The pounds is the most valuable");
                break;
            case Euro: System.out.println("The Euro is valuable");
                break;
            case Dollar: System.out.println("The Dollar is valuable enough");
                break;
            case Marca: System.out.println("Marca is not not really valuable");
                break;
            case Leu: System.out.println("Leu is not valuable");
                break;
            case Rubla: System.out.println("Rubla is the least valuable");
                break;
            default: System.out.println("TRy another currency from the enum!!!");
                break;
        }
    }

    public static void main(String[] args) {
        Currency british = new Currency(CurrencyType.Pound);
        Currency european = new Currency(CurrencyType.Euro);
        Currency american = new Currency(CurrencyType.Dollar);
        Currency german = new Currency(CurrencyType.Marca);
        Currency romanian = new Currency(CurrencyType.Leu);
        Currency russian = new Currency(CurrencyType.Rubla);

        for(CurrencyType c : CurrencyType.values()){
            System.out.println(c + " is number " + (c.ordinal()+1) + "in the currency list");
        }
    }
}
