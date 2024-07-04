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

Committed and pushed with message "Added about page and buttons to navigate to and from the about page and main screen"



Task E -

Prompt: Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

File: src/main/java/com.example.demo/bootstrap/BootStrapData.java
Line: 35
Change: Added if statement to check if part and repository are both empty

File: src/main/java/com.example.demo/bootstrap/BootStrapData.java
Line: 36-78
Change: Added 5 sample parts and 5 sample products

Commited and pushed with message "Added sample inventory with 5 parts and products"




Task F -

Prompt: Add a “Buy Now” button to your product list that update and delete products. Display a message that indicates the status of a purchase.

File: src/main/resources/templates/mainscreen.html
Line: 93
Change: Added a "Buy Now" button

File: src/main/java/com.example.demo/controllers/BuyProductController.java
Line: Whole file
Change: Created a new controller to update and delete products

File: src/main/resources/templates/mainscreen.html
Line: 22-24
Change: Updated file to display the message that shows if the purchase was successful or not

Committed and pushed with message "Created buy now button that updates and deletes product and displays a message showing if purchase was successful or failed"



Task G -

Prompt: Modify the parts to track maximum and minimum inventory so the user can set values and code to enforce that the inventory is between those values. Rename the file the persistent storage is saved to.

File: src/main/java/com.example.demo/domain/Part.java
Line: 31-34
Change: Added fields for minimum and maximum inventory

File: src/main/java/com.example.demo/domainPart.java
Line: 44-58
Change: Updated the Part constructors to include minInv and maxInv

File: src/main/java/com.example.demo//domainPart.java
Line: 89-95
Change: Added getters and setters for minInv and maxInv

File: src/main/java/com.example.demo//domain/Part.java
Line: 105
Change: Added a method to check if inventory is between min and max values

File: src/main/java/com.example.demo//bootstrap/BootStrapData.java
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

File: src/main/java/com.example.demo//controllers/AddOutsourcedPartController.java
Line: 45-48
Change: Updated code to check if inventory value is between minimum and maximum values 

File: src/main/resources/templates/mainscreen.html
Line: 40
Change: Added an "Add Outsourced Part" button

Committed and pushed with message "Added fields for minimum and maximum inventory for parts, renamed database file and added method to ensure that inventory is between min and max values"



Task H -

Prompt: Add validation for the maximum and minimum fields. Display error messages for each error scenario.

File: src/main/java/com.example.demo/controllersAddInhousePartController.java
Line: 44-49
Change: Added error message when inventory goes below minimum inventory or above maximum inventory

File: src/main/java/com.example.demo/controllers/AddOursourcedPartController.java
Line: 45-50
Change: Added error message when inventory goes below minimum inventory or above maximum inventory

File: src/main/java/com.example.demo/validators/EnufPartsValidator.java
Line: 36-55
Change: Added code to check if updating or adding the product will make the parts value go below the minimum value and an error message if it does

Committed and pushed with message "Added code to display error messages when inventory goes below minimum or maximum number of parts"



Task I -

Prompt: Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

File: src/test/java/com.example/demo/domain/PartTest.java
Line: 160-194
Change:  Added code to ensure that the methods for the minimum and maximum inventory works properly

Committed and pushed with message “Tested two unit tests to see if the setter and getter methods for min and max inventory code works correctly”



Task J -

Prompt: Remove the class files for any unused validators in order to clean your code.

File: src/main/java/com.example.demo/validators/DeletePartValidator.java
Line: Whole file
Change: Deleted the entire file to clean up project code

Committed and pushed with message “Removed the DeletePartValidator.java file as it had no usages in the project file”