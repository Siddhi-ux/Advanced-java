import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeExample {

    public static void main(String[] args) {
        // Create the root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // Create some child nodes
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        DefaultMutableTreeNode child3 = new DefaultMutableTreeNode("Child 3");

        // Add the child nodes to the root node
        root.add(child1);
        root.add(child2);
        root.add(child3);

        // Create the JTree with the root node
        JTree tree = new JTree(root);

        // Create a scroll pane and add the tree to it
        JScrollPane scrollPane = new JScrollPane(tree);

        // Create the JFrame and add the scroll pane to it
        JFrame frame = new JFrame("JTree Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }
}
