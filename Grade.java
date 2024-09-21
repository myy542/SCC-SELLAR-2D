import java.util.Scanner;

public class Grade {
    
     public void getGradeInput(){
        
         try (Scanner sc = new Scanner(System.in)) {
             Grades[] gr = new Grades[100];
             int nums = 0;
             String choice;
             
             do {
                 System.out.println("-------------------");
                 System.out.println("WELCOME TO GRADE APP");
                 System.out.println("-------------------");
                 System.out.println("1. ADD");
                 System.out.println("2. VIEW");
                 System.out.println("3. EDIT");
                 System.out.println("4. DELETE");
                 System.out.println("5. EXIT");
                 System.out.println("-------------------");
                 
                 System.out.print("Enter Option: ");
                 int option = sc.nextInt();
                 
                 while (option > 5 || option < 1) {
                     System.out.print("Invalid Selection, Try Again: ");
                     option = sc.nextInt();
                 }
                 
                 switch (option) {
                     case 1:
                         System.out.println("Enter details of student " + (nums + 1) + ":");
                         System.out.print("ID: ");
                         int id = sc.nextInt();
                         sc.nextLine();
                         System.out.print("Name: ");
                         String name = sc.nextLine();
                         System.out.print("Prelim: ");
                         double pr = sc.nextDouble();
                         System.out.print("Midterm: ");
                         double md = sc.nextDouble();
                         System.out.print("Prefinal: ");
                         double pf = sc.nextDouble();
                         System.out.print("Final: ");
                         double fn = sc.nextDouble();
                         
                         gr[nums] = new Grades();
                         gr[nums].addGrades(name, id, pr, md, pf, fn);
                         nums++;
                         break;
                         
                     case 2:
                         if (nums == 0) {
                             System.out.println("No students available to view.");
                         } else {
                             for (int i = 0; i < nums; i++) {
                                 gr[i].viewGrades();
                             }
                         }
                         break;
                         
                     case 3:
                         if (nums == 0) {
                             System.out.println("No students available to edit.");
                         } else {
                             System.out.println("Enter ID of the Student: ");
                             int editId = sc.nextInt();
                             
                             for (int i = 0; i < nums; i++) {
                                 if (gr[i].id == editId) {
                                     System.out.print("New Prelim Grade: ");
                                     double newPr = sc.nextDouble();
                                     gr[i].editGrades(editId, newPr);
                                     System.out.println("Prelim grade updated.");
                                     break;
                                 }
                             }
                         }
                         break;
                         
                     case 4:
                         System.out.println("Delete functionality not yet implemented.");
                         break;
                         
                     case 5:
                         System.out.println("Exiting...");
                         return;
                 }
                 
                 System.out.print("Want to continue (y/n)?: ");
                 choice = sc.next();
             } while (choice.equalsIgnoreCase("y"));
         } 
    }

    void grtGradeInput() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    }

    

