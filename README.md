# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

File: mainscreen.html
Line: 14
Change: Changed the content inside <title> tag from "My Bicycle Shop" to "Little Bit Better"

File: mainscreen.html
Line: 19
Change:  Change the content inside <h1> tag from "Shop" to "Little Bit Better"

File: mainscreen.html
Line: 21
Change: Changed the content inside <h1> tag from "Parts" to "Components".

File: mainscreen.html
Lines: 30-34
Change: Added the parts: “CPU”, “Motherboard”, “RAM”, “Storage” and “Power Supply”

File: mainscreen.html
Line: 56
Change: Changed the content inside <h2> tag from “Products” to “Devices”

File: mainscreen.html
Line: 70-74
Change: Added the products: “Work Station”, “Desktop”, “Laptop”, “Gaming PC” and “Smartphone”

Commited and pushed with message "Customized the mainscreen.html file for customer shop"



Task D -

Prompt: Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation.

File: src/main/resources/templates/about.html
Line: Whole File
Change: Created a new HTML file to describe the company and added links for navigation

File: src/main/java/com.example.demo/controllers/AboutController.java
Line: Whole File
Change: Created a new controller to map the about URL to the template

File: src/main/resources/templates/mainscreen.html
Line: 80    
Change: Added an “About Us” button to navigate to the about page



Task E -

Prompt: Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

File: src/main/java/com.example.demo/bootstrap/BootStrapData.java
Line: 35
Change: Added an if statement to check if part and product repository are both empty and add the sample data if they are

File: src/main/java/com.example.demo/bootstrap/BootStrapData.java
Line: 36-42
Change: Created a new "CPU" part with sample values for price, inventory, id, minimum inventory and maximum inventory

File: src/main/java/com.example.demo/bootstrap/BootStrapData.java
Line: 44-50
Change: Created a new "Motherboard" part with sample values for price, inventory, id, minimum inventory and maximum inventory

File: src/main/java/com.example.demo/bootstrap/BootStrapData.java
Line: 52-58
Change: Created a new "RAM" part with sample values for price, inventory, id, minimum inventory and maximum inventory

File: src/main/java/com.example.demo/bootstrap/BootStrapData.java
Line: 60-66
Change: Created a new "Storage" part with sample values for price, inventory, id, minimum inventory and maximum inventory

File: src/main/java/com.example.demo/bootstrap/BootStrapData.java
Line: 68-74
Change: Created a new "GPU" part with sample values for price, inventory, id, minimum inventory and maximum inventory

File: src/main/java/com.example.demo/bootstrap/BootStrapData.java
Line: 76-80
Change: Save each new object to the database

File: src/main/java/com.example.demo/bootstrap/BootStrapData.java
Line: 82
Change: Created a new "Work Station" product with sample values for price and inventory

File: src/main/java/com.example.demo/bootstrap/BootStrapData.java
Line: 83
Change: Created a new "Desktop" product with sample values for price and inventory

File: src/main/java/com.example.demo/bootstrap/BootStrapData.java
Line: 84
Change: Created a new "Laptop" product with sample values for price and inventory

File: src/main/java/com.example.demo/bootstrap/BootStrapData.java
Line: 85
Change: Created a new "Gaming PC" product with sample values for price and inventory

File: src/main/java/com.example.demo/bootstrap/BootStrapData.java
Line: 86
Change: Created a new "Smartphone" product with sample values for price and inventory

File: src/main/java/com.example.demo/bootstrap/BootStrapData.java
Line: 88-92
Change: Save each new object to the database



Task F -

Prompt: Add a “Buy Now” button to your product list that update and delete products. Display a message that indicates the status of a purchase.

File: src/main/resources/templates/mainscreen.html
Line: 93
Change: Added a "Buy Now" button

File: src/main/java/com.example.demo/controllers/BuyProductController.java
Line: Whole file
Change: Created a new controller to control buy now functionality, update product inventory and display the status message of a purchase

File: src/main/resources/templates/mainscreen.html
Line: 22-24
Change: Updated file to display the message that shows if the purchase was successful or not



Task G -

Prompt: Modify the parts to track maximum and minimum inventory so the user can set values and code to enforce that the inventory is between those values. Rename the file the persistent storage is saved to.

File: src/main/java/com.example.demo/domain/Part.java
Line: 31-34
Change: Added fields for minimum and maximum inventory

