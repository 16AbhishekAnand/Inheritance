import java.util.Scanner;

class InputTest{
public static void main(String[] agrs){
    System.out.println("Perimeter of Rectangle:");
    Scanner myObj = new Scanner(System.in);
    System.out.println("Perimeter of Rectangle:");
    System.out.println("enter the length:");
    int length = myObj.nextInt();
    System.out.println("enter the Breath:");
    int breath = myObj.nextInt();
    Rectangle rec = new  Rectangle(length,breath);
    int a = rec.perimeter();
    System.out.println(a);

    System.out.println("Perimeter of Square:");
   
    System.out.println("Length of Square:");
    int len = myObj.nextInt();
    Square sqa = new Square(len);
    int b = sqa.perimeter();
    System.out.println(b); 
}
}      
    
