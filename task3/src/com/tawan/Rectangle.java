package com.tawan;

/**
 * Rectangle
 *
 * @author Tawan Chotikanchinda <hello@tawan.org>
 */

public class Rectangle {

    private Float width;
    private Float length;

    /**
     * Create rectangle instance
     * @param initialWidth
     * @param initialLength
     */
    public Rectangle(Float initialWidth, Float initialLength) {
        this.setWidth(initialWidth);
        this.setLength(initialLength);
    }

    /**
     * Get rectangle width accessor
     * @return width
     */
    public Float getWidth() {
        return this.width;
    }

    /**
     * Get rectangle length accessor
     * @return length
     */
    public Float getLength() {
        return this.length;
    }

    /**
     * Get rectangle area accessor
     * @return area
     */
    public Float area() {
        return this.width * this.length;
    }

    /**
     * Set rectangle width accessor
     * @param newWidth rectangle's width
     */
    public void setWidth(Float newWidth) {
        if (newWidth <= 0) {
            throw new IllegalArgumentException();
        }

        this.width = newWidth;
    }

    /**
     * Set rectangle length accessor
     * @param newLength rectangle's length
     */
    public void setLength(Float newLength) {
        if (newLength <= 0) {
            throw new IllegalArgumentException();
        }

        this.length = newLength;
    }

    /*
     * toString - returns a string the Rectangle
     */
    public String toString() {
        return "Length: " + this.length + "cm, Width: " + this.width + "cm, Area: " + this.area() + "cm";
    }

}
