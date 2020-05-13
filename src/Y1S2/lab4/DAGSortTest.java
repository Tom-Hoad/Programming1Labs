package Y1S2.lab4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class DAGSortTest {
    @Test
    public void nullParameter() {
        try {
            assertNull(DAGSort.sortDAG(null));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
