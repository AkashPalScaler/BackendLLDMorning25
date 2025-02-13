package org.example.IntroToOOPs.vinayassignment;

public class Client {
    public static void main(String[]args){
        //Create a Point object for the top-left corner
        Points topLeftPoint=new Points(0,0);

        //Create a Rectangle object
        Rectangle rectangle=new Rectangle(topLeftPoint,5,8);

        //Display area of rectangle
        System.out.println("Area: "+ rectangle.getArea());

        // Display perimeter of rectangle
        System.out.println("Perimeter: "+rectangle.getPerimeter());


        //Display bottom-right corner of the rectangle
        Points bottomRightPoint= rectangle.getBottomRight();
        System.out.println("Bottom Right Point: "+ bottomRightPoint.x+ ", "+bottomRightPoint.y +")");



    }
}
