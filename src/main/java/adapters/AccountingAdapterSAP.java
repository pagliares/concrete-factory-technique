package adapters;

import domain.AccountingSystem;

/**
 * @author Rodrigo Martins Pagliares
 */

public class AccountingAdapterSAP implements IAccountingAdapter {

    private AccountingSystem accountingSystem;

    public AccountingAdapterSAP() {
        accountingSystem = new AccountingSystem("SAP");
    }


    public void finishSale() {
        accountingSystem.registerSale();
    }

    public void registerTax() {
        accountingSystem.calculateTax();
    }

}
