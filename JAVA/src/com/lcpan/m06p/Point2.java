package com.lcpan.m06p;

public class Point2 {
    private int x;
    private int y;
    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public boolean equals(Object obj) {
        if(obj instanceof Point2) {
            Point2 p = (Point2) obj;
            return this.x == p.x && this.y == p.y;
        }
        return false;
    }
    
    public int hashCode() {
    	Integer ix = x;    	Integer iy = y;
        return ix.hashCode() ^ iy.hashCode();
    }
    
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
