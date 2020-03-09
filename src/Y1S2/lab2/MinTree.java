package Y1S2.lab2;

import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.recursion.MinimumInTree;
import uk.ac.soton.ecs.comp1206.labtestlibrary.datastructure.Tree;

public class MinTree implements MinimumInTree {
    public static void main(String[] args){
        Tree tree = new Tree( 24, new Tree(45,null, new Tree(8,null,null)), new Tree(17, new Tree(74,null,null),null));
        MinTree minTree = new MinTree();
        System.out.println("Minimum is: " + minTree.findMin(tree));
    }

    // Finds the min value in a tree by recursion.
    public int findMin(Tree tree){
        if (tree.left() == null && tree.right() == null) {
            return tree.getVal();
        } else {
            return findMinAux(tree);
        }
    }

    // Finds the min of the child trees.
    public int findMinAux(Tree tree) {
        if (tree.left() == null) {
            return Math.min(tree.getVal(), findMin(tree.right()));
        } else if (tree.right() == null) {
            return Math.min(tree.getVal(), findMin(tree.left()));
        } else {
            return Math.min(tree.getVal(), Math.min(findMin(tree.left()), findMin(tree.right())));
        }

    }
}
