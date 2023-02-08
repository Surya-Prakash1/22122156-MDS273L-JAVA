package Lab2;

import java.util.Scanner;

public class lab2_code {
  static String[] names = new String[1024];
  static int nameCount = 0;

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
          names[nameCount] = scanner.nextLine();
          nameCount += 1;
          System.out.println("Name added successfully");
          break;
        case 2:
          System.out.print("Enter a name to search: ");
          String searchName = scanner.nextLine();
          int loc = -1;
          for (int i = 0; i < nameCount; i++) {
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
          for (int i = 0; i < nameCount; i++) {
            if (names[i].equals(removeName)) {
              loc = i;
              break;
            }
          }

          if (loc>0) {
            for (int i = loc; i < nameCount - 1; i++) {
              names[i] = names[i + 1];
            }
            nameCount--;
            System.out.println("Name removed successfully");
          } else {
            System.out.println("Name not found");
          }
          break;
        case 4:
          if (nameCount == 0) {
            System.out.println("No names to show");
          } else {
            System.out.println("All names: ");
            for (int i = 0; i < nameCount; i++) {
              System.out.println(names[i]);
            }
          }
          break;
        default:
          System.out.println("Invalid choice. Try again");
          break;
        }
      } while (options != 5);
    }
  }
