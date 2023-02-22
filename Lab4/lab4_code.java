package Lab4;

import java.util.Scanner;

public class lab4_code {

    public static int Acc_no;
    public static int Balance;
    public static String Name;
    public static Scanner sc=new Scanner(System.in); 
    

    public static void initialize_the_customer() {
        System.out.print("Enter the name of the account holder: ");  
        Name= sc.nextLine(); 
        System.out.print("Enter the account no: ");  
        Acc_no= sc.nextInt(); 
        System.out.print("Enter balance amount: ");  
        Balance= sc.nextInt(); 
        
      }

    public static int deposit(int amt){
        Balance += amt;
        System.out.print("Balance amount after deposit is : "+Balance);
        return Balance;
    }

    public static int withdraw(int amt){
        Balance -= amt;
        System.out.print("Balance amount after withdrawing is : "+Balance);
        return Balance;
    }

    public static void print_transactions(int[][] transac,int count){
        for(int i = 0; i<=count-1 ; i++){
            if(transac[i][0] > 0){
                System.out.println("The amount deposited is: "+transac[i][0]);
                System.out.println("The balance amount  after deposited is: "+transac[i][1]);
            }
            else{
                System.out.println("The amount withdrawed is: "+ transac[i][0]);
                System.out.println("The balance amount after withdrawed  is: "+transac[i][1]);
            }
        }
    }

    public static void print_details(){
        System.out.println("------------------------------------------------------");
        System.out.println("The Name of the account holder is : "+Name);
        System.out.println("Account number : "+Acc_no);
        System.out.println("The final balance is: "+ Balance);
        System.out.println("------------------------------------------------------");

    }

    public static void main(String[] args) {
         
        initialize_the_customer();
        int amt,options,t_count = 0;
        int[][] transactions = new int[1024][1024];
        int q;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Print the transaction");
            System.out.println("4. Print account summary");
            System.out.print("Enter your choice: ");
            options = sc.nextInt();
            sc.nextLine();

            switch(options){
                case 1:
                    System.out.print("Enter the amount to deposit: ");  
                    amt= sc.nextInt(); 
                    q = deposit(amt);
                    transactions[t_count][0] = amt;
                    transactions[t_count][1] = q;
                    t_count += 1;
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");  
                    amt= sc.nextInt(); 
                    q = withdraw(amt);
                    transactions[t_count][0] = (-amt);
                    transactions[t_count][1] = q;
                    t_count += 1;
                    break;
                case 3:
                    print_transactions(transactions,t_count);
                    break;
                case 4:
                    print_details();
                    break;
                default:
                    System.out.println("Invalid choice. Try again");
                    break;


            }
    
            }while( options <= 4);
        
        }
}