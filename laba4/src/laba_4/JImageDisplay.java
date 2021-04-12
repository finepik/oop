package laba_4;
import javax.swing.JComponent;
import java.awt.image.*;
import java.awt.*;

public class JImageDisplay extends JComponent {
    private BufferedImage image; //новое изображение

    JImageDisplay(int w, int h) {
        image = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);

        Dimension size = new Dimension(w, h);
        super.setPreferredSize(size);//метод из родительского класса с указаной  шириной и высотой


    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);
    }// Переопределение компонента paintComponent для использования собственного кода отрисовки

    public void clearImage() {
        for(int y = 0; y < image.getHeight(); ++y)
        {
            for(int x = 0; x < image.getWidth(); ++x)
            {
                image.setRGB(x, y, 0);
            }
        }

        //все пиксели изображения становятся черными
    }
    public void drawPixel(int x, int y, int rgbColor) {
        image.setRGB(x, y, rgbColor); //установка определенного цвета пикселей
    }
}