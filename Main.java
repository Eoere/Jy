/*
Elias Brahimi Program 4
*/

import java.util.Scanner;

class Main {

  public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
    // Declare and populate vehicles collection
		Vehicles vehs = new Vehicles();
    int option;
    
    // Init
		boolean quit = false;
    //POPULATE VEHICLES
		populate(vehs);
    //Command Loop
    while(!quit){
        try{
          displayMenu();
				  option = getOption(input);
          if(option==7)
            quit=true;
          else
            execute(option, vehs, input);
        }
        catch (ReservedVehicleException e) {
			  System.out.println("* Vehicle Already Reserved *");
		  }
		  catch (UnreservedVehicleException e) {
			  System.out.println("* No Reservation for Vehicle Found *");
		  }
      catch (VINNotFoundException e){
        System.out.println("* VIN not found*");
      } 
    }
  }
//display menu
    public static void displayMenu(){
      System.out.println("1- Display all vehicles");
      System.out.println("2- Display available vehicles");
      System.out.println("3- Reserve a vehicle");
      System.out.println("4- Display reservation");
      System.out.println("5- Cancel reservation");
      System.out.println("6- Add vehicle");
      System.out.println("7- QUIT");
    }
  //get option
    public static int getOption(Scanner input){
      int option;
      System.out.println("Select an option");
      option = input.nextInt();
      return option;
    }
//execute
    public static void execute(int option, Vehicles vehs, Scanner input){
      boolean quit = false;
      switch(option) {
					case 1: displayAllVehicles(vehs); break;
					case 2: displayAvailableVehicles(vehs); break;
					case 3: reserveVehicle(vehs, input); break;
					case 4: displayReservation(); break;
					case 5: cancelReservation(); break;
					case 6: addVehicle(); break;
					case 7: quit = true;
				}
    }
