import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    // Test case to validate the sum method
    @Test
    public void testSum() {
        Main main = new Main();
        int result = main.sum(5, 3);
        assertEquals(8, result, "Sum should be 8");
    }
}
