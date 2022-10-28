package controllers;

import adapters.IInventoryAdapter;
import adapters.InventoryAdapterIBM;
import adapters.InventoryAdapterItautec;
import adapters.InventoryAdapterSAP;

/**
 * @author Rodrigo Martins Pagliares
 */
public class InventoryController {

    private IInventoryAdapter inventoryAdapter;

    public InventoryController() {
        System.out.println("Inventory Controller Created \n");
    }

    public void createInventoryAdapter(String name) {
        if (name.equals("IBM")) {
            inventoryAdapter = new InventoryAdapterIBM();
        } else if (name.equals("Itautec")){
            inventoryAdapter = new InventoryAdapterItautec();
        } else if (name.equals("SAP")){
            inventoryAdapter = new InventoryAdapterSAP();
        }
    }

    public void updateInventory() {
        inventoryAdapter.updateInventoryQuantity();
    }
}
