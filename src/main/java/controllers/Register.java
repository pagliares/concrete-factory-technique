package controllers;


import adapters.*;

/**
 * @author Rodrigo Martins Pagliares
 */
public class Register {
    private InventoryAdapter inventoryAdapter;
    private AccountingAdapter accountingAdapter;
    private AdapterFactory factory;

    public Register() {
        System.out.println("Register Controller Created \n");
        factory = AdapterFactory.getInstance();
    }

    public void createAccountingAdapter(String name){
        accountingAdapter = factory.createAccountingAdapter(name);
    }

    public void createInventoryAdapter(String name){
        inventoryAdapter = factory.createInventoryAdapter(name);
    }

    public void decreaseItemQuantity() {
        inventoryAdapter.decreaseItemQuantity();
    }

    public void registerSaleAtAccountingSystem() {
        accountingAdapter.finishSale();
    }

}
