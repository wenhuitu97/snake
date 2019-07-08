package com.wenhuitu97.snake;

import java.awt.*;
import java.util.Random;

/**
 * @author wenhuitu97
 * @date 2019-07-08 23:29
 */
public class Egg {
    int row, col;
    Random r = new Random();

    public Egg(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void paint(Graphics g) {
        int x = Yard.x + col * Yard.NodeSize;
        int y = Yard.y + row * Yard.NodeSize;

        Color c = g.getColor();
        g.setColor(Color.red);
        g.fillOval(x, y, Yard.NodeSize, Yard.NodeSize);

        g.setColor(c);
    }

    public void reAppear() {
        this.row = r.nextInt(Yard.NodeCount);
        this.col = r.nextInt(Yard.NodeSize);
    }
}
