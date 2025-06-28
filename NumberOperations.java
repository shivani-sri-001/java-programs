public class NumberOperations 
  {

       public static double findAverage(int a, int b, int c)
    {
        return (a + b + c) / 3.0;
    }

   
       public static void checkEvenOdd(int number)

    {
        if (number % 2 == 0) 
         {
            
           System.out.println(number + " is Even");
         } 
        else 

         {
            System.out.println(number + " is Odd");
         }
     }

        public static void printRange(int start, int end) 
 
         {
       
            System.out.println("Numbers between " + start + " and " + end + ":");
            for (int i = start; i <= end; i++) 
        
               {
                  System.out.print(i + " ");
               }
            System.out.println(); // for new line
         }


    public static void main(String[] args) 
    {
       
        double avg = findAverage(10, 20, 30);
        System.out.println("Average: " + avg);

        checkEvenOdd(15);
        checkEvenOdd(8);

        printRange(5, 10);
    }
}
