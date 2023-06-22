import java.util.*;
import episunsa.*;

class Programa1 {
  public static void main(String[] args) {
    SimpleImage img = new SimpleImage("lab.png");
    Scanner sc = new Scanner(System.in);

    for(int i = 0; i < img.getWidth(); i += 1){
      for(int j = 0; j < img.getHeight(); j += 1) {
        Pixel px = img.getPixel(i, j);
        px.setRed(0);
        px.setBlue(0);
        px.setGreen(255);
      }
    }

    img.print();
  }
}
