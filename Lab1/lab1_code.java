import java.util.*;  
class lab1_code   
{  
public static void main(String[] args)  
{   String name,gender,region;
    int age;
    Scanner sc= new Scanner(System.in);  
    System.out.println("Enter Your Name: ");  
    name= sc.nextLine();      
    System.out.println("Enter Your Gender(m/f): ");  
    gender= sc.nextLine(); 
    System.out.println("Enter Your Region: ");  
    region= sc.nextLine(); 
    System.out.println("Enter Your Age: ");  
    age = sc.nextInt();
    System.out.println("Your Name is "+name); 
    System.out.println("Your Region is "+region);
    System.out.println("Your Age is "+age);
    System.out.println("Your Gender is "+gender);
    switch(region){
        case "Tamil nadu": case "Kerala": case "Andhra Pradesh": case "Karnataka": 
                System.out.println("The Student is from the southern states of India and  name is "+name+".Age is "+age+".");
                break;
        case "Delhi": case "Haryana": case "Uttar Pradesh": case "Punjab":
                System.out.println("The Student is from the Northern states of India and  name is "+name+".Age is "+age+".");
                break;
        case "Arunachal Pradesh": case "Assam": case "Manipur": case "Mizoram":
                System.out.println("The Student is from the eastern states of India and  name is "+name+".Age is "+age+".");
                break;
        case "Maharashtra": case "Gujarat": case "Rajasthan":
                System.out.println("The Student is from the western states of India and  name is "+name+".Age is "+age+".");
                break;
        default:
            System.out.println("The student's region is not specified.");
    }
    if(gender.equals("m")){
        System.out.println("His Gender is male.");
    }
    if(gender.equals("f")){
        System.out.println("Her Gender is female.");
    }

}
}
