package adapters;

import domain.AccountingSystem;

/**
 * @author Rodrigo Martins Pagliares
 */

public class AccountingAdapterIBM implements IAccountingAdapter {
    private AccountingSystem accountingSystem;

    public AccountingAdapterIBM() {
        accountingSystem = new AccountingSystem("IBM");
    }



    public void finishSale() {
        accountingSystem.registerSale();
    }

    public void registerTax() {
        accountingSystem.calculateTax();
    }

}
