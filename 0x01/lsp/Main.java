
public class Main {
	public static void main(String[] args) throws Exception {
		BankRewards card = new BankRewards();
        CreditCard creditCard = new CreditCard();

        creditCard.validate();
        creditCard.collectPayment();

        DebitCard debitCard = new DebitCard();

        debitCard.validate();
        debitCard.collectPayment();
        
        
    }
}
