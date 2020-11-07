import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

  public static void mainDraw(Graphics graphics) {

    int distanceBetweenLines = 20;
    int yEnd = 0;
    int xEnd = 0;

    for (int i = 0; i < distanceBetweenLines; i++) {
      graphics.setColor(Color.green);
      drawLikeVasarely(i * distanceBetweenLines, HEIGHT, 0, yEnd += distanceBetweenLines, graphics);
      graphics.setColor(Color.pink);
      drawLikeVasarely(WIDTH, i * distanceBetweenLines, xEnd += distanceBetweenLines, 0, graphics);
    }
  }

  public static void drawLikeVasarely(int xStart, int yStart, int xEnd, int yEnd, Graphics g){
    g.drawLine(xStart, yStart, xEnd, yEnd);
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
