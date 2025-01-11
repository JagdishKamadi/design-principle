package problem;

public class ShoppingMall {
    private DebitCard debitCard;

    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void doPayment(Object order, int amount) {
        debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(debitCard);
        shoppingMall.doPayment("some order", 5000);
    }
}

/**
 * if you observe this is wrong design of coding, now ShoppingMall class tightly coupled with DebitCard
 * now there is some error in your debit card and user want to go with Credit card then this won’t be
 * possible because ShoppingMall is tightly couple with Debit Card
 * we can do that, remove Debit card from constructor and inject CreditCard. which not good approach
 * to write code
 * because to follow DIP we need to design our application in such a way so that my shopping mall payment
 * system should accept any type of ATM Card (it shouldn’t care whether it is debit or credit card)
 */