package org.example.IntroToOOPs.vinayassignment;


public class Rectangle {
    Points topLeft; //Top-left corner of rectangle
    int height; //height of rectangle
    int width; //Width of rectangle

     // Constructor to initialize the rectangle
    public Rectangle(Points topLeft, int height, int width) {
        this.topLeft=topLeft;
        this.height=height;
        this.width=width;
    }
    //Method to calculate the perimeter of the rectangle
    public int getPerimeter(){
        return 2*(height+width);
    }
    //Method to calculate the area
    public int getArea(){
        return height*width;
    }
    //Method to get the bottom-right corner of the rectangle
    public Points getBottomRight(){
        int bottomRightX=topLeft.x+width;
        //x co-ordinate calculation of bottom right
        int bottomRightY=topLeft.y-height;
        //y co-ordinate calculation of bottomRight
        return new Points(bottomRightX,bottomRightY);
    }
}
