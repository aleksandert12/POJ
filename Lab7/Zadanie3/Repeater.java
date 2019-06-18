/*
Autor: Tyński Aleksander
Zadanie 3  Lab 7 
 */

import java.util.TimerTask;

class Repeater extends TimerTask 
{
    Cache cache;
    public Repeater(Cache cache) 
    {
        this.cache = cache;
    }

    public void run()
    {
        CsvLoader csvLoader = new CsvLoader();
        cache.resetCache();
        csvLoader.loadData(cache);

        cache.printCache();
    }
}
