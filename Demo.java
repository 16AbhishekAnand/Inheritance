import java.util.Scanner;

public class Demo extends main  {
    static int totalDish =25;
    String[]a = new String[20];
    int[]b=new int [20];
    String x[] = new String[20];
    Scanner obj = new Scanner(System.in);
    
    
    @Override
    void sweet() {
        for(int i=0;i<1;i++) {
            System.out.println("Enter the sweet");
            a[i]=obj.next(); // read current line with space but don't read nextline.
            obj.nextLine(); // read current line even it is empty and do not read space. 
            System.out.print("Enter the price\n");
            b[i]=obj.nextInt();
        }  
    
        for(int i=0;i<1;i++) {
            System.out.println(a[i]+" "+b[i]);
        } 
    }
    
    @Override
    void snacks() {
        for(int i=0;i<1;i++) {
            System.out.println("Enter the snacks\n");
            a[i]=obj.next();
            obj.nextLine();
            System.out.println("Enter the price\n");
            b[i]=obj.nextInt();
        }
        
        for(int i=0;i<1;i++) {
            System.out.println(a[i]+" "+b[i]);
        }
    }
    
    @Override
    void mainCourse() {
        for(int i=0;i<1;i++) {
            System.out.println("Enter the Main Course\n");
            a[i]=obj.next();
            System.out.println("Enter the price\n");
            b[i]=obj.nextInt();
        }
        
        for(int i=0;i<1;i++) {
            System.out.println(a[i]+" "+b[i]);
        }
       
    }

    void order() {
        
        System.out.println("Enter the total no. of dish to order");
        int n = obj.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println("Enter the Dish");
            x[i] = obj.next();
        }

        System.out.println("The Dishes are\n");
        for(int i=0;i<n;i++) {
        System.out.println(x[i]);
        }

        for(int i=0;i<totalDish;i++) {
            if(x[i]==a[i]) {
                sum += b[i];
            }
        }
        System.out.println("The total amount is"+" "+sum);
    }
}