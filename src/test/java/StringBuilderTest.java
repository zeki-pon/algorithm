import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringBuilderTest {
    @Test
    void sb_insert_test() {
        String expected = "いう";
        StringBuilder sb = new StringBuilder();
        sb.insert(0, "う");
        sb.insert(0, "い");
        assertEquals(expected, sb.toString());
    }
}
