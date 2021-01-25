## Food Truck Project
<img src = "http://clipart-library.com/images_k/food-truck-transparent/food-truck-transparent-1.png" alt="image of generic food truck" />

### Description
Users will input and rate a list of up to 5 food trucks. Then the user interacts with a menu to able view this list of all the trucks that were input, the average rating of the trucks, and the highest-rated truck.

Structure
Each FoodTruck object has the fields for a unique numeric id, a name ("TacoRific", "Mediterranean Medic", etc.), food type ("Tacos", "Falafel", etc.), and a numeric rating.

There is a separate class with a main method that starts the program. It will has an array to store up to five FoodTruck objects. The main method of this class is the only static method in the entire project.

--- 

### Topics and Technologies Used
<ul>
    <li>Object Oriented Programming - used a UML class diagram to plan out two classes and their interactions. A combination of strategic private fields, public getting/setting methods, and toStrings allowed for objects to be created and interacted with in insulated ways. 
        <ul>
            <li>UML - Before any coding began, the two classes used within the program were planned out with the details of visibility, attributes, and methods. The association between the two classes was also included within the diagram.</li>
            <li>Encapsulation - Constructors were used to give data to each Food Truck object's fields. An auto-incrementing static Truck Id field was used to assign each truck object a unique id. </li>
            <li>Visibility - All fields were kept private, getting and setting public methods were used to access object's field information. All getting and setting methods were used within larger methods outside of the main block to insulate fields from users.</li>
        </ul>
    </li>
    <li>Arrays - The Food Truck application used an array of Food Trucks to store information.</li>
    <li>Conditionals - Within the menus, boolean while loops were used to keep the prompts running until the "exit" keyword was used. A switch statement was used to run through the menu input options to call methods to produce the correct out put. </li>
</ul>

---

### How to Run
Run the application from the FoodTruckApp.java file.

---

### Lessons Learned
While creating the method to calculate the average of the input, I needed to exclude any null value Food Truck objects from my calculations. I also ran into formatting issues with my printf statements. I was trying to use %d, thinking that was for a double however it would only run when I used the %f call. I ran into a similar issue with my printf statement for the method used to print the highest rated truck. Where I was expecting to use the %i for my integar value of the rating, it would only run when I used the %d call. While troubleshooting both of those methods, I really appreciated the compiler's detailed error messages that pointed me to the exact problem. 
