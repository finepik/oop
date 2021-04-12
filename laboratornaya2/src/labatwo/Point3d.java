package labatwo;

public class Point3d extends Point2d{
private double zCoord;
public Point3d (double x, double y, double z) {
    super(x, y);
    zCoord=z;
}
public  Point3d (){
    this(0.0,0.0,0.0);}
    //конструктор по умолчанию
    public double getZ () { //возвращение координаты x
        return zCoord;
    }
    public void setZ ( double val) {
        zCoord = val; //установка значения координаты х
    }

    public boolean сheck(Point3d point) {
        if (this.getX() == point.getX() && this.getY() == point.getY() && this.getZ() == point.getZ()){
            return true;}
        else
            return false; //метод для сравнения значений двух объектов Point3d
    }

    public double distanceTo(Point3d point){
        if(this.сheck(point)) return 0;
        return Math.pow((Math.pow((this.getX() - point.getX()),2.0)
                + Math.pow((this.getY() - point.getY()),2.0) + Math.pow((this.getZ() - point.getZ()),2.0)), 0.5);
    } // вычисляет расстояние между двумя точками с точностью до двух знаков после запятой и возвращает полученное значение
}
