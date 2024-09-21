import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Account {
    
private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private int UID;

    public static Set<Integer> existingIDs = new HashSet<>();

   
    public void addInfo(String fname, String lname, String umail, String uname, String pass, int uid) {
        this.firstName = fname;
        this.lastName = lname;
        this.email = umail;
        this.username = uname;
        this.password = pass;
        this.UID = uid;
    }

    public void viewInfo() {
        System.out.printf("ID: %d | Name: %s %s | Email: %s | Username: %s\n", UID, firstName, lastName, email, username);
    }

    public static String validdatePass(String pass) {
        if (pass.length() >= 8) {
            return "valid";
        }
        return "Password must be at least 8 characters long";
    }

    public void getPersonInfo() {
    try (Scanner sc = new Scanner(System.in)) {
        Account[] acc = new Account[100];
        
        System.out.print("Enter number of accounts: ");
        int nums = sc.nextInt(); 
        sc.nextLine();

        for (int i = 0; i < nums; i++) {
            acc[i] = new Account();

            System.out.println("Enter details of user " + (i + 1));

            int ID;
            
            while (true) {
                System.out.print("ID: ");
                UID = sc.nextInt();
                sc.nextLine();

                if (!existingIDs.contains(UID)) {
                    existingIDs.add(UID); 
                    break;
                } else {
                    System.out.println("ID already exists! Please enter a different ID.");
                }
            }
            
            
            System.out.print("Firstname: ");
            String fname = sc.nextLine();

            System.out.print("Lastname: ");
            String lname = sc.nextLine();

            System.out.print("Email: ");
            String umail = sc.nextLine();

            System.out.print("Username: ");
            String uname = sc.nextLine();
            
            
            String pass;
            while (true) {
                System.out.print("Password: ");
                pass = sc.nextLine();
                String passval = Account.validdatePass(pass); 
                if (passval.equals("valid")) {
                    break;
                } else {
                    System.out.println(passval); 
                }
            }
            
            
            acc[i].addInfo(fname, lname, umail, uname, pass, UID);
        }

        for (int i = 0; i < nums; i++) {
            acc[i].viewInfo();
        }
    }
    }

    
}
