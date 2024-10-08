import org.example.Ex6;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex6Test {

    @Test
    public void TestDigitAverage() {
        Ex6 ex6 = new Ex6();
        double average = ex6.digitAverage(21);
        double testAverage = 1.5;
        assertEquals(average, testAverage, 0.01);
    }

    @BeforeEach
    public void setup() {
        System.out.println("BeforeEach setup() method called.");
    }
}