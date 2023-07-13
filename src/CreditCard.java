import java.sql.SQLOutput;
import java.util.Scanner;

public class CreditCard {

    private String accountNumber;
    private Double currentOfMoney;

    // конструктор для создания объекта кредитной карточки
    public CreditCard(String accountNumber, Double currentOfMoney) {
        this.accountNumber = accountNumber;
        this.currentOfMoney = currentOfMoney;
    }

    public CreditCard() {

    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public Double getCurrentOfMoney() {
        return currentOfMoney;
    }

    public void setCurrentOfMoney(Double currentOfMoney) {
        this.currentOfMoney = currentOfMoney;
    }
    public Double addMoneyOfCredit(){
        System.out.println("Какую сумму положить на карту: ");
        Scanner scanner = new Scanner(System.in);
        currentOfMoney+=scanner.nextDouble();
        System.out.println("Ваша сумма:");
        return currentOfMoney;
    }
    public Double takeCurrentOfMoney(){
        System.out.println("Какую сумму снять с карты: ");
        Scanner scanner = new Scanner(System.in);
        currentOfMoney-=scanner.nextDouble();
        System.out.println("Ваша сумма:");
        return currentOfMoney;
    }

    public void showInfoOfCards(String accountNumber, Double currentOfMoney){
        System.out.println("Номер вашей карты: " + accountNumber);
        System.out.println("Ваша сумма: " + currentOfMoney);
    }

}
