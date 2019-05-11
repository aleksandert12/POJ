/*
Autorzy: Aleksander Tyński
         Maciej Falkiewicz
         klasa main do zadan Lab5
     */
public class Main {

    public static void main(String[] args) {

        MyPoint punkt = new MyPoint(1,1);

        MyPoint[] punkty = new MyPoint[10];
        for (int i = 0; i < punkty.length; i++) {
            punkty[i] = new MyPoint(i + 1, i + 1);
        }
        for (MyPoint punk : punkty)
        {
            System.out.println("Dystans między punktami "+punkt+" oraz "+punk+"wynosi "+punkt.distance(punk));
        }

        MyCircle kolo = new MyCircle(5,5,10);
        MyCircle kolo1 = new MyCircle(10,3,23);
        System.out.println(kolo.toString());
        System.out.println("Odległość między środkami okręgów "+kolo.distance(kolo1));
        MyTriangle trojkat=new MyTriangle(1,3,1,3,4,5);
        System.out.println(trojkat.getType());
        MyRectangle prostokat=new MyRectangle(5,2,10,1);
        System.out.println(prostokat.getArea());
        Customer klient = new Customer(2,"Aleksander",15);
        System.out.println(klient.toString());
        Invoice faktura = new Invoice(2,klient,321);
        System.out.println(faktura.getAmountAfterDiscount());

    }
}