File: src/main/java/com.example.demo/domainPart.java
Line: 44-58
Change: Updated the Part constructors to include minInv and maxInv

File: src/main/java/com.example.demo/domainPart.java
Line: 89-95
Change: Added getters and setters for minInv and maxInv

File: src/main/java/com.example.demo/domain/Part.java
Line: 105
Change: Added a method to check if inventory is between min and max values

File: src/main/java/com.example.demo/bootstrap/BootStrapData.java
Line: 41-74
Change: Added min and max inventory fields for parts of the sample inventory

File: src/main/resources/templates/InhousePartForm.html
Line: 24-28
Change: Added text input for minInv and maxInv

File: src/main/resources/templates/OuthousePartForm.html
Line: 25-29
Change: Added text input for minInv and maxInv

File: src/main/resources/templates/application.properties
Line: 6
Change: Renamed the database file to “task-G-completed”

File: src/main/java/com.example.demo/controllers/AddInhousePartController.java
Line: 44-47
Change: Updated code to check if inventory value is between minimum and maximum values

File: src/main/java/com.example.demo/controllers/AddOutsourcedPartController.java
Line: 45-48
Change: Updated code to check if inventory value is between minimum and maximum values 

File: src/main/resources/templates/mainscreen.html
Line: 40
Change: Added an "Add Outsourced Part" button

File: src/main/java/com.example.demo/controllers/AddOutsourcedPartController.java
Line: 35
Change: Changed class from Part to OutsourcedPart

File: src/main/java/com.example.demo/controllers/AddOutsourcedPartController.java
Line: 40
Change: Corrected the URL mapping in PostMapping to the proper one

File: src/main/java/com.example.demo/controllers/AddOutsourcedPartController.java
Line: 49
Change: Deleted a space typo in error message

File: src/main/resources/templates/OutsourcedPartForm.html
Line: 12
Change: Corrected the action URL field to proper one

File: src/main/resources/templates/OutsourcedPartForm.html
Line: 26 and 29
Change: Fixed the "Error" typo for the fields method



Task H -

Prompt: Add validation for the maximum and minimum fields. Display error messages for each error scenario.

File: src/main/java/com.example.demo/controllers/AddInhousePartController.java
Line: 44-49
Change: Added error message when inventory goes below minimum inventory or above maximum inventory

File: src/main/java/com.example.demo/controllers/AddOursourcedPartController.java
Line: 45-50
Change: Added error message when inventory goes below minimum inventory or above maximum inventory

File: src/main/java/com.example.demo/validators/EnufPartsValidator.java
Line: 36-55
Change: Added code to check if updating or adding the product will make the parts value go below the minimum value and an error message if it does

File: src/main/java/com.example.demo/controllers/AddInhousePartController.java
Line: 39
Change: Corrected the URL mapping in PostMapping to the proper one

File: src/main/java/com.example.demo/controllers/AddInhousePartController.java
Line: 48
Change: Added a period in the error message

File: src/main/resources/templates/InhousePartForm.html
Line: 11
Change: Corrected the action URL field to proper one

File: src/main/java/com.example.demo/controllers/AddProductController.java
Line: 80
Change: Created a new variable "invDifference" to calculate the difference between the new and current product inventory value to determine how much the inventory needs to be adjusted

File: src/main/resources/templates/AddProductController.java
Line: 82
Change: Created a new variable "newPartInventory" to calculate the new inventory value for each part associated with a product when the product inventory is updated

File: src/main/java/com.example.demo/controllers/AddProductController.java
Line: 82-86
Change: Made a loop going over each part associated with the current product to ensure that any parts new inventory that falls below the minimum inventory value will display an error message instead

File: src/main/resources/templates/AddProductController.java
Line: 87-93
Change: Created a new empty list for parts that are available for association with the current product and added a loop to help avoid duplicating the parts by only adding parts that are not associated with the current product

File: src/main/resources/templates/AddProductController.java
Line: 96-99
Change: Added a condition to check if the inventory difference value is positive and to decrease the inventory of the associated parts if the product inventory is increased and save those changes to the database if it is.



Task I -

Prompt: Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

File: src/test/java/com.example/demo/domain/PartTest.java
Line: 160-194
Change:  Added code to ensure that the methods for the minimum and maximum inventory works properly



Task J -

Prompt: Remove the class files for any unused validators in order to clean your code.

File: src/main/java/com.example.demo/validators/DeletePartValidator.java
Line: Whole file
Change: Deleted the entire file to clean up project code