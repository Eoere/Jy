/*
Elias Brahimi Program 4
*/

public class TimeSpan{
  //instance variables
  private char timeUnit; // ‘D’ (day), ‘W’ (week), ‘M’ (month)
  private int numUnits; // num of days, weeks or months
  
  //constructor / getters appropriate constructor and getters
  public TimeSpan(char timeUnit, int numUnits){
    this.timeUnit= timeUnit;
    this.numUnits= numUnits;
  }
  public char getTimeUnit(){
    return timeUnit;
  }
  public int getNumUnits(){
    return numUnits;
  }
}
