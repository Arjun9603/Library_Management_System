import java.util.ArrayList;

public class Library {
    private ArrayList<Item> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item added successfully.");
    }

    public void issueItem(int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                if (!item.isIssued()) {
                    item.issue();
                    System.out.println("Item issued successfully.");
                } else {
                    System.out.println("Item is already issued.");
                }
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void returnItem(int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                if (item.isIssued()) {
                    item.returnItem();
                    System.out.println("Item returned successfully.");
                } else {
                    System.out.println("This item was not issued.");
                }
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void searchItem(String title) {
        for (Item item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found → " + item);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("No items in library.");
        } else {
            System.out.println("Library Items:");
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }
}

