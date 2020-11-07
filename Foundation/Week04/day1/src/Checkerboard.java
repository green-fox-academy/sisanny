import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.
    int size = 320;
    int xStartCoodrinates = 0;
    int yStartCoodrinates = 0;
    int sizeSquare = size / 10;

    for (int i = 0; i < 10; i++) {
      if(i != 0) {
        yStartCoodrinates = yStartCoodrinates + sizeSquare;
      }
      if ( i % 2 == 0) {
        xStartCoodrinates = 0;
      } else {
        xStartCoodrinates = sizeSquare;
      }
      for (int j = 0; j < 5; j++) {
        drawACheckerboard(xStartCoodrinates, yStartCoodrinates, sizeSquare, graphics);
        xStartCoodrinates = xStartCoodrinates + (2 * sizeSquare);
      }
    }
  }
  public static void drawACheckerboard(int xCoodrinates, int yCoodrinates, int sizeSquares, Graphics graphics) {
    graphics.setColor(Color.green);
    graphics.fillRect(xCoodrinates, yCoodrinates,sizeSquares, sizeSquares);

  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
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
}
