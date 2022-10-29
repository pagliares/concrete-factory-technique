package adapters;

import domain.AccountingSystem;

/**
 * @author Rodrigo Martins Pagliares
 */

public class AccountingAdapterItautec extends AccountingAdapter {

    public AccountingAdapterItautec() {
        accountingSystem = new AccountingSystem("Itautec");
    }

}
