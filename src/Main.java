//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("*****This program is designed to calculate the area of an equilateral triangle, isosceles triangle and right-angle triangle*****");

        Scanner sc = new Scanner(System.in);
        boolean bool = true;

        while(bool){
            System.out.println("Enter the type of triangle: ");
            String type = sc.nextLine();


            if (type.equals ("equilateral")|| type.equals("Equilateral")){
                System.out.println("Enter the length of one side: ");
                int side = sc.nextInt();

                double area = 0;
                area = (1.732/4)* side* side;
                System.out.println("Area of Equilateral Triangle is: "+ area);

            } else if (type.equals ("isosceles")|| type.equals("Isosceles")){
                System.out.println("Enter the length of base: ");
                int base = sc.nextInt();
                System.out.println("Enter the lenght of side: ");
                int Side = sc.nextInt();


                double height = Math.sqrt(Side * Side - (base * base / 4));

                int area1 = 0;
                area1 = (Side*base)/2;
                System.out.println("Area of isosceles triangle: "+ area1);
            }else if (type.equals("right-angle")|| type.equals("Right-angle")||type.equals("Right-Angle")){
                System.out.println("Enter the length of base: ");
                int Base = sc.nextInt();
                System.out.println("Enter the length of height: ");
                int len = sc.nextInt();

                int area2 = 0;
                area2 = (Base*len)/2;
                System.out.println("Area of right-angle triangle: " + area2);


            }else {
                System.out.println(" This option is not available for the moment.");
            }

            System.out.println("Do you want to continue? (yes/no)");
            String choice = sc.next();
            if (!choice.equalsIgnoreCase("yes")) {
                bool = false;
            }
            sc.nextLine();
        }
    }
}