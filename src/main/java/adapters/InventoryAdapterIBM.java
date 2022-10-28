package adapters;

import service.InventorySystem;

/**
 * @author Rodrigo Martins Pagliares
 */

public class InventoryAdapterIBM implements IInventoryAdapter {
    private InventorySystem inventorySystem;

    public InventoryAdapterIBM() {
        inventorySystem = new InventorySystem("IBM");
    }

    public void decreaseItemQuantity() {
        inventorySystem.decrease();
    }

    public void updateInventoryQuantity() {
        inventorySystem.update();
    }



}
