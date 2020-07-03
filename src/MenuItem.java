public class MenuItem {

    private String name;
    private double price;
    private String description;
    private boolean justIn = true;

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Name on " + this.name + " was changed");
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Price on " + this.name + " was changed");
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        System.out.println("Description on " + this.name + " was changed");
        this.description = description;
    }

    public boolean getJustIn() { return justIn; }

    public void setJustIn(){ this.justIn = !this.justIn; }

}
