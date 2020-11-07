import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.util.Random;

public class GoToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a function that draws a single line and takes 3 parameters:
    // The x and y coordinates of the line's starting point and the graphics
    // and draws a line from that point to the center of the canvas.
    // Draw at least 3 lines with that function using a loop.

    for (int i = 0; i < 3; i++) {
      drawALine(getCoordinates(), getCoordinates(), graphics);
    }
  }

  public static int getCoordinates() {
    Random random = new Random();
    int maxValue = 321;
    return random.nextInt(maxValue);
  }
  public static void drawALine (int xCoordinate, int yCoordinate, Graphics graphics) {
    int xCenter = WIDTH/2;
    int yCenter = HEIGHT/2;
    graphics.drawLine(xCoordinate, xCoordinate, xCenter, yCenter);
  }

  //region Pre-defined code
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
