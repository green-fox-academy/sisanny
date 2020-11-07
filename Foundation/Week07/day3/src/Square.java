import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Square {
  private static final int LIMIT = 3;
  private static List<Color> colors;

  public static void mainDraw(Graphics graphics) {
    int size = HEIGHT / 2;
    int x = size / 2;
    int y = size /2;

    colors = new ArrayList<>();
    colors.add(Color.black);
    colors.add(Color.green);
    colors.add(Color.blue);
    colors.add(Color.magenta);

    drawSquares(graphics, x, y, size, 0);

  }

  public static void drawSquares(Graphics graphics, int x, int y, int size, int counter) {
    if (counter > LIMIT) {
      return;
    }

    graphics.setColor(colors.get(counter));
    graphics.drawRect(x, y, size, size);


    drawSquares(graphics, x - (size/4), y - (size/4), size/2, counter + 1);
    drawSquares(graphics, x + size - (size/4), y - (size/4), size/2, counter + 1);
    drawSquares(graphics, x - (size/4), y + size - (size/4), size/2, counter + 1);
    drawSquares(graphics, x + size -(size/4), y + size - (size/4), size/2, counter + 1);

  }


    //region Static code
    // Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 400;

    public static void main (String[]args){
      JFrame jFrame = new JFrame("Drawing");
      jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
      ImagePanel panel = new ImagePanel();
      panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
      jFrame.add(panel);
      jFrame.setLocationRelativeTo(null);
      jFrame.setVisible(true);
      jFrame.pack();
    }

    static class ImagePanel extends JPanel {
      @Override
      protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        mainDraw(graphics);
      }
    }
    //endregion
  }
