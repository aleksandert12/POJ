public class Main {
    public static void main(String[] args) {
  Employee Kacper = new Employee(1,"Kacper","Wieczorek",5000);
        InvoiceItem Aleksander = new InvoiceItem(1,"opis",5000,2);
        Account My = new Account(1,"Aleksander",1);
        System.out.println(Kacper);
        System.out.println(Aleksander);
        System.out.println(My);
          }
}
