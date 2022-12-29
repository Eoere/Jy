/*
Elias Brahimi Program 4
*/

public abstract class VehicleRates{
  private double daily_rate;
  private double weekly_rate;
  private double monthly_rate;
  private double mileage_chrg;
  private double daily_insur_rate;

  public VehicleRates(double daily_rate, double weekly_rate, double monthly_rate, double mileage_chrg, double daily_insur_rate ){
    this.daily_rate= daily_rate;
    this.weekly_rate= weekly_rate;
    this.monthly_rate= monthly_rate;
    this.mileage_chrg= mileage_chrg;
    this.daily_insur_rate= daily_insur_rate;
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
} // insurance cost (per day)
public abstract String toString();
} // forces subclasses to provde an appropriate toString method
