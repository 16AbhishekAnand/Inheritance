package Inheritance;

import java.util.Scanner; 
class Polygon
{
    void size(String[] args[])
    {
        System.out.println("Enter the size of polygon");
        Scanner obj =new Scanner(System.in);
        int size =obj.nextInt();
    }   
}       

class Square extends Polygon
{
    void SquareSize()
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                System.out.print(" * ");
            }    
            System.out.println();
        }
        System.out.println();
        
    }
}

class Rectangle extends Polygon
{
    void RectangleSize()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                System.out.print(" * ");
            }    
            System.out.println();
        }
        System.out.println();
    }
}

class Triangle extends Polygon
{
    void TriangleSize()
    {
         for(int x=0;x<n;x++)
        {
            for(int y=0;y<n-x-1;y++)
            {
                System.out.print(" ");
            }
            for(int z=0;z<x+1;z++)
            {
               System.out.print("* "); 
            }
            System.out.print("\n");
            
        }

    }
}

class ReverseTriangle extends Polygon
{
    void ReverseTriangleSize()
    {
        for(int k=0;k<n;k++)
        {
            for(int l=0;l<k;l++)
            {
                System.out.print(" ");
            }
            for(int m=0;m<n-k;m++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");        
        }
    }
}

public class PolygonTest 
{
    public static void main(String[] args[])
    {
        Square sq = new Square();
        Rectangle rec = new Rectangle();
        Triangle tri = new Triangle();
        ReverseTriangle rev = new ReverseTriangle();
        
        System.out.println("Enter the size of polygon");
        Scanner size =new Scanner(System.in);
        int n =size.nextInt();
        
        
        
    }
}          
            
             
    
    
    
    
    
    
    
            
        
        
        
        
        


