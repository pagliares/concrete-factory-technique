package controllers;

import adapters.*;

/**
 * @author Rodrigo Martins Pagliares
 */
public class InventoryController {

    private InventoryAdapter inventoryAdapter;
    private AdapterFactory factory;

    public InventoryController() {
        System.out.println("Inventory Controller Created \n");
        factory = AdapterFactory.getInstance();
    }

    public void createInventoryAdapter(String name) {
        inventoryAdapter = factory.createInventoryAdapter(name);
    }

    public void updateInventory() {
        inventoryAdapter.updateInventoryQuantity();
    }
}