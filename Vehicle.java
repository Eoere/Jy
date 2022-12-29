/*
Elias Brahimi Program 4
*/

public abstract class Vehicle {
  //instance vars
  private String description; // stores make-model-year for cars and SUVs, stores length for trucks
  private int mpg; // miles per gallon rating
  private String vin; // unique vehicle identification number
  private Reservation resv; 
  private VehicleRates rates;
  
  public Vehicle (String description, int mpg, String vin){
    this.description= description;
    this.mpg= mpg;
    this.vin= vin;
    resv=null;
    rates= null; 
  }
  //methods
  public String getDescription() {
    return description;
  }
  
  public int getMpg() {
    return mpg;
  }
  
  public String getVIN() {
    return vin;
  }
  public abstract String toString(); // ABSTRACT METHOD – must be implemented in each subclass

  public Reservation getReservation(){
    if (resv==null){
      throw new UnreservedVehicleException();
    }
    else{
      return resv;
    }
  } //– throws UnreservedVehicleException if no reservation

  public boolean isReserved() {
    if (resv!=null){
      return true;
    }
    else
    return false;
  }
  public void reserve(Reservation r){
    if(resv==r){
      throw new ReservedVehicleException();
    }
  } //– throw ReservedVehicleException is already reserved

  public void cancelReservation(){
    if (resv==null){
      throw new UnreservedVehicleException();
    }
    else{
      resv=null;
    }
  } //- throws UnreservedVehicleException if no reservation
  public VehicleRates getQuotedRates() {
  return rates;  
  } 
  public void setQuotedRates(VehicleRates cost) {
    
  } 
}
