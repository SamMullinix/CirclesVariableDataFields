public class TestCircleWithStaticMembers 
{
/* Main method */
   public static void main(String[] args) 
   { 
      System.out.println("Before creating objects"); 
      System.out.println("The number of Circle objects is " +
         CircleWithStaticMembers.numberOfObjects);
      
   // Create c1
      CircleWithStaticMembers c1 = new CircleWithStaticMembers();
        
   // Display c1 BEFORE c2 is created
      System.out.println("\nAfter creating c1"); 
      System.out.println("c1: radius (" + c1.radius 
         +
         ") and number of Circle objects (" + 
         c1.numberOfObjects + ")");
         
   // Create c2, c3, and c4
      CircleWithStaticMembers c2 = new CircleWithStaticMembers(5); 
      
   // Display c2 BEFORE c3 is created
      System.out.println("\nAfter creating c2"); 
      System.out.println("c2: radius (" + c2.radius 
         +
         ") and number of Circle objects (" + 
         c2.numberOfObjects + ")");
         
      CircleWithStaticMembers c3 = new CircleWithStaticMembers(20);
      
      // Display c3 BEFORE c4 is created
      System.out.println("\nAfter creating c3"); 
      System.out.println("c3: radius (" + c3.radius 
         +
         ") and number of Circle objects (" + 
         c3.numberOfObjects + ")");
         
      CircleWithStaticMembers c4 = new CircleWithStaticMembers(100);
      
      // Display c4 
      System.out.println("\nAfter creating c4"); 
      System.out.println("c4: radius (" + c4.radius 
         +
         ") and number of Circle objects (" + 
         c4.numberOfObjects + ")");
      
   // Modify c1
      c1.radius = 9;
   
      
   // Display c1,c2,c3,and c4 after they were created
      System.out.println("\nAfter creating c2 and modifying c1"); 
      System.out.println("c1: radius (" + c1.radius +
         
         ") and number of Circle objects (" +
         c1.numberOfObjects + ")"); 
      System.out.println("c2: radius (" + c2.radius +
         
         ") and number of Circle objects (" + c2.numberOfObjects + ")");
      System.out.println("c3: radius (" + c3.radius +
         
         ") and number of Circle objects (" + c3.numberOfObjects + ")");
      System.out.println("c4: radius (" + c4.radius +
         
         ") and number of Circle objects (" + c4.numberOfObjects + ")");
         
   }
}