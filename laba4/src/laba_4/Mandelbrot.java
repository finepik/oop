package laba_4;
import java.awt.geom.Rectangle2D;
public abstract class Mandelbrot extends FractalGenerator {

    public static final int MAX_ITTERATON = 2000;// ограничение на количество повторений

    /**
     * Метод позволяет генератору фракталов определить наиболее
     * «интересную» область комплексной плоскости для конкретного фрактала
     * Метод должен установить начальный диапазон в (-2 - 1.5i) - (1 + 1.5i). Т.е. значения x
     * и y будут равны -2 и -1.5 соответственно, а ширина и высота будут равны 3.
     *
     * @param range - прямоугольный предмет
     */
    public void getInitialRange(Rectangle2D.Double range) {
        range.x = -2;
        range.y = -1.5;
        range.width = 3;
        range.height = 3;
    }

    //    Реализует итеративную функцию для фрактала Мандельброта.
//     @param x - координата x
//     @param y - координата y
//     @return - возвращает количество итераций
//
    public int numIterations(double x, double y) {

        int iteration = 0;// начальное значение цикла


        double z_r = 0;
        double z_i = 0; // начальные мнимые и действительные числа
        /**
         * Функция для фрактала Мандельброта имеет вид: Zn = Zn-1^2 + c,
         * где все значения — это комплексные числа (z_r, z_i), Z0 = 0, и с - определенная точка фрактала,
         * которую мы отображаем на экране.
         *
         * Сравнение будет проводиться до тех пор, пока квадрат числа z по модулю не станет больше 2^2.
         */
        while (iteration < MAX_ITTERATON && z_r * z_r + z_i * z_i < 4)
        {
            double z_realUpdated = z_r * z_r - z_i * z_i + x;
            double z_imaginaryUpdated = 2 * z_r * z_i + y;
            z_r = z_realUpdated;
            z_i = z_imaginaryUpdated;
            iteration += 1;
        }

        /** Если алгоритм дошел до значения max_iteration нужно вернуть -1,
         *  чтобы показать, что точка не выходит за границы.
         */
        if (iteration == MAX_ITTERATON)
        {
            return -1;
        }

        // вернуть количество проделанных итераций
        return iteration;
    }
    }
}