import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Созданные карты: ");
        CreditDatabase creditDatabase = new CreditDatabase();
        CreditCard creditCard_1 = new CreditCard("AB30254563", 120.0);
        CreditCard creditCard_2 = new CreditCard("AB30254423", 100.0);
        CreditCard creditCard_3 = new CreditCard("AB30453563", 80.0);
        while (true) {
            creditDatabase.addMapOfCredits(creditCard_1);
            creditDatabase.addMapOfCredits(creditCard_2);
            creditDatabase.addMapOfCredits(creditCard_3);
            creditDatabase.showCreditDatabase();
            System.out.println("Выберите карту (1,2,3)");
            switch (scanner.nextLine()) {
                case "1":
                    creditCard_2.showInfoOfCards("AB30254563", creditCard_2.addMoneyOfCredit());
                    break;
                case "2":
                    creditCard_1.showInfoOfCards("AB30254423", creditCard_1.addMoneyOfCredit());
                    break;
                case "3":
                    creditCard_3.showInfoOfCards("AB30453563", creditCard_3.takeCurrentOfMoney());
                    break;
            }

        }
    }
}