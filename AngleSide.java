import java.io.Console;

public class AngleSide {
  public static void main(String[] args){
    Console myConsole = System.console();
    System.out.println("Please enter side 1 length.");
    Integer angle1 = Integer.parseInt(myConsole.readLine());

    System.out.println("Please enter side 2 length.");
    Integer angle2 = Integer.parseInt(myConsole.readLine());

    System.out.println("Please enter side 3 length.");
    Integer angle3 = Integer.parseInt(myConsole.readLine());

    Triangle inputTriangle = new Triangle(angle1, angle2, angle3);

    if(inputTriangle.equilateral()){
      System.out.println("You have an equilateral triangle.");
    } else if (inputTriangle.isosceles()){
      System.out.println("You have an isosceles triangle.");
    } else if (inputTriangle.scalene()){
      System.out.println("You have a scalene triangle.");
    }

    // for (Triangle inputTriangle){
    //   if (angle1 == angle2 && angle1 == angle3){
    //     System.out.println("You have an equilateral triangle.");
    //   }else if (angle1 == angle2 || angle2 == angle3 || angle3 == angle1) {
    //     System.out.println("You have an isosceles triangle.");
    //   } else if (angle1 !== angle2 && angle2 !== angle3 && angle1 !== angle3) {
    //     Sytem.out.println("You have a scalene triangle.");
    //   }
    // } System.out.println("Please enter integer for the side length.");
  }
}
