import java.util.ArrayList;
public class ParkingSystem {
    private ArrayList<ParkingSlot> parkingSlots;
    private ArrayList<ParkingTicket> parkingTickets;
    
    private int nextticketId;

    public ParkingSystem(int numberofslots){
        parkingSlots = new ArrayList<>();
        parkingTickets = new ArrayList<>();
        nextticketId = 1;
        for(int i=1;i<=numberofslots;i++){
            parkingSlots.add(new ParkingSlot(i));
        }
    }
    public void displayallslots(){
        for(ParkingSlot s:parkingSlots){
            s.displayslot();
            System.out.println();
        }
    }
    public void parkvehicle(Vehicle vehicle){
        if(isVehicleAlreadyParked(vehicle.getvehiclenum())){
            System.out.println("Vehicle is already parked. ");
            return;
        }
        for(ParkingSlot s : parkingSlots){
            if(!s.isoccupied()){
                s.parkvehicle(vehicle);
                ParkingTicket ticket = new ParkingTicket(nextticketId, vehicle, s.getslotnum());
                parkingTickets.add(ticket);
                nextticketId++;
                System.out.println("Vehicle parked successfully. ");
                System.out.println("Allocated slot: "+s.getslotnum());
                System.out.println("Ticket Id: "+ticket.getticketId());
                return;
            }
        }
        System.out.println("Sorry! No parking slots available.");
    }
    private boolean isVehicleAlreadyParked(String vehiclenum){
        for(ParkingSlot s: parkingSlots){
            if(s.isoccupied()&&s.getvehicle().getvehiclenum().equalsIgnoreCase(vehiclenum)){
                return true;
            }
        }
        return false;
    }
    public void searchvehicle(String vehiclenumber){
        for(ParkingSlot s:parkingSlots){
            if(s.isoccupied() && s.getvehicle().getvehiclenum().equalsIgnoreCase(vehiclenumber)){
                System.out.println("Vehicle found.");
                System.out.println("Vehicle Number: "+s.getvehicle().getvehiclenum());
                System.out.println("Owner name: "+s.getvehicle().getname());
                System.out.println("Slot Number: "+s.getslotnum());
                return;
            }
        }
        System.out.println("Vehicle not found.");
    }
    public void exitvehilce(String vehiclenumber){
        for(ParkingSlot s:parkingSlots){
            if(s.isoccupied()&&s.getvehicle().getvehiclenum().equalsIgnoreCase(vehiclenumber)){
                ParkingTicket ticket = findActiveTicket(vehiclenumber);
                if(ticket!=null){
                    ticket.exitTicket();
                    System.out.println("Vehicle exited");
                    System.out.println();
                    ticket.displayTicketdetails();
                    s.removevehicle();
                    return;
                }
            }
        }
        System.out.println("Vehicle is not currently parked.");
    }
    private ParkingTicket findActiveTicket(String vehiclenumber){
        for(ParkingTicket t:parkingTickets){
            if(t.getexitTime()==null&&t.getVehicle().getvehiclenum().equalsIgnoreCase(vehiclenumber)){
                return t;
            }
        }
        return null;
    }
    public void displayhistory(){
        if(parkingTickets.isEmpty()){
            System.out.println("No parking history available.");
            return;
        }
        for(ParkingTicket t:parkingTickets){
            t.displayTicketdetails();
            System.out.println("==============================================");
        }
    }
}