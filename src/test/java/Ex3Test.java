import org.example.Ex3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex3Test {
    Ex3 ex3 = new Ex3();

    @Test
    public void testArea() {
        int area = ex3.area(3, 5);
        int testArea = 15;
        assertEquals(area, testArea);
    }

    @Test
    public void testPerimeter() {
        int perimeter = ex3.perimeter(3, 5);
        int testPerimeter = 60;
        assertEquals(perimeter, testPerimeter);
    }

    @Test
    public void testIsTriangle() {
        int isTriangle = ex3.isTriangle(13, 12, 5);
        int testIsTriangle = 1;
        assertEquals(isTriangle, testIsTriangle);
    }
}