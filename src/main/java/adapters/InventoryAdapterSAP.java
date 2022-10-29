package adapters;

import service.InventorySystem;

/**
 * @author Rodrigo Martins Pagliares
 */

public class InventoryAdapterSAP extends InventoryAdapter {

    public InventoryAdapterSAP() {
        inventorySystem = new InventorySystem("SAP");
    }
}
