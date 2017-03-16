public class CC {

    private String owner;
    private int cardNumber;
    private String currency;
    private double balance;
    private int cardPin;
    private  boolean cardBlocked;

    public String getOwner() {
        return owner;
    }

    public int getcardNumber() {
        return cardNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public double getBalance() {
        return balance;
    }

    public int getCardPin() {
        return cardPin;
    }

    public boolean getCardBlocked() {
        return cardBlocked;
    }


    public CC(String owner, int cardNumber, String currency, double balance, int cardPin, boolean cardBlocked) {
        this.owner = owner;
        this.cardNumber = cardNumber;
        this.currency = currency;
        this.balance = balance;
        this.cardPin = cardPin;
        this.cardBlocked = cardBlocked;

    }

}
