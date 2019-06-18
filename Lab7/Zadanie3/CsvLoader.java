/*
Autor: Tyński Aleksander
Zadanie 3   Lab 7
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CsvLoader implements Dataloader 
{
    @Override
    public void loadData(Cache cache) 
    {
        Path pathToFile = Paths.get("/Users/Klaudia/Desktop/test.csv");

        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.UTF_8))
                {

            String line = br.readLine();

            while (line != null) 
            {

                String[] attributes = line.split(";");

                CacheUnit cacheUnit = new CacheUnit(Integer.valueOf(attributes[0]),Integer.valueOf(attributes[1]), attributes[2], attributes[3], attributes[4]);

                cache.addUnit(cacheUnit);

                line = br.readLine();
            }

        } catch (IOException ioe) 
        {
            ioe.printStackTrace();
        }
    }
}
