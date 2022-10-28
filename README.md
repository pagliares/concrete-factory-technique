# Concrete factory technique

Repository with examples of the Concrete Factory technique used in the classes about design principles and patterns taugh by Rodrigo Martins Pagliares at UNIFAL-MG (Computer Science Undergraduate course).

## Dependencies

The examples use two simple jar files representing external systems (one inventory and one accounting system) from different brands (IBM, ITAUTEC, SAP). They are included in the lib folder of the Maven Project presented in this repository.

Note: If you are getting the error message "Cannot resolve Symbol AccountingSystem", "Cannot resolve Symbol InventorySystem", try to include both jar files in the build path of the IDE you are using. In IntelliJ, for example, just right click the jar file and select "Adds as library" -> Project Library Level.


## Code versions
During the class, I start witn an initial working solution (with a bad solution that has high coupling) to the problem of creating several types of objects (in our example, creating adapters to communicate with external systems, but the problem of objects creation could be used in any other context of creating objects in a flexible way, minimizing coupling between components).

### 01 - Initial version (v1.0)

I flagged this initial version with the git tag named 'v1.0'. If you want you can checkout this specific version of the repository (after cloning the repository to you local machine) by issuing the command:

git checkout v1.0

### 02 - Second version (v2.0)

This version includes support for SAP inventory and accounting systems, although the solution is highly coupled (We had to update all 3 controllers to support SAP systems, duplicating the code responsible for object creation.

I flagged this second version with the git tag named 'v2.0'. If you want you can checkout this specific version of the repository (after cloning the repository to you local machine) by issuing the command:

git checkout v2.0
