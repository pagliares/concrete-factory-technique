package controllers;

/**
 * @author Rodrigo Martins Pagliares
 */

public class TestControllers {

    public static void main(String[] args) {
        testAccountingController();
        testInventoryController();
        testRegister();
    }

    public static void testRegister() {
        System.out.println("Creating the Register Controller");
        Register register = new Register();

        System.out.println("Testing the integration of Register Controller and Itautec Inventory System");
        register.createInventoryAdapter("Itautec");
        register.decreaseItemQuantity();

        System.out.println("Testing the integration of Register Controller and IBM Inventory System");
        register.createInventoryAdapter("IBM");
        register.decreaseItemQuantity();

        System.out.println("Testing the integration of Register Controller and Itautec Accounting System");
        register.createAccountingAdapter("Itautec");
        register.registerSaleAtAccountingSystem();

        System.out.println("Testing the integration of Register Controller and IBM Accounting System");
        register.createAccountingAdapter("IBM");
        register.registerSaleAtAccountingSystem();

        System.out.println("Testing the integration of Register Controller and SAP Inventory System");
        register.createInventoryAdapter("SAP");
        register.decreaseItemQuantity();

        System.out.println("Testing the integration of Register Controller and SAP Accounting System");
        register.createAccountingAdapter("SAP");
        register.registerSaleAtAccountingSystem();




    }

    public static void testInventoryController() {
        System.out.println("Creating the Inventroy Controller");
        InventoryController inventoryController = new InventoryController();

        System.out.println("Testing the integration of Inventory Controller and Itautec Inventory System");
        inventoryController.createInventoryAdapter("Itautec");
        inventoryController.updateInventory();

        System.out.println("Testing the integration of Inventory Controller and IBM Inventory System");
        inventoryController.createInventoryAdapter("IBM");
        inventoryController.updateInventory();

        System.out.println("Testing the integration of Inventory Controller and SAP Inventory System");
        inventoryController.createInventoryAdapter("SAP");
        inventoryController.updateInventory();

    }

    public static void testAccountingController() {
        System.out.println("Creating the Accounting Controller");
        AccountingController accountingController = new AccountingController();

        System.out.println("Testing the integration of Accounting Controller and Itautec Accounting System");
        accountingController.createAccountingAdapter("Itautec");
        accountingController.calculateTax();

        System.out.println("Testing the integration of Accounting Controller and IBM Accounting System");
        accountingController.createAccountingAdapter("IBM");
        accountingController.calculateTax();

        System.out.println("Testing the integration of Accounting Controller and SAP Accounting System");
        accountingController.createAccountingAdapter("SAP");
        accountingController.calculateTax();

    }
}
