//programmers: Shahmir, Matthew

import java.util.ArrayList;

public class Loan
{
  private int ID;
  private double loanAmount;
  private String country;
  private int daysToFund;
  private int numLenders;
  
  public Loan(int ID, double loanAmount, String country, int daysToFund, int numLenders)
  {
    this.ID = ID;
    this.loanAmount = loanAmount;
    this.country = country;
    this.daysToFund = daysToFund;
    this.numLenders = numLenders;
  }

  //accessor methods
  public int getID()
  {
    return ID;
  }

  public double getLoanAmount()
  {
    return loanAmount;
  }
  
  public String getCountry()
  {
    return country;
  }
  
  public int getDaysToFund()
  {
    return daysToFund;
  }

  public int getNumLenders()
  {
    return numLenders;
  }

  public String toString()
  {
    return "ID: "+ID + " LoanAmount: " + loanAmount + " Country: " + country + " Days To Fund: " + daysToFund + " Num Lenders: " + numLenders;
  }

  //modifier methods
  public void setID(int tmp)
  { 
   ID = tmp;
  }

  public void setLoanAmount(double tmp)
  {
    loanAmount = tmp;
  }
  
  public void setCountry(String tmp)
  {
    country = tmp;
  }

  public void setDaysToFund(int tmp)
  {
    daysToFund = tmp;
  }

  public void setNumLenders(int tmp)
  {
    numLenders = tmp;
  }
}