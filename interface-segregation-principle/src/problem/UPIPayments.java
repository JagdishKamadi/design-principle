package problem;

/**
 * Now let’s talk about few implementation for UPIPayments like Google Pay and Paytm
 * Google Pay support these features, so he can directly implement this UPIPayments but
 * Paytm doesn’t support getCashBackAsCreditBalance() feature so here we shouldn’t force client paytm
 * to override this method by implementating UPIPayments .
 * we need to segregate interface based on client need
 */
public interface UPIPayments {

    public void payMoney();

    public void getScratchCard();

    public void getCashBackAsCreditBalance();
}