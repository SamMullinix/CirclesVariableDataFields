public class TestCircleWithPrivateDataFields 
{
/* Main method */
   public static void main(String[] args) 
   {
   
   // Create a circle with radius 5.0 
      CircleWithPrivateDataFields myCircle =
         new CircleWithPrivateDataFields(5.0); 
      System.out.println("The area of the circle of radius "
         + myCircle.getRadius() + " is " + myCircle.getArea());
           
   // Increase myCircle's radius by 10%
      myCircle.setRadius(myCircle.getRadius() * 1.1); 
      System.out.println("The area of the circle of radius "
         + myCircle.getRadius() + " is " + myCircle.getArea());
      System.out.println("The number of objects created is "    
         + CircleWithPrivateDataFields.getNumberOfObjects());
         
   // Create a circle with radius 40 
      CircleWithPrivateDataFields myCircle2 =
         new CircleWithPrivateDataFields(40); 
      System.out.println("\nThe area of the circle of radius "
         + myCircle2.getRadius() + " is " + myCircle2.getArea());  
         
   // Increase myCircle2's radius by 50%
      myCircle2.setRadius(myCircle2.getRadius() * 1.5); 
      System.out.println("The area of the circle of radius "
         + myCircle2.getRadius() + " is " + myCircle2.getArea());
      System.out.println("The number of objects created is "    
         + CircleWithPrivateDataFields.getNumberOfObjects());
   } 
}