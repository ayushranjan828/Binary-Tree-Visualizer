import javax.swing.*;
import java.awt.*;

class TreeVisualizer extends JPanel {
    private Node root;

    public TreeVisualizer(Node root) {
        this.root = root;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (root != null) {
            drawTree(g, root, getWidth() / 2, 50, getWidth() / 4);
        }
    }

    private void drawTree(Graphics g, Node node, int x, int y, int xOffset) {
        if (node == null) return;
        g.drawString(String.valueOf(node.value), x, y);
        if (node.left != null) {
            g.drawLine(x - 10, y + 10, x - xOffset, y + 50);
            drawTree(g, node.left, x - xOffset, y + 50, xOffset / 2);
        }
        if (node.right != null) {
            g.drawLine(x + 10, y + 10, x + xOffset, y + 50);
            drawTree(g, node.right, x + xOffset, y + 50, xOffset / 2);
        }
    }
}
