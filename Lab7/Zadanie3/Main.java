/*
Autor: Tyński Aleksander
Zadanie 3   Lab7
 */

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main
{
    public static void main(String[] args)
    {
        Cache cache = Cache.getInstance();

       Timer t1 = new Timer();
        t1.schedule(new Repeater(cache), 0,10000);
    }
}
