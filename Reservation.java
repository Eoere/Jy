/*
Elias Brahimi Program 4
*/

public class Reservation{
  //instance vars
  private String name; // customer name
  private String creditCardNum; // credit card number vehicle reserved under
  private TimeSpan rentalPeriod; // e.g., four days, two weeks, one month
  private boolean insuranceSelected; // indicates if optional daily insurance wanted
  //constructor
  public Reservation(String name, String creditCardNum, boolean insuranceSelected, TimeSpan rentalPeriod){
    this.name= name;
    this.creditCardNum= creditCardNum;
    this.rentalPeriod= rentalPeriod;
    this.insuranceSelected= insuranceSelected;
  }

  //methods
//appropriate constructor, getters and toString methods.
//Note that reservations cannot be altered once created (i.e., Reservation objects are immutable).
  public String getName(){
    return name;
  }
  public String creditCardNum(){
    return creditCardNum;
  }
  public TimeSpan rentalPeriod(){
    return rentalPeriod;
  }
  public boolean insuranceSelected(){
    return insuranceSelected;
  }
  public String toString() {
    return "Name: " + name + ", Credit Card Number: " + creditCardNum + "Rental Period: " + rentalPeriod.getNumUnits() + rentalPeriod.getNumUnits()+ ", Insurance: " + insuranceSelected();
  }
}