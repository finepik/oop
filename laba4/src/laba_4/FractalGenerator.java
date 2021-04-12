package laba_4;
import java.awt.geom.Rectangle2D;


/**
 * This class provides the common interface and operations for fractal
 * generators that can be viewed in the Fractal Explorer.
 */
public abstract class FractalGenerator {

    /**
     * This static helper function takes an integer coordinate and converts it
     * into a double-precision value corresponding to a specific range.  It is
     * used to convert pixel coordinates into double-precision values for
     * computing fractals, etc. //целочисленную координату преобразует в координату двойной точности
     *
     * @param rangeMin the minimum value of the floating-point range// мин знач диапазона с пл запятой
     * @param rangeMax the maximum value of the floating-point range//макс знач
     *
     *
     * @param size the size of the dimension that the pixel coordinate is from.
     *        For example, this might be the image width, or the image height.// размер измерения из которого исходит коор пикселя
     *             //может быть длина или ширина
     *
     * @param coord the coordinate to compute the double-precision value for.
     *        The coordinate should fall in the range [0, size].//коор для вычисления значения двойной точности. диап [0, size]
     */
    public static double getCoord(double rangeMin, double rangeMax,
                                  int size, int coord) {

        assert size > 0;//проверка, что размер >0
        assert coord >= 0 && coord < size; // проверка, что координата >=0 и < размера

        double range = rangeMax - rangeMin;
        return rangeMin + (range * (double) coord / (double) size);
    }


    /**
     * Sets the specified rectangle to contain the initial range suitable for
     * the fractal being generated. // задает прямоугольник, подходящий для заданного фрактала
     */
    public abstract void getInitialRange(Rectangle2D.Double range);


    /**
     * Updates the current range to be centered at the specified coordinates,
     * and to be zoomed in or out by the specified scaling factor. // центрирование по заданным координатам
     * //увеличение или уменьшение масштаба
     */
    public void recenterAndZoomRange(Rectangle2D.Double range,
                                     double centerX, double centerY, double scale) {

        double newWidth = range.width * scale;
        double newHeight = range.height * scale;

        range.x = centerX - newWidth / 2;
        range.y = centerY - newHeight / 2;
        range.width = newWidth;
        range.height = newHeight;
    }


    /**
     * Given a coordinate <em>x</em> + <em>iy</em> in the complex plane,
     * computes and returns the number of iterations before the fractal
     * function escapes the bounding area for that point.  A point that
     * doesn't escape before the iteration limit is reached is indicated
     * with a result of -1.
     */ //учитывая координаты, возвращает числло иттераций до того, как функция выйдет за пределы  ограничивающей области
    // не входящая/входящая?? точка возвращает -1
    public abstract int numIterations(double x, double y);
}

