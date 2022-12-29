/*
Elias Brahimi Program 4
*/

public class CurrentRates{

  private VehicleRates[ ] rates = new VehicleRates[3]; 
  private CarRates rateCar;
  private SUVRates rateSUV;
  private TruckRates rateTruck;

  public CurrentRates(){
    rates[0]= new CarRates(24.95, 169.95, 514.95, .16, 14.95);
    rates[1]= new SUVRates(29.95, 189.95, 679.95, .16, 14.95);
    rates[2]= new TruckRates(36.95, 224.95, 687.95, .26, 21.95);
  }
  
  public CurrentRates(CarRates rateCar, SUVRates rateSUV, TruckRates rateTruck)
{
    rates[0]= rateCar;
    rates[1]= rateSUV;
    rates[2]= rateTruck;
  }

public VehicleRates getCarRates() {
  return rateCar;
} 
public void setCarRates(VehicleRates r){
  
  rates[0]=r;
}
public VehicleRates getSUVRates() {
  return rateSUV;
} 
public void setSUVRates(VehicleRates r){
  rates[1]=r;
}
public VehicleRates getTruckRates() {
  return rateTruck;
} 
public void setTruckRates(VehicleRates r){
  rates[3]=r;
}
 public double calcEstimatedCost(int vehicleType,TimeSpan estimatedRentalPeriod, int estimatedNumMiles, boolean dailyInsur, boolean primeCustomer) {
  double cost;
   VehicleRates rates= null;
   cost= estimatedRentalPeriod* rates.getMileageChrg()* estimatedNumMiles;
   
   //figure out calcs
   //- called to calculate a cost quote for a customer given an estimated number of days will use and estimated number of miles will drive, whether the daily insurance wanted, and whether a prime customer or not. uses the CURRENT standard rates for the vehicle type (car, SUV or truck)
 } 
  public double calcActualCost(VehicleRates rates, int numDaysUsed, int NumMilesDriven,
 boolean dailyInsur, boolean primeCustomer) {
VehicleRates actrates= null;
  double fCharge;
    if(numDaysUsed<7){
      fCharge= actrates.getDailyRate()*numDaysUsed;}
      
    else if(numDaysUsed>=7 && numDaysUsed<30){
      fCharge= actrates.getWeeklyRate()*numDaysUsed;
      
    }
    else{
      fCharge= actrates.getMonthlyRate()*numDaysUsed;
    }
return fCharge;
    
    
}
}