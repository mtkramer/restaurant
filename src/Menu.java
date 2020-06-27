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
