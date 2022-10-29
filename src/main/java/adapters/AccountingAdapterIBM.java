package adapters;

import domain.AccountingSystem;

/**
 * @author Rodrigo Martins Pagliares
 */

public class AccountingAdapterIBM extends AccountingAdapter {

    public AccountingAdapterIBM() {
        accountingSystem = new AccountingSystem("IBM");
    }

}
