public class Car extends Vehicle{
    private String fueltype;
    
    public Car(String vehiclenumber,String ownername,String fueltype){
        super(vehiclenumber,ownername);
        this.fueltype = fueltype;
    }

    
    public void cardetails(){
        display();
        System.out.println("Vehicle Type: Car");
        System.out.println("FuelType: "+fueltype);
    }
}
