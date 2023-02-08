package Lab2;

import java.util.Scanner;

public class lab2_code {
  static String[] names = new String[1024];
  static int n = 0;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int options;

    do {
      System.out.println("\nMenu");
      System.out.println("1. Enter a name");
      System.out.println("2. Search for a name");
      System.out.println("3. Remove a name");
      System.out.println("4. Show all names");
      System.out.print("Enter your choice: ");
      options = scanner.nextInt();
      scanner.nextLine();

      switch (options) {
        case 1:
            System.out.print("Enter a name: ");
            String newName = scanner.nextLine();

            boolean oldname = false;
            for (int i = 0; i < n; i++) {
                if (names[i].equals(newName)) {
                oldname = true;
                break;
                }
            }

            if (oldname) {
                System.out.println("Name already exists");
            } else {
                names[n] = newName;
                n += 1;
                System.out.println("Name added successfully");
            }
            break;
        case 2:
          System.out.print("Enter a name to search: ");
          String searchName = scanner.nextLine();
          int loc = -1;
          for (int i = 0; i < n; i++) {
            if (names[i].equals(searchName)) {
                loc = i;
              break;
            }
            }
            if(loc >= 0){
                System.out.println("Name found at index: " + loc);

            }
            else{
                System.out.println("Name not found");
            }
          break;
        case 3:
          System.out.print("Enter a name to remove: ");
          String removeName = scanner.nextLine();

          loc = -1;
          for (int i = 0; i < n; i++) {
            if (names[i].equals(removeName)) {
              loc = i;
              break;
            }
          }

          if (loc>0) {
            for (int i = loc; i < n - 1; i++) {
              names[i] = names[i + 1];
            }
            n--;
            System.out.println("Name removed successfully");
          } else {
            System.out.println("Name not found");
          }
          break;
        case 4:
          if (n == 0) {
            System.out.println("No names to show");
          } else {
            System.out.println("All names: ");
            for (int i = 0; i < n; i++) {
              System.out.println(names[i]);
            }
          }
          break;
        default:
          System.out.println("Invalid choice. Try again");
          break;
        }
      } while (options < 5);
    }
  }
