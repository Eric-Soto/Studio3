package restaurant;

import java.util.Arrays;
import java.util.Date;

public class MenuItem {

    public MenuItem(String name, double price, String description, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = new Date();
        this.isNew = isNew;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double price;
    private String description;
    //appetizer, main course, or desert
    private String category;
    private boolean isNew = true;
    private Date dateAdded;

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) throws Exception {

        String[] allowedCategories = {"appetizer","main course", "dessert"};
        if (Arrays.stream(allowedCategories).anyMatch(category::equals)) {
            this.category = category;
        }
        else {
            System.out.println("not a category");
        }
            //throw new Exception("Invalid category entered. No such category in the menu");
    }

}
