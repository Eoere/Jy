/*
Elias Brahimi Program 4
*/

public class SUV extends Vehicle{
  private String description;
  private int mpg; 
  private String vin; 
  private Reservation resv;
  private int seatingCapacity;
  private int cargoCapacity;
  

  public SUV(String description, int mpg, int seatingCapacity, int cargoCapacity, String vin){
    super(description, mpg, vin);
    this.seatingCapacity= seatingCapacity;
    this.cargoCapacity= cargoCapacity;
     
  }
  public String getDescription() {
    return description;
  }
  
  public int getMpg() {
    return mpg;
  }
  
  public String getVIN() {
    return vin;
  }
  public int getSeatingCapacity(){
    return seatingCapacity;
  }
  public int getCargoCapacity(){
    return cargoCapacity;
  }
  public Reservation getReservation() {
    return resv;
  }
  public boolean isReserved() {
    return resv != null; 
  }
  public void reserve(Reservation r) {
    resv = r;
  }
  public void cancelReservation() {

   try
      {
        if(resv==null){
          throw new UnreservedVehicleException();
        }
        else{
          resv=null;
        }
      }
        catch (Exception e){
        System.out.println(e);
        }
  } 

  public String toString(){
    return "SUV: " + description + ", mpg: "+mpg+", Seating Capacity: " + seatingCapacity+ ", Cargo Capacity: " + cargoCapacity+ ", VIN: " + vin;
  }
  
}
