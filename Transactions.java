/*
Elias Brahimi Program 4
*/

public class Transactions{

  private Transaction[] transactions;
  private int current;
  private int index;
  private String vin;

//methods
//(appropriate constructor)

  public Transactions(){
    transactions= new Transaction[20];
    current=0;
    index=0;
  }
  
public void add(Transaction tran)// adds a new vehicle to the collection
  {
    transactions[index] = tran;
    index++;
  }     
 // throws VINNotFoundException if no vehicle found for provided VIN
//iterator methods
public void reset() {
  current =0;
}// resets to first vehicle in list
public boolean hasNext(){
  return transactions[current]!=null;
} // returns true if more vehicles in list to retrieve
public Transaction getNext()
  {
    Transaction t;
    if(hasNext())
       {
      return transactions[current++];
       }
     t= transactions[current++];
    return t;
}
}


  
