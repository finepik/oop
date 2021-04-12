package laba_3;

import java.util.Objects;

/**
     * This class represents a specific location in a 2D map.  Coordinates are
     * integer values.
     **/
    public class Location
    {
        /** X coordinate of this location. **/
        public int xCoord;

        /** Y coordinate of this location. **/
        public int yCoord;


        /** Creates a new location with the specified integer coordinates. **/
        public Location(int x, int y)
        {
            xCoord = x;
            yCoord = y;
        }

        /** Creates a new location with coordinates (0, 0). **/
        public Location()
        {
            this(0, 0);
        }

        /** сравнение позиций **/
        public boolean equals(Object obj) {


            if (obj instanceof Location && obj!=null) { //принадлежит ли объект нужному классу и не равен ли null

                Location other = (Location) obj;
                if (xCoord == other.xCoord && yCoord == other.yCoord) { //проверка равенства координат
                    return true;
                }
            }

            return false;
        }

        /** получение хеш-кода для каждой позиции **/
        public int hashCode() {

            // случайное число
            int result = 37;

            // второе случайное число и вычисление
            result = 17 * result + xCoord;
            result = 17 * result + yCoord;

            return result;

        }
    }

