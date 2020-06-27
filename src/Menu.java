import java.util.*;

public class Menu {

    private static List<MenuItem> menuItemList = new ArrayList<>();

    public static void main(String[] args) {
        MenuItem garden_salad = new MenuItem("Garden Salad", 8.5, "lettuce and dressing of choice");
        menuItemList.add(garden_salad);
        MenuItem grilled_chicken = new MenuItem("Grilled Chicken", 11.0, "grilled chicken");
        menuItemList.add(grilled_chicken);
        MenuItem brownie = new MenuItem("Brownie", 5.5, "brownie with or without walnuts");
        menuItemList.add(brownie);

        printMenu(menuItemList);
    }

    private static void printMenu(List<MenuItem> menu){
        for(MenuItem item : menu){
            System.out.println("*****");
            System.out.println(item.getName());
            System.out.println("--------------------");
            System.out.println("$" + item.getPrice() + "0");
            System.out.println("Our best " + item.getDescription() + " made to order.");
            System.out.println("*****");
        }
    }

}

/*
The menu consists of several menu items
Each menu item has a price, description, and category (appetizer, main course, or dessert)
It should be possible to display whether a menu item is new or not
The app should know when the menu was last updated, so visitors can see that the restaurant
is constantly changing and adding exciting new items
In IntelliJ, create a new project, Restaurant Menu. Within the project, create a new package
named restaurant. Add the Menu and MenuItem classes and code the design that you created above.
Be sure to add getters and setters as appropriate.
 */