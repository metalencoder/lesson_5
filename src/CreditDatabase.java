import java.util.HashMap;
import java.util.Map;

public class CreditDatabase extends CreditCard {
    public CreditDatabase(String accountNumber, Double currentOfMoney) {
        super(accountNumber, currentOfMoney);
    }

    public CreditDatabase() {

    }
    Map<String,Double> mapOfCredits = new HashMap<String,Double>();

    public  Map<String,Double> addMapOfCredits(CreditCard creditCard){
        mapOfCredits.put(creditCard.getAccountNumber(),creditCard.getCurrentOfMoney());
        return mapOfCredits;
    }

    public void showCreditDatabase(){
        for(Map.Entry<String, Double> item : mapOfCredits.entrySet()){

            System.out.println("Номер карты: " + item.getKey() + " " + "Текущий счет: " + item.getValue());
        }
    }

}
