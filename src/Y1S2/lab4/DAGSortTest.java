package Y1S2.lab4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DAGSortTest {
    @Test
    void correctOrder() throws CycleDetectedException, InvalidNodeException {
        int[][] edges = {{1, 2}, {2, 3}, {3, 4}, {}, {}};
        assertTrue(checkOrders(edges), "Not found the correct topological order.");
    }

    // Checks if the given order matches any of the possible orders.
    private boolean checkOrders(int[][] edges) throws CycleDetectedException, InvalidNodeException {
        int[][] possibleOrders = {{0, 1, 2, 3, 4}, {0, 1, 2, 4, 3}};
        int[] givenOrder = DAGSort.sortDAG(edges);
        boolean found = false;

        for (int[] possibleOrder : possibleOrders) {
            if (Arrays.equals(givenOrder, possibleOrder)) {
                found = true;
                break;
            }
        }
        return found;
    }

    @Test
    void singleNode() throws CycleDetectedException, InvalidNodeException {
        int[][] edges = {{}};
        assertArrayEquals(DAGSort.sortDAG(edges), new int[]{0}, "The order is just the single node.");
    }

    @Test
    void nullParameter() {
        assertThrows(NullPointerException.class, () -> DAGSort.sortDAG(null), "Edges cannot be null.");
    }

    @Test
    void inputCycles() {
        int[][] edges = {{1}, {2}, {0}};
        assertThrows(CycleDetectedException.class, () -> DAGSort.sortDAG(edges), "A cycle was found in the input graph.");
    }

    @Test
    void invalidEdges() {
        int[][] edges = {{1,2,5}, {-1,1,3}};
        assertThrows(InvalidNodeException.class, () -> DAGSort.sortDAG(edges), "Edges must be labelled from 0 to edges.length - 1.");
    }
}
