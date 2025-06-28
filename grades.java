import java.util.Scanner;

public class Main 

{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your mark: ");
        int mark = scanner.nextInt();

        if (mark >= 90 && mark <= 100) 
         {
            System.out.println("Grade: S");
         } 
        
        else if (mark >= 80 && mark <= 89) 
         {
            System.out.println("Grade: A");
         } 
     
        else if (mark >= 70 && mark <= 79) 
         {
            System.out.println("Grade: B");
         }  

        else if (mark >= 60 && mark <= 69) 
          
         {
            System.out.println("Grade: C");
         } 
       
        else 
    
         {
            System.out.println("Grade: Fail or Invalid Mark");
         }

        scanner.close();
    }
}
