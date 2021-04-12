package labatwo;

import java.util.Scanner;

public class LAB1  {
    public static void main(String[] args) {
        Scanner dot = new Scanner(System.in);
        System.out.println("Введите координаты первой точки");
        double x1 = dot.nextInt();
        double y1 = dot.nextInt();
        double z1 = dot.nextInt();
        System.out.println("Введите координаты второй точки");
        double x2 = dot.nextInt();
        double y2 = dot.nextInt();
        double z2 = dot.nextInt();
        System.out.println("Введите координаты третьей точки");
        double x3 = dot.nextInt();
        double y3 = dot.nextInt();
        double z3 = dot.nextInt();
        dot.close();
        Point3d point1 = new Point3d(x1,y1,z1);
        Point3d point2 = new Point3d(x2,y2,z2);
        Point3d point3 = new Point3d(x3,y3,z3);

    }
    public static double computeArea(Point3d p1, Point3d p2, Point3d p3){
        double a, b, c, p;
        if (p1.сheck(p2) && p2.сheck(p3) && p1.сheck(p3)) return 0;
        else{
            a = p1.distanceTo(p2);
            b = p2.distanceTo(p3);
            c = p1.distanceTo(p3);
            p = (a+b+c)/2;
            return Math.pow((p*(p-a)*(p-b)*(p-c)),0.5); //вычисляет площадь треугольника, образованного этими точками
        }
    }
}
