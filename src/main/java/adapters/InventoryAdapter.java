package adapters;

import service.InventorySystem;

/**
 * @author Rodrigo Martins Pagliares
 */

public abstract class InventoryAdapter {
    protected InventorySystem inventorySystem;
    public void decreaseItemQuantity() {
        inventorySystem.decrease();
    }

    public void updateInventoryQuantity() {
        inventorySystem.update();
    }

}
