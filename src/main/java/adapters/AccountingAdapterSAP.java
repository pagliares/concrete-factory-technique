package adapters;

import domain.AccountingSystem;

/**
 * @author Rodrigo Martins Pagliares
 */

public class AccountingAdapterSAP extends AccountingAdapter {

    public AccountingAdapterSAP() {
        accountingSystem = new AccountingSystem("SAP");
    }

}