import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

  public static void mainDraw(Graphics graphics) {

    int distanceBetweenLines = 12;
    int size = 320;
    int center = size/2;
    int xStart1 =  center;
    int xStart2 = center;
    int xStart3 = center;
    int xStart4 = center;
    int yEnd1 = 0;
    int yEnd2 = size;
    int yEnd3 = size;
    int yEnd4 = 0;

    for (int i = 0; i < 12; i++) {
      graphics.setColor(Color.green);
      drawLikeVasarely(xStart1 += distanceBetweenLines, center, center, yEnd1 += distanceBetweenLines, graphics);
      drawLikeVasarely(xStart2 += distanceBetweenLines, center, center, yEnd2 -= distanceBetweenLines, graphics);
      drawLikeVasarely(xStart3 -= distanceBetweenLines, center,center, yEnd3 -= distanceBetweenLines, graphics);
      drawLikeVasarely(xStart4 -= distanceBetweenLines, center,center, yEnd4 += distanceBetweenLines, graphics);
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

