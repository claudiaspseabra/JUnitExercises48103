import org.example.Ex3.CU;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CUTest {

    private CU cu;

    @BeforeEach
    public void setUp() {
        cu = new CU("Mathematics", 3);
    }

    @Test
    public void testInsertMarkAndSearchStudent() {
        cu.insertMarkCU(2, 14.0);
        assertEquals(14.0, cu.searchStudent(2));
    }

    @Test
    public void testAverageCU() {
        cu.insertMarkCU(1, 10.0);
        cu.insertMarkCU(2, 10.0);
        cu.insertMarkCU(3, 10.0);
        assertEquals(10.0, cu.averageCU());
    }

    @ParameterizedTest
    @CsvSource({
            "1, 9.5, true",
            "2, 8.0, false",
            "3, 10.0, true"
    })
    public void testIsApproved(int numStudent, double mark, boolean expected) {
        cu.insertMarkCU(numStudent, mark);
        assertEquals(expected, cu.isApproved(numStudent));
    }
}