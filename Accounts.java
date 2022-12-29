/*
Elias Brahimi Program 4
*/

public class Accounts{

private Account[] accts; // array of Vehicle objects (ArrayList type may NOT be used)
  private int current;
  private int index;
  private String vin;

//methods
//(appropriate constructor)

  public Accounts(){
    accts= new Account[20];
    current=0;
    index=0;
  }
  
public void add(Account acct)// adds a new vehicle to the collection
  {
    accts[index] = acct;
    
    index++;
  }
public Account getAccount(String creditcard_num)throws InvalidCreditCardException, AccountNotFoundException
  {
    int i=0;
    if (accts[i].getCreditCardNum().length()!=16){
      throw new InvalidCreditCardException();
    }
    else{
      return accts[i];
    }
  while(accts[i]!=null && accts[i].getCreditCardNum().equals(creditcard_num)){
    if(accts[i].getCreditCardNum().equals(creditcard_num)){
      
    }
                    i++;
            }
    if (accts[i]==null){
      throw new AccountNotFoundException();
  }
    else
    {
           return accts[i];
        }      
} 
//iterator methods
public void reset() {
  current =0;
}// resets to first vehicle in list
public boolean hasNext(){
  return accts[current]!=null;
} // returns true if more vehicles in list to retrieve
public Account getNext()
  {
    Account ac;
    if(hasNext())
       {
      return accts[current++];
      
       }
     ac= accts[current++];
    return ac;
    
    
}
}


  
