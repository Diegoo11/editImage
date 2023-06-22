import java.util.*;
import episunsa.*;

class Programa1 {
  public static void main(String[] args) {
    SimpleImage img = new SimpleImage("lab.png");
    SimpleImage bg = new SimpleImage("background.jpg");
    Scanner sc = new Scanner(System.in);

    for(Pixel px: img){
      int green = px.getGreen();
      if (green == 255) {
        int x = px.getX();
        int y = px.getY();
        Pixel pxBg = bg.getPixel(x, y);

        px.setBlue(pxBg.getBlue());
        px.setGreen(pxBg.getGreen());
        px.setRed(pxBg.getRed());
      }
    }
    img.print();
  }
}