//populate
    public static void populate(Vehicles vehs)
    {
      vehs.add(new Car("Chevrolet Camaro - 2019", 30, 2, "KH4GM4564GQ"));
      vehs.add(new Car("Ford Fusion - 2018", 34, 4, "AB4FG5689GM"));
      vehs.add(new Car("Ford Fusion Hybrid", 32, 4, "KV4EG3245RV"));
      vehs.add(new Car("Chevrolet Impala - 2018", 32, 4, "RK3MB3266YH"));
      vehs.add(new SUV("Honda Odyssey - 2020", 28, 7, 6, "VM9RE2635TD"));
      vehs.add(new SUV("Dodge Caravan - 2019", 25, 5, 4, "QK3FT4273NE"));
      vehs.add(new SUV("Ford Expedition - 2019", 21, 5, 3, "JK2HL8364HY"));
      vehs.add(new Truck("Ten-Foot", 12, 2810, "EJ5KU2437BD"));
      vehs.add(new Truck("Eighteen-Foot", 10, 5960, "KG4ND5372RK"));
      vehs.add(new Truck("Twenty-Four-Foot", 8, 6500, "EB2WR3082OB"));
      vehs.add(new Truck("Twenty-Four-Foot", 8, 6510, "TV3GH4390EK"));
    }
    public static void displayAllVehicles(Vehicles v){
      v.reset();
      while(v.hasNext()){
          System.out.println(v.getNext().toString());
        }
      }
    public static void displayAvailableVehicles(Vehicles v){
      v.reset();
      Vehicle vehs;
      while(v.hasNext()){
        vehs = v.getNext();
        if(!vehs.isReserved()){
          System.out.println(vehs.toString());
        }
      }
    }
    public static void reserveVehicle(Vehicles v, Scanner input) throws VINNotFoundException, ReservedVehicleException
  {
    Vehicle vehs;
    System.out.println("Enter the VIN # to reserve a vehicle...");
    String vin= input.nextLine();
    vehs= v.getVehicle(vin);
    if(vehs.isReserved())
      throw new ReservedVehicleException();
    
      System.out.println("Enter a name");
      String name= input.nextLine();
      System.out.println("Enter the credit card number:");
      String creditCardNum= input.nextLine();
      System.out.println("Enter the duration lenghth of rental time:");
      char timeUnit= input.next().charAt(0);
      System.out.println("Enter the lenghth of rental time:");
      int numUnits= input.nextInt();
      System.out.println("Do you want daily insurance? Type 1 for yes or 2 for no");
      int insuranceAnswer= input.nextInt();

    TimeSpan timespan= new TimeSpan(timeUnit, numUnits);
    Reservation resv = new Reservation(name, creditCardNum, insuranceAnswer !=0, timespan);
    vehs.reserve(resv);
  }

    public static void displayReservation(){
      Scanner input= new Scanner(System.in);
      Vehicles v= new Vehicles();
      System.out.println("In order to display the reservation, enter the VIN number...");
      String vin= input.nextLine();
      Vehicle vehs= v.getVehicle(vin);

      if(vehs != null){
        Reservation resv= vehs.getReservation();
        if(resv!=null){
          System.out.println(resv.toString());
        }
      }
    }
    public static void cancelReservation(){
      Scanner input = new Scanner(System.in);
      Vehicles v= new Vehicles();
      System.out.println("In order to cancel the reservation, enter the VIN number...");
      String vin= input.nextLine();
      Vehicle vehs= v.getVehicle(vin);
      Reservation resv= vehs.getReservation();
      if(resv!=null){
        vehs.cancelReservation();
      }  
    }

    public static void addVehicle(){
      Scanner input= new Scanner(System.in);
      Vehicles v = new Vehicles();
      int seatingCapacity;
      System.out.println("Enter VIN");
      String vin =input.nextLine();
      System.out.println("Enter description");
      String description =input.nextLine();
      System.out.println("Enter MPG");
      int mpg =input.nextInt();
      System.out.println("Enter name");
      String name =input.nextLine();
      System.out.println("Enter credit card number");
      String creditCardNum =input.nextLine();
      System.out.println("Enter the duration lenghth of rental time:");
      char timeUnit= input.next().charAt(0);
      System.out.println("Enter the lenghth of rental time:");
      int numUnits= input.nextInt();
      System.out.println("Do you want daily insurance? Type 1 for yes or 2 for no");
      int insuranceAnswer= input.nextInt();
      System.out.println("Enter vehicle type: C=Car, S=SUV, T=Truck");
      char vType= input.next().charAt(0);
      TimeSpan timespan= new TimeSpan(timeUnit, numUnits);
      Reservation resv = new Reservation(name, creditCardNum, insuranceAnswer !=0, timespan);
      switch(vType)
        {
          //int seatingCapacity;
          case 'C':
            System.out.println("Enter the seating capacity- ");
            seatingCapacity= input.nextInt();
            v.add(new Car(description, mpg, seatingCapacity, vin));
            break;
            
          case 'S':
            System.out.println("Enter the seating capacity- ");
            seatingCapacity= input.nextInt();
            System.out.println("Enter the cargo capacity- ");
            int cargoCapacity= input.nextInt();
            
            v.add(new SUV(description, mpg, seatingCapacity, cargoCapacity,             vin));
            break;

          case 'T':
            System.out.println("Enter the load capacity- ");
            int loadCapacity= input.nextInt();
            
            v.add(new Car(description, mpg, loadCapacity, vin));
            break;

          default:
            System.out.println("That is not a valid choice!");
            break;
        }
      System.out.println("The vehicle is added!");
    }
  Accounts acc= new Accounts();
  Transactions tran= new Transactions();
  acc.add(new Accountnew("1234560781", "Toyota", true));
  tran.add(new Transactions("6783560338", "Toyota", "car", "4 days", "500", "$150" ));
  tran.add(new Transactions("9821456389", "KIA", "SUV", "14 days", "1000", "$2500" ));
  tran.add(new Transactions("4518200453", "GMC", "Truck", "30 days", "650", "$3000" ));
  
    
  public static void displayAllAccounts(Accounts acct){
      acct.reset();
      while(acct.hasNext()){
          System.out.println(acct.getNext().toString());
        }
      }
  public static void displayAllTransactions(Transactions tran){
      tran.reset();
      while(tran.hasNext()){
          System.out.println(tran.getNext().toString());
        }
      }
  /*acc.add(new Account("1234560781", Toyota, true));
  tran.add(new Transactions("6783560338", "Toyota", "car", "4 days", "500", "$150" ));
  tran.add(new Transactions("9821456389", "KIA", "SUV", "14 days", "1000", "$2500" ));
  tran.add(new Transactions("4518200453", "GMC", "Truck", "30 days", "650", "$3000" ));*/
  

}

