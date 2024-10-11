import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        JFrame frame = new JFrame("Binary Tree Visualizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(new TreeVisualizer(tree.root));
        frame.setVisible(true);
    }
}
