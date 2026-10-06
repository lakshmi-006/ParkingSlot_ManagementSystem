public class Bike extends Vehicle {
    private int engineCapacity;

    public Bike(String vehiclenumber,String ownername,int engineCapacity){
        super(vehiclenumber,ownername);
        this.engineCapacity = engineCapacity;   
    }
    public void bikedetails(){
        display();
        System.out.println("Vehicle Type: Bike");
        System.out.println("Engine Capacity: "+engineCapacity);
    }
}
