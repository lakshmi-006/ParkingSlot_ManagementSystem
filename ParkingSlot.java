public class ParkingSlot {
    private int slotnum;
    private boolean occupied;
    private Vehicle vehicle;

    public ParkingSlot(int slotnum){
        this.slotnum = slotnum;
        this.occupied = false;
        this.vehicle = null;
    }
    public int getslotnum(){
        return slotnum;
    }
    public boolean isoccupied(){
        return occupied;
    }    
    public Vehicle getvehicle(){
        return vehicle;
    }
    public void parkvehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        this.occupied = true;
    }
    public void removevehicle(){
        this.vehicle = null;
        this.occupied = false;
    }
    public void displayslot(){
        System.out.println("Slot Number: "+slotnum);
        if(occupied){
            System.out.println("Status: Occupied");
            System.out.println("Vehicle number: "+vehicle.getvehiclenum());
        }else{
            System.out.println("Available");
        }
    }
}
