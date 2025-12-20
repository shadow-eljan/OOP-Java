package Theory;

public class Car {
    private String brand;
    private String name;
    private int price;

    Car(){
         brand="Unknown";
         name="Unknown";
         price=0;
    }
    Car(String brand, String name, int price){
        this.brand=brand;
        this.name = name;
        this.price = price;
    }
    public void info(){
        System.out.println(brand+" "+name+" "+price);
    }

}
