package BroCodeJava.ObjectOriented.Oops.GettersAndSetters;

public class Car {

    private final String model; // To not change once we assign we don't want it to change so we use 'private'
    // if you don't want model to writable when you declare it you can also add "final" keyword which works as an extra security measure
   private String color;
     private int price;

    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    String getPrice(){
        return "$"+this.price;
    }



    void setColor(String color){
        this.color = color;
    }

    void setPrice(int price){
        if(price < 0){
            System.out.println("Price can't be less than zero");
        }else {
            this.price = price;
        }
    }
}
