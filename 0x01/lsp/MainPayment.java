

public class MainPayment {

	public static void main(String[] args) throws Exception {
		CreditCard creditCard = new CreditCard();

        creditCard.validate();
        creditCard.collectPayment();

        DebitCard debitCard = new DebitCard();

        debitCard.validate();
        debitCard.collectPayment();
        
        BankRewards rewards = new BankRewards();
        rewards.validate();
        rewards.collectPayment();

	}

}
