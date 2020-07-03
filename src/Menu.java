import java.util.*;

public class Menu {

    private static Date updated = new Date();
    private static List<MenuItem> menuItemList = new ArrayList<>();

    public static void main(String[] args) {
        MenuItem garden_salad = new MenuItem("Garden Salad", 8.5, "lettuce and dressing of choice");
        MenuItem grilled_chicken = new MenuItem("Grilled Chicken", 11.0, "grilled chicken");
        MenuItem brownie = new MenuItem("Brownie", 5.5, "brownie with or without walnuts");
        addItem(garden_salad);
        addItem(grilled_chicken);
        addItem(brownie);
        addItem(brownie);

        print();
        print(brownie);
        removeItem(brownie);
        print();
    }

    public static void print(MenuItem item){
        System.out.println("\nSearching for " + item.getName() + "...");
        if(menuItemList.contains(item)){
            System.out.println("--------------------");
            if (item.getJustIn()) {
                System.out.println("NEW!");
            }
            System.out.println(item.getName().toUpperCase() + "  $" + item.getPrice() + "0");
            System.out.println("Our best " + item.getDescription() + " made to order.");
            System.out.println("--------------------\n");
        } else {
            System.out.println("Unable to find " + item + " on the menu");
        }
    }

    public static void print(){
        System.out.println();

        for (MenuItem item : menuItemList){
            if (item.getJustIn()) {
                System.out.println("We have some new items for you!");
                System.out.println();
                break;
            }
        }

        for(MenuItem item : menuItemList){
            System.out.println("--------------------");
            if (item.getJustIn()) {
                System.out.println("NEW!");
            }
            System.out.println(item.getName().toUpperCase() + "  $" + item.getPrice() + "0");
            System.out.println("Our best " + item.getDescription() + " made to order.");
            System.out.println("--------------------\n");
        }

        System.out.println("\n" + "Menu last updated: " + updated);

    }

    private static void addItem(MenuItem item){
        if (menuItemList.contains(item)){
            System.out.println(item.getName() + " is already on the menu");
        } else {
            menuItemList.add(item);
            System.out.println(item.getName() + " was added to the menu");
        }
    }

    private static void removeItem(MenuItem item){
        if (menuItemList.remove(item)){
            System.out.println(item.getName() + " was removed from the menu");
            updated = new Date();
        } else {
            System.out.println(item.getName() + " is not on the menu");
        }
    }

}
