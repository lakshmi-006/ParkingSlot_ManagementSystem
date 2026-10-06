import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ParkingSystem parkingSystem = new ParkingSystem(5);
        int choice;
        do{
            System.out.println("PARKING SLOT MANAGEMENT SYSTEM");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Search Vehicle");
            System.out.println("3. Exit Vehicle");
            System.out.println("4. Display all slots");
            System.out.println("5. Display parking history");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("1. Car");
                    System.out.println("2. Bike");
                    System.out.print("Enter vehicle type: ");

                    int type = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter vehicle number: ");
                    String vehiclenum = sc.nextLine();

                    System.out.print("Enter owner name: ");
                    String ownername = sc.nextLine();
                    
                    if(type==1){
                        System.out.println("Enter fuel type: ");
                        String fueltype = sc.nextLine();
                        Car c = new Car(vehiclenum,ownername,fueltype);
                        parkingSystem.parkvehicle(c);
                    }else if(type==2){
                        System.out.println("Enter engine capacity (cc): ");
                        int capacity = sc.nextInt();
                        sc.nextLine();
                        Bike b = new Bike(vehiclenum, ownername, capacity);
                        parkingSystem.parkvehicle(b);
                    }else{
                        System.out.println("Invalid vehicle type.");
                    }
                    break;

                case 2:
                    sc.nextLine();
                    System.out.println("Enter vehicle number to search: ");
                    String num = sc.nextLine();
                    parkingSystem.searchvehicle(num);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Enter vehicle number for exit: ");
                    String exit = sc.nextLine();
                    parkingSystem.exitvehilce(exit);
                    break;
                case 4:
                    System.out.println("---------PARKING SLOTS----------");
                    parkingSystem.displayallslots();
                    break;
                case 5:
                    System.out.println("---------PARKING HISTORY----------");
                    parkingSystem.displayhistory();
                    break;
                case 6:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid choice. please try again.");
            }
        }while(choice!=6);
    }
    
}
