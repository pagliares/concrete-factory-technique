package adapters;

import domain.AccountingSystem;

/**
 * @author Rodrigo Martins Pagliares
 */

public class AccountingAdapterItautec implements IAccountingAdapter {
    private AccountingSystem accountingSystem;

    public AccountingAdapterItautec() {
        accountingSystem = new AccountingSystem("Itautec");
    }



    public void finishSale() {
        accountingSystem.registerSale();
    }

    public void registerTax() {
        accountingSystem.calculateTax();
    }

}
