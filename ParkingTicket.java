import java.time.LocalDateTime;
import java.time.Duration;
public class ParkingTicket {
    private int ticketId;
    private Vehicle vehicle;
    private int slotnumber;
    private LocalDateTime entrytime;
    private LocalDateTime exittime;
    private double parkingfee;

    public ParkingTicket(int ticketId,Vehicle vehicle,int slotnumber){
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.slotnumber = slotnumber;
        this.entrytime = LocalDateTime.now();
        this.exittime = null;
        this.parkingfee = 0.0;
    }
    public int getticketId(){
        return ticketId;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
    public int getslotnumber(){
        return slotnumber;
    }
    public LocalDateTime getentryTime(){
        return entrytime;
    }
    public LocalDateTime getexitTime(){
        return exittime;
    }
    public double getparkingFee(){
        return parkingfee;
    }
    public void exitTicket(){
        exittime = LocalDateTime.now();
        calculateParkingfee();
    }
    private void calculateParkingfee(){
        Duration d = Duration.between(entrytime,exittime);
        long hours = d.toHours();
        if(hours<1){
            hours = 1;
        }
        parkingfee = hours * 20;
    }
    public void displayTicketdetails(){
        System.out.println("Ticket ID: "+ticketId);
        System.out.println("Vehicle Number: "+vehicle.getvehiclenum());
        System.out.println("Slot Number: "+slotnumber);
        System.out.println("Entry time: "+entrytime);
        if(exittime!=null){
            System.out.println("Exit time: "+exittime);
            System.out.println("Parking fee: Rs. "+parkingfee);
        }else{
            System.out.println("Status: Currently Parked");
        }
    }
}
