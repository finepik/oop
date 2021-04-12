package laba_3;

import java.util.*;
/**
 Этот класс хранит базовое состояние, необходимое для алгоритма A * для вычисления
 пути по карте. Это состояние включает в себя набор «открытых путевых точек» и
 еще один набор «закрытых путевых точек». Кроме того, этот класс предоставляет
 основные операции, необходимые алгоритму поиска пути A * для выполнения
 обработки.
*/
public class AStarState
{
    /** Это ссылка на карту, по которой перемещается алгоритм A *. **/
    private Map2D map;

    // Инициализируем поле для открытых вершин
    private Map<Location, Waypoint> open = new HashMap<Location, Waypoint> ();

    // Инициализируем поле для закрытых вершин.
    private Map<Location, Waypoint> closed = new HashMap<Location, Waypoint> ();

    /**
     * инициализировать новый объект состояния для использования алгоритма поиска пути A *
     **/
    public AStarState(Map2D map)
    {
        if (map == null)
            throw new NullPointerException("map cannot be null");// обработка исключения в случае если null

        this.map = map; //как конструктор??
    }

    /** Возвращает карту, по которой перемещается поисковик A (значение??) **/
    public Map2D getMap()
    {
        return map;
    }

    /**
     Этот метод просматривает все открытые путевые точки и возвращает путевую точку.
     с минимальной общей стоимостью. Если нет открытых путевых точек, этот метод
     возвращает <code> null </code>.
     **/
    public Waypoint getMinOpenWaypoint()
    {
// Если в "открытом" наборе нет вершин, возвращаем NULL.
        if (numOpenWaypoints() == 0)
            return null;

        Set openKeys = open.keySet(); //получаем ключи открытых вершин
        Iterator i = openKeys.iterator(); //инициализируем итератор
        Waypoint min = null; //Создаем пустую переменную с наименьшей общей стоимостью
        float minCost = Float.MAX_VALUE; //Инициализируем переменную для наименьшей общей
// стоимости наибольшим возможным float

// Проходим по всем открытым вершинам
        while (i.hasNext())
        {

            Location loc = (Location)i.next(); //Просматриваем текущую локацию

            Waypoint waypoint = open.get(loc);// просматриваем текущую точку

            float totalCost = waypoint.getTotalCost();//получаем вес точки

/* Если общая стоимость для текущей путевой точки лучше (ниже)
чем сохраненная стоимость для сохраненной лучшей путевой точки, замените
сохраненную путевую точка на текущую путевую точку и сохраненную
общую стоимость на текущую общую стоимость.*/
            if (totalCost < minCost)
            {
                min = open.get(loc);
                minCost = totalCost;
            }

        }
// Returns the waypoint with the minimum total cost.
        return min;
    }

    /**
      This method adds a waypoint to (or potentially updates a waypoint already
      in) the "open waypoints" collection. If there is not already an open
      waypoint at the new waypoint's location then the new waypoint is simply
      added to the collection. However, if there is already a waypoint at the
      new waypoint's location, the new waypoint replaces the old one <em>only
      if</em> the new waypoint's "previous cost" value is less than the current
      waypoint's "previous cost" value.
     **/
    public boolean addOpenWaypoint(Waypoint newWP)
    {
        Location loc = newWP.getLocation(); //получаем локацию точки
        if (open.containsKey(loc)) { //containsKey() чтобы проверить, находится ли данный ключ уже в HashMap или нет?
            Waypoint current = open.get(loc);
            if (current.getTotalCost() > newWP.getTotalCost()) { //если стоимость новой точки меньше, чем текущей
                open.put(loc, newWP); //заменяем предыдущую на новую
                return true;
            }
            return false;
        }
        else {
            open.put(loc, newWP); //если нет данной локации в открытых точках, добавляем ее
            return true;
        }
    }


    public int numOpenWaypoints()
    {
// возвращает количество точек в наборе открытых вершин
        return open.size();
    }


    public void closeWaypoint(Location loc)
    {
        Waypoint waypoint = open.remove(loc); //удаляем вершину с данной локацией из открытых
        closed.put(loc, waypoint); //добавляем вершину с данной локацией в закрытые

    }


    public boolean isLocationClosed(Location loc)
    {


        return closed.containsKey(loc);//возвращаем встречается ли данная локация в наборе закрытых вершин
    }
}