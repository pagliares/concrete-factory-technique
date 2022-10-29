package controllers;

import adapters.*;

/**
 * @author Rodrigo Martins Pagliares
 */

public class AccountingController {
    private AccountingAdapter accountingAdapter;
    private AdapterFactory factory;

    public AccountingController() {
        System.out.println("Accounting Controller Created");
        factory = AdapterFactory.getInstance();
    }

    public void createAccountingAdapter(String name) {
        accountingAdapter = factory.createAccountingAdapter(name);
    }

    public void calculateTax() {
        accountingAdapter.registerTax();
    }

}
