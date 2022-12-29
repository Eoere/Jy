/*
Elias Brahimi Program 4
*/

public class CarRates extends VehicleRates{

  private double daily_rate;
  private double weekly_rate;
  private double monthly_rate;
  private double mileage_chrg;
  private double daily_insur_rate;

public CarRates(double daily_rate, double weekly_rate, double monthly_rate, double mileage_chrg, double daily_insur_rate){
  super(daily_rate, weekly_rate, monthly_rate, mileage_chrg, daily_insur_rate);
  }
  public double getDailyRate(){
    return daily_rate;
  }; // cost per day
public double getWeeklyRate(){
  return weekly_rate;
}
 // cost per week
public double getMonthlyRate(){
  return monthly_rate;
}; // cost per month
public double getMileageChrg(){
  return mileage_chrg;
} // cost per mile, based on vehicle type
public double getDailyInsurRate(){
  return daily_insur_rate;
}
  public String toString(){
    return "Daily Rate " + daily_rate + ", Weekly Rate: "+weekly_rate+", Monthly Rate: " + monthly_rate+ ", Mileage Charge: " + mileage_chrg+ ", Daily Insurance: " + daily_insur_rate;
  }
}