import java.util.Scanner;

class Student {
    String Reg_no;
    String Name;
    String Email;
    String Phone;
    String Class;
    String Department;
    
    public Student(String Reg_no, String Name, String Email, String Phone, String Class, String Department) {
        this.Reg_no = Reg_no;
        this.Name = Name;
        this.Email = Email;             // Constructor to initialise the variables.
        this.Phone = Phone;
        this.Class = Class;
        this.Department = Department;
    }
    
    public void printDetails() {                        
        System.out.println("Reg. No.: " + Reg_no);
        System.out.println("Name: " + Name);
        System.out.println("Email: " + Email);
        System.out.println("Phone: " + Phone);
        System.out.println("Class: " + Class);
        System.out.println("Department: " + Department);
    }
    
    public String getReg_no() {
        return Reg_no;             // Getting registration no to check for the student detials
    }
    
    public String getName() {
        return Name;                // Getting Name to check for the student detials
    }
}

public class lab5_code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100];
        int count = 0;
        int choice;

        do {

            System.out.println();
            System.out.println("---------------------------------------");
            System.out.println("1. Add a student");
            System.out.println("2. Search for a student");
            System.out.println("3. Display all students");
            System.out.println("---------------------------------------");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the Registration no: ");
                    String Reg_no = scanner.nextLine();
                    System.out.print("Enter the Name of student: ");
                    String Name = scanner.nextLine();
                    System.out.print("Enter the Email: ");
                    String Email = scanner.nextLine();
                    System.out.print("Enter the Phone: ");
                    String Phone = scanner.nextLine();
                    System.out.print("Enter the class: ");
                    String Class = scanner.nextLine();
                    System.out.print("Enter the Department: ");
                    String Department = scanner.nextLine();
                    students[count] = new Student(Reg_no, Name, Email, Phone, Class, Department);
                    count  += 1;
                    break;
                case 2:
                    System.out.print("Enter the name of the student: ");
                    String find_name = scanner.nextLine();
                    System.out.print("Enter the Registraion no of the student: ");
                    String find_reg = scanner.nextLine();
                    for (int i = 0; i < count; i++) {
                        if (students[i].getName().equals(find_name) && students[i].getReg_no().equals(find_reg)) {
                            students[i].printDetails();        // printing details only if the name and regno matches.
                            break;
                        }
                        if (i == count - 1) {
                            System.out.println("No student found.");
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < count; i++) {
                        students[i].printDetails();
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while(choice <= 3);
    }
}
