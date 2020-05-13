package Y1S2.lab4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class DAGSortTest {
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
