package com.wenhuitu97.snake;

import java.awt.*;

/**
 * @author wenhuitu97
 * @date 2019-07-08 22:15
 */
public class Node {
    int row, col;

    Node prev, next;
    public Node(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void paint(Graphics g) {
        int x = Yard.x + col * Yard.NodeSize;
        int y = Yard.y + row * Yard.NodeSize;

        Color c = g.getColor();
        g.setColor(Color.black);
        g.fillRect(x, y, Yard.NodeSize, Yard.NodeSize);

        g.setColor(c);
    }
}
