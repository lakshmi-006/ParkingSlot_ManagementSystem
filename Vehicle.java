public class Vehicle {
    private String vehiclenumber;
    private String ownername;

    public Vehicle(String vehiclenumber,String ownername){
        this.vehiclenumber = vehiclenumber;
        this.ownername = ownername;
    }

    public String getvehiclenum(){
        return vehiclenumber;
    }

    public String getname(){
        return ownername;
    }

    public void display(){
        System.out.println("VehicleNumber: "+vehiclenumber);
        System.out.println("Owner_Name: "+ownername);
    } 
}