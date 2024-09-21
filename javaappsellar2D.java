
import java.util.Scanner;


public class javaappsellar2D {
    
    public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
        Grade gradeApp = new Grade();
        Product productApp = new Product();
        Account accountApp = new Account();
        
        String choice;
        
        do {
            System.out.println("-------------------");
            System.out.println("MAIN APPLICATION MENU");
            System.out.println("-------------------");
            System.out.println("1. Grade Application");
            System.out.println("2. Product Application");
            System.out.println("3. Account Application");
            System.out.println("4. Exit");
            System.out.println("-------------------");
            System.out.print("Enter Option: ");
            int option = sc.nextInt();
            
            while (option > 4 || option < 1) {
                System.out.print("Invalid Selection, Try Again: ");
                option = sc.nextInt();
            }
            
            switch (option) {
                case 1:
                    gradeApp.getGradeInput();
                    break;

                case 2: 
                    productApp.GetInfo();
                    break;

                case 3: 
                    accountApp.getPersonInfo();
                    break;

                case 4: 
                    System.out.println("Exiting Application...");
                    return;
            }
            
            System.out.print("Want to go back to the main menu (yes/no)?: ");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("yes"));

        sc.close();
    }
           
    }


