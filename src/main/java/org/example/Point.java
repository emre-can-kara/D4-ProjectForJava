package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) { // Constructor for Point class
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    // (0,0)
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.getX() - this.x, 2) + Math.pow(p.getY() - this.y, 2));
    }

    // (a, b)
    public double distance(int a, int b) {
        return Math.sqrt(Math.pow(a - this.x, 2) + Math.pow(b - this.y, 2));
    }
}
