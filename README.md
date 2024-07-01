# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

Changed Shop Title and Heading
File: mainscreen.html
Line: 14
Change: Changed the content inside <title> tag from "My Bicycle Shop" to "Little Bit Better"
File: mainscreen.html
Line: 19
Change:  Change the content inside <h1> tag from "Shop" to "Little Bit Better"

Changed the Parts Section Heading and Added Parts
File: mainscreen.html
Line: 21
Change: Changed the content inside <h1> tag from "Parts" to "Components".
File: mainscreen.html
Lines: 30-34
Change: Added the parts: “CPU”, “Motherboard”, “RAM”, “Storage” and “Power Supply”

Changed the Products Section Heading and Added Products
File: mainscreen.html
Line: 56
Change: Changed the content inside <h2> tag from “Products” to “Devices”
File: mainscreen.html
Line: 70-74
Change: Added the products: “Work Station”, “Desktop”, “Laptop”, “Gaming PC” and “Smartphone”

Commited and pushed with message "Customized the mainscreen.html file for customer shop"



D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

File: about.html
Line: Whole File
Change: Created a new file, describing the company and added button to navigate to main screen

File: AboutController.java
Line: Whole File
Change: Created a new controller to map the about URL to the template

File: mainscreen.html
Line: 75
Change: Added an “About Us” button to navigate to the about page

Committed and pushed with message "Added about page and buttons to navigate to and from the about page and main screen"



E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

File: BootStrapData.java
Line: 35
Change: Added if statement to check if part and repository are both empty

File: BootStrapData.java
Line: 36-78
Change: Added 5 sample parts and 5 sample products

Commited and pushed with message "Added sample inventory with 5 parts and products"



F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

File: mainscreen.html
Line: 93
Change: Added a "Buy Now" button

File: BuyProductController.java
Line: Whole file
Change: Created a new controller to update and delete products

File: mainscreen.html
Line: 22-24
Change: Updated file to display the message that shows if the purchase was successful or not

Committed and pushed with message "Created buy now button that updates and deletes product and displays a message showing if purchase was successful or failed"



G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

File: Parts.java
Line: 31-34
Change: Added fields for minimum and maximum inventory

File: Parts.java
Line: 44-58
Change: Updated the Part constructors to include minInv and maxInv

File: Parts.java
Line: 89-95
Change: Added getters and setters for minInv and maxInv

File: Parts.java
Line: 105
Change: Added a method to check if inventory is between min and max values

File: BootStrapData.java
Line: 41-74
Change: Added min and max inventory fields for parts of the sample inventory

File: InhousePartForm.html
Line: 24-28
Change: Added text input for minInv and maxInv

File: OuthousePartForm.html
Line: 25-29
Change: Added text input for minInv and maxInv

File: application.properties
Line: 6
Change: Renamed the database file to “task-G-completed”

File: AddInhousePartController.java
Line: 44-47
Change: Updated code to check if inventory value is between minimum and maximum values

File: AddOutsourcedPartController.java
Line: 45-48
Change: Updated code to check if inventory value is between minimum and maximum values 

Committed and pushed with message "Added fields for minimum and maximum inventory for parts, renamed database file and added method to ensure that inventory is between min and max values"



H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

File: AddInhousePartController.java
Line: 44-49
Change: Added error message when inventory goes below minimum inventory or above maximum inventory

File: AddOursourcedPartController.java
Line: 45-50
Change: Added error message when inventory goes below minimum inventory or above maximum inventory

File: EnufPartsValidator.java
Line: 36-55
Change: Added code to check if updating or adding the product will make the parts value go below the minimum value and an error message if it does

Committed and pushed with message "Added code to display error messages when inventory goes below minimum or maximum number of parts"



I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.



J.  Remove the class files for any unused validators in order to clean your code.



K.  Demonstrate professional communication in the content and presentation of your submission.
