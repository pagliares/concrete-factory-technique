package adapters;

import service.InventorySystem;

/**
 * @author Rodrigo Martins Pagliares
 */

public class InventoryAdapterIBM extends InventoryAdapter {

    public InventoryAdapterIBM() {
        inventorySystem = new InventorySystem("IBM");
    }
}

