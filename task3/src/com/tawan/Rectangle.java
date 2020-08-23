package com.tawan;

public class Rectangle {

    private Float width;
    private Float length;

    public Rectangle(Float initialWidth, Float initialLength) {
        this.setWidth(initialWidth);
        this.setLength(initialLength);
    }

    public Float getWidth() {
        return this.length;
    }

    public Float getLength() {
        return this.length;
    }

    public Float area() {
        return this.width * this.length;
    }

    public void setWidth(Float newWidth) {
        if (newWidth <= 0) {
            throw new IllegalArgumentException();
        }

        this.width = newWidth;
    }

    public void setLength(Float newHeight) {
        if (newHeight <= 0) {
            throw new IllegalArgumentException();
        }

        this.length = newHeight;
    }

    /*
     * toString - returns a string the Rectangle
     */
    public String toString() {
        return "Length: " + this.length + "cm, Width: " + this.width + "cm, Area: " + this.area() + "cm";
    }

}
