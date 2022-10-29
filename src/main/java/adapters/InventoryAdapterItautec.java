package adapters;

import service.InventorySystem;

/**
 * @author Rodrigo Martins Pagliares
 */

public class InventoryAdapterItautec extends InventoryAdapter {

    public InventoryAdapterItautec() {
        inventorySystem = new InventorySystem("Itautec");
    }
}
