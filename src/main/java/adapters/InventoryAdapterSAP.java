package adapters;

import service.InventorySystem;

/**
 * @author Rodrigo Martins Pagliares
 */

public class InventoryAdapterSAP implements IInventoryAdapter {

    private InventorySystem inventorySystem;

    public InventoryAdapterSAP() {
        inventorySystem = new InventorySystem("SAP");
    }

    public void decreaseItemQuantity() {
        inventorySystem.decrease();
    }

    public void updateInventoryQuantity() {
        inventorySystem.update();
    }
}
