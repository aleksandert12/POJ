//*******************************************************************
// Aleksander Tyñski 
// Klaudia Klebba
// Zadanie 1.Utwórz klasê cz³owieka i jego atrybuty
// 
//*******************************************************************


public class Human {
    private int age;
    private double weight;
    private double height;
    private String name;
    private boolean isMale;
  	private int feet_size;
  	private int nr_indeksu;

    public Human (int age, double weight, double height, String name, boolean isMale, int feet_size, int nr_indeksu) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.isMale = isMale;
      	this.feet_size = feet_size;
      	this.nr_indeks = nr_indeksu;
    }

    public boolean isMale() {
        return male;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }
  	public int getfeet_size(){
    	return feet_size;
  	}
  	public int getnr_ineksu(){
    	return nr_indeksu ;
    }
  public static void main(String[] args){ 
  
    Human Klaudia = new Human(22,55,160,klaudia,kobieta,38,18870);
    Human Aleksander = new Human (21,90,196,aleksander,mê¿czyzna,48,19465);  
  }
}

