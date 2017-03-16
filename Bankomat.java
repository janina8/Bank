import java.util.Scanner;


public class Bankomat {
  
    Scanner sc = new Scanner(System.in); 

    public static void menu(CC card) {
        System.out.println("1.Проверить баланс. 2. Что-то еще.");
        int i = sc.nextInt(); 
        if (i == 1) {
            System.out.println(card.getBalance());
        } else {
            System.out.println("Вернуть карту.");
        }
    }

    void insertCard(CC card) {

        if (card.getCardBlocked()) {
            System.out.println("Карта блокирована. Чтобы разблокировать звоните в банк.");
            return;

            System.out.println("Введите пин код");
        }

        int pin = sc.nextInt(); 
        int popitka = 3;

        if (pin == card.getCardPin()) {
            System.out.println("Правильно. Иди в меню.");
            menu(card); 
            int popitki = 3;

            do {
                System.out.println("Введите пин код");
                int pin = sc.nextInt();
                if (pin != card.getCardPin) {
                    popitki - 1;
                    if (popitki > 0) {
                        System.out.println("Вы ввели дичь. Осталось: " + popitki);
                    }
                } else {
                    System.out.println("Вы ошиблись, в очередной раз. Карта заблокирована.");
                    return;
                }


            }
        }
    }
}


    void getCard(CC card) { 

    }

    void putMoney() { 

    }

    void takeMoney() { 

    }

    int addPin(int a) {
        int b;
        return a;
    }
}
               
