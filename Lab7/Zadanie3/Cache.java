/*
Autor: Tyński Aleksander
Zadanie 3   Lab7
 */
import java.util.ArrayList;
import java.util.LinkedList;

public class Cache {
    private static Cache instance = null;


    private LinkedList<CacheUnit> cacheUnits;

    public static Cache getInstance() {
        if (instance == null) {
            instance = new Cache();
        }
        return instance;
    }

    private Cache() {
        cacheUnits = new LinkedList<>();
    }

    public void addUnit(CacheUnit cacheUnit){
        cacheUnits.add(cacheUnit);

    }

    public void resetCache(){
        this.cacheUnits.clear();
    }


    public void printCache(){
        for (CacheUnit x: cacheUnits) {
            System.out.format("%1$s\t|  %2$s\t|  %3$s\t\t|  %4$s\t|  %5$s |%n",x.getId(),x.getKey(),x.getStringkey(),x.getValue(),x.getEnumerationName());
        }
        System.out.println("----------------------");
    }


}
