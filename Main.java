import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int choice;
        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Add Newspaper");
            System.out.println("4. Issue Item");
            System.out.println("5. Return Item");
            System.out.println("6. Search Item");
            System.out.println("7. Display All Items");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Book ID: ");
                        int bookId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Book Title: ");
                        String bookTitle = sc.nextLine();
                        library.addItem(new Book(bookId, bookTitle));
                        break;

                    case 2:
                        System.out.print("Enter Magazine ID: ");
                        int magId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Magazine Title: ");
                        String magTitle = sc.nextLine();
                        library.addItem(new Magazine(magId, magTitle));
                        break;

                    case 3:
                        System.out.print("Enter Newspaper ID: ");
                        int newsId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Newspaper Title: ");
                        String newsTitle = sc.nextLine();
                        library.addItem(new Newspaper(newsId, newsTitle));
                        break;

                    case 4:
                        System.out.print("Enter Item ID to Issue: ");
                        int issueId = sc.nextInt();
                        library.issueItem(issueId);
                        break;

                    case 5:
                        System.out.print("Enter Item ID to Return: ");
                        int returnId = sc.nextInt();
                        library.returnItem(returnId);
                        break;

                    case 6:
                        System.out.print("Enter Item Title to Search: ");
                        String searchTitle = sc.nextLine();
                        library.searchItem(searchTitle);
                        break;

                    case 7:
                        library.displayItems();
                        break;

                    case 8:
                        System.out.println("Exiting... Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter numbers only.");
                sc.nextLine();
                choice = -1;
            }
        } while (choice != 8);

        sc.close();
    }
}
