/*
Autor: Tyński Aleksander
Zadanie 3   Lab 7
 */


public class CacheUnit 
{
    private int id;
    private int key;
    private String stringkey;
    private String value;
    private String enumerationName;

    public CacheUnit(int id, int key, String stringkey, String value, String enumerationName) 
    {
        this.id = id;
        this.key = key;
        this.stringkey = stringkey;
        this.value = value;
        this.enumerationName = enumerationName;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }
    public int getKey() 
    {
        return key;
    }

    public void setKey(int key) 
    {
        this.key = key;
    }

    public String getStringkey()
    {
        return stringkey;
    }
    public void setStringkey(String stringkey) 
    {
        this.stringkey = stringkey;
    }

    public String getValue() 
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public String getEnumerationName() 
    {
        return enumerationName;
    }
    public void setEnumerationName(String enumerationName) 
    {
        this.enumerationName = enumerationName;
    }
}
