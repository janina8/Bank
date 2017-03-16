public class TEST {
    public static void main(String[] args) {
        CC card = new CC("Пися Камушкин", 110110110, "euro", 666, 12345, false);


        Bankomat bankomat = new Bankomat();


        bankomat.insertCard(card);



    }
}


