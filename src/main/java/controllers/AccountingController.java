package controllers;

import adapters.AccountingAdapterIBM;
import adapters.AccountingAdapterItautec;
import adapters.AccountingAdapterSAP;
import adapters.IAccountingAdapter;

/**
 * @author Rodrigo Martins Pagliares
 */

public class AccountingController {
    private IAccountingAdapter accountingAdapter;

    public AccountingController() {
        System.out.println("Accounting Controller Created");
    }

    public void createAccountingAdapter(String name) {
        if (name.equals("IBM")) {
            accountingAdapter = new AccountingAdapterIBM();
        } else if (name.equals("Itautec")) {
            accountingAdapter = new AccountingAdapterItautec();
        } else if (name.equals("SAP")){
            accountingAdapter = new AccountingAdapterSAP();
        }
    }

    public void calculateTax() {
        accountingAdapter.registerTax();
    }



}
