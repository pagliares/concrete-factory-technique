package adapters;

import domain.AccountingSystem;

/**
 * @author Rodrigo Martins Pagliares
 */

public abstract class AccountingAdapter {
    protected AccountingSystem accountingSystem;

    public void finishSale() {
        accountingSystem.registerSale();
    }

    public void registerTax() {
        accountingSystem.calculateTax();
    }

}
