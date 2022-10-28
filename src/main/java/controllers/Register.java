package controllers;


import adapters.*;

/**
 * @author Rodrigo Martins Pagliares
 */
public class Register {
    private IInventoryAdapter inventoryAdapter;
    private IAccountingAdapter accountingAdapter;

    public Register() {
        System.out.println("Register Controller Created \n");
    }

    public void createAccountingAdapter(String name){
        if (name.equals("IBM")) {
            accountingAdapter = new AccountingAdapterIBM();
        } else if (name.equals("Itautec")){
            accountingAdapter = new AccountingAdapterItautec();
        }
    }

    public void createInventoryAdapter(String name){
        if (name.equals("IBM")) {
            inventoryAdapter = new InventoryAdapterIBM();
        } else if (name.equals("Itautec")){
            inventoryAdapter = new InventoryAdapterItautec();
        }
    }

    public void decreaseItemQuantity() {
        inventoryAdapter.decreaseItemQuantity();
    }

    public void registerSaleAtAccountingSystem() {
        accountingAdapter.finishSale();
    }

}
