import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    // avoid code duplication.

    for (int i = 0; i < 4; i++) {
      graphics.setColor(getRandomColor());
      drawRectangles(getRandomSizeAndCoordinates(),getRandomSizeAndCoordinates(), getRandomSizeAndCoordinates(),getRandomSizeAndCoordinates(), graphics);
    }
  }

  public static Color getRandomColor () {
    Random random = new Random();

    int red = random.nextInt(256);
    int green = random.nextInt(256);
    int blue = random.nextInt(256);

    return new Color(red, green, blue);
  }

  public static int getRandomSizeAndCoordinates() {
    Random random = new Random();
    int maxValue = 321;
    return random.nextInt(maxValue);
  }

  public static void drawRectangles (int height, int width, int xStartCoordinate, int yStartcoordinate, Graphics graphics) {
    graphics.drawRect(xStartCoordinate, yStartcoordinate, width, height);
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
