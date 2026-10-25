package problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter maximum library capacity: ");
        int capacity = scanner.nextInt();

        Library library = new Library(capacity);


        library.add(new Novel("1984", "George Orwell", 328, 15.99));
        library.add(new Magazine("National Geographic", "January", 2023));

        int choice;
        do {
            System.out.println("\n1. Add Document\n2. Display Documents\n3. Display Authors\n4. Delete Document\n5. Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    library.add(new Book(title, author, 200));
                    break;
                case 2:
                    library.displayDocuments();
                    break;
                case 3:
                    library.displayAuthors();
                    break;
                case 4:
                    System.out.print("Enter Document ID to delete: ");
                    int id = scanner.nextInt();
                    Document doc = library.document(id);
                    if (doc != null && library.delete(doc)) {
                        System.out.println("Deleted successfully.");
                    } else {
                        System.out.println("Document not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}