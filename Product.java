import java.util.Scanner;

public class Product {
    String name;
    String prodname;
    int qty;
    int price;
    double cash;

    public void addProduct(String name, String prodname, int qty, int price, double cash) {
        this.name = name;
        this.prodname = prodname;
        this.qty = qty;
        this.price = price;
        this.cash = cash;
    }
    
    public void viewInfo() {
        System.out.printf("Customer Name: %s | Product Name: %s | Quantity: %d | Price: %d | Cash: %.2f\n",
                this.name, this.prodname, this.qty, this.price, this.cash);
    }

    public void editProduct(String name, int qty, int price, double cash) {
        if (this.name.equals(name)) {
            this.qty = qty;
            this.price = price;
            this.cash = cash;
        }
    }

    public void GetInfo() {

        Product[] rc = new Product[100];
        Scanner sc = new Scanner(System.in);
        int nums = 0;
        String choice;

        do {

            System.out.println("-------------------");
            System.out.println("WELCOME TO PRODUCT APP");
            System.out.println("-------------------");
            System.out.println("1. ADD");
            System.out.println("2. VIEW");
            System.out.println("3. EDIT");
            System.out.println("4. EXIT");
            System.out.println("-------------------");

            System.out.print("Enter Option: ");
            int option = sc.nextInt();
            sc.nextLine();

            while (option > 4 || option < 1) {
                System.out.print("Invalid Selection, Try Again: ");
                option = sc.nextInt();
                sc.nextLine(); 
            }

            switch (option) {
                case 1: // ADD product
                    System.out.print("Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Product Name: ");
                    String prodname = sc.nextLine();

                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Price: ");
                    int price = sc.nextInt();

                    System.out.print("Cash: ");
                    double cash = sc.nextDouble();

                    rc[nums] = new Product();
                    rc[nums].addProduct(name, prodname, qty, price, cash);
                    nums++;

                case 2: 
                    if (nums == 0) {
                        System.out.println("No products to display.");
                    } else {
                        for (int i = 0; i < nums; i++) {
                            rc[i].viewInfo();
                        }
                    }
                    break;

                case 3: // 
                    if (nums == 0) {
                        System.out.println("No products to edit.");
                    } else {
                        System.out.print("Enter the Name of the Customer to Edit: ");
                        String cname = sc.nextLine();

                        for (int i = 0; i < nums; i++) {
                            if (rc[i].name.equals(cname)) {
                                System.out.print("Enter New Quantity: ");
                                int newQty = sc.nextInt();

                                System.out.print("Enter New Price: ");
                                int newPrice = sc.nextInt();

                                System.out.print("Enter New Cash: ");
                                double newCash = sc.nextDouble();

                                rc[i].editProduct(cname, newQty, newPrice, newCash); 
                                System.out.println("Product updated successfully.");
                                break;
                            }
                        }
                    }
                    break;

                case 4: 
                    System.out.println("Exiting...");
                    return;
            }

            System.out.print("Want to continue (yes/no)?: ");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("yes"));

        sc.close();
    }
    
}
