package labatwo;

public class Point2d {
    private double xCoord;
    private double yCoord;
    public Point2d ( double x, double y) {
        xCoord = x;
        yCoord = y; //конструктор инициализации

    }
    public Point2d () {
//Вызов конструктора с двумя параметрами
        this(0, 0);
    }
    public double getX () { //возвращение координаты x
        return xCoord;
    }

    public double getY () { //возвращение координаты y
        return yCoord;
    }
    public void setX ( double val) {
        xCoord = val; //установка зачиеня координаты х
    }
    public void setY ( double val) {
        yCoord = val; //установка зачиеня координаты y
    }

}
