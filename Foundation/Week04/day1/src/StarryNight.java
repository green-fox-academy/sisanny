import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
  public static void mainDraw(Graphics graphics) {
    // Draw the night sky:
    //  - The background should be black
    //  - The stars can be small squares
    //  - The stars should have random positions on the canvas
    //  - The stars should have random color (some shade of grey)

    int size = 320;
    int sizeSquare = 7;

    Color[] colors = {Color.DARK_GRAY, Color.GRAY, new Color (56,56,56), new Color(200,200,200),Color.WHITE};
    drawBlackBackground(graphics, size -  1);
    for (int i = 0; i < 50; i++) {
        drawStarryNight(getRandomCoordinates(), getRandomCoordinates(), sizeSquare, colors[getRandomColor(0, colors.length - 1)], graphics);
        }
  }

  public static int getRandomCoordinates() {
    Random random = new Random();
    int maxValue = 321;
    return random.nextInt(maxValue);
  }

  public static int getRandomColor(int min, int max) {
    Random randomColor = new Random();
    int randomNumber = randomColor.nextInt((max - min) + 1) + min;
    return randomNumber;
  }

  public static void drawBlackBackground(Graphics graphics, int size) {
    graphics.fillRect(0, 0, size, size);
    graphics.setColor(Color.BLACK);
  }

  public static void drawStarryNight(int x, int y, int sizeSquare, Color colors, Graphics graphics){
    graphics.fillRect(x, y, sizeSquare, sizeSquare);
    graphics.setColor(colors);
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
