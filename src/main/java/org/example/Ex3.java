package org.example;

public class Ex3 {
    public int area(int length, int height) {
        return length * height;
    }

    public int perimeter(int length, int height) {
        return (2*length) * (2*height);
    }

    public int isTriangle(int a, int b, int c) {
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Triangle.");
            return 1;
        } else {
            System.out.println("Not a triangle.");
            return 0;
        }
    }
}