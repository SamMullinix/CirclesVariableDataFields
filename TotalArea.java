public class TotalArea 
{  
/* Main method */ 
   public static void main(String[] args) 
   {
         
   // Declare circleArray
      CircleWithPrivateDataFields[] circleArray;
   
   // Create circleArray
      circleArray = createCircleArray();
   
   // Print circleArray and total areas of the circles
      printCircleArray(circleArray);  
      
   // Print min and max
      minMax(circleArray);
   }

/* Create an array of Circle objects */ 
   public static CircleWithPrivateDataFields[] createCircleArray() 
   { 
      CircleWithPrivateDataFields[] circleArray =
         new CircleWithPrivateDataFields[5];
      for (int i = 0; i < circleArray.length; i++) 
      { 
         circleArray[i] =
            new CircleWithPrivateDataFields(Math.random() * 100);
      }
   
   // Return Circle array  
      return circleArray;
   }

/* Print an array of circles and their total area */
   public static void printCircleArray( 
   CircleWithPrivateDataFields[] circleArray) 
   {
      System.out.printf("%-30s%-15s\n", "Radius", "Area"); 
      for (int i = 0; i < circleArray.length; i++) 
      {
         System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
      }
   
      System.out.println("—————————————————————————————————————————-");
   
   // Compute and display the result
      System.out.printf("%-30s%-15f\n", "The total area of circles is", 
         sum(circleArray) ); 
   }

/* Add Circle ares */
   public static double sum (CircleWithPrivateDataFields[] circleArray)
   {
   //Initialize sum
      double sum = 0;
   
   // Add areas to sum
      for (int i = 0; i < circleArray.length; i++) 
         sum += circleArray[i].getArea();
   
      return sum;
   }
   
   public static void minMax(CircleWithPrivateDataFields[] circleArray)
   {
      double min = 1000;
      double max = 0;
      
      // Find max.
      for (int i = 0; i < circleArray.length; i++) 
      {
         if (circleArray[i].getRadius() > max)
         {
            max = circleArray[i].getRadius();
         }
      }
      
      // Find min.
      for (int i = 0; i < circleArray.length; i++) 
      {
         if (circleArray[i].getRadius() < min)
         {
            min = circleArray[i].getRadius();
         }
      }  
      
      System.out.print("\nThe smallest circle has radius = " + min
         + "\nThe largest circle has radius  = " + max);
      
   }
}