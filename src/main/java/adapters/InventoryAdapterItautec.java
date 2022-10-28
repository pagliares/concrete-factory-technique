package adapters;

import service.InventorySystem;

/**
 * @author Rodrigo Martins Pagliares
 */

public class InventoryAdapterItautec implements IInventoryAdapter {
    private InventorySystem inventorySystem;

    public InventoryAdapterItautec() {
        inventorySystem = new InventorySystem("Itautec");
    }

    public void decreaseItemQuantity() {
        inventorySystem.decrease();
    }

    public void updateInventoryQuantity() {
        inventorySystem.update();
    }




    

}
