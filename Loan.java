//programmers: Shahmir, Matthew

import java.util.ArrayList; //import ArrayList library

public class Loan //make a new Loan class
{
  private int ID; //new private int Id
  private double loanAmount; // new private double loanAmount
  private String country; //new private String country
  private int daysToFund; //new private int daysToFund
  private int numLenders; //new private int numLenders
  
  public Loan(int ID, double loanAmount, String country, int daysToFund, int numLenders) //new constructor method with different parameters
  {
    this.ID = ID; //set private ID to Id
    this.loanAmount = loanAmount; //set private loanAmount to loanAmount
    this.country = country; //set private country to country
    this.daysToFund = daysToFund; //set private daysToFund to daysToFund
    this.numLenders = numLenders; //set private numLenders to numLenders
  }

  //accessor methods
  public int getID()//it gets the ID
  {
    return ID; //return ID
  }

  public double getLoanAmount()//it gets the loan amount
  {
    return loanAmount; //return loanAmount
  }
  
  public String getCountry()//it gets the country name
  {
    return country; //return country 
  }
  
  public int getDaysToFund() //it gets the amount of days to fund
  {
    return daysToFund; //return daysToFund
  }

  public int getNumLenders() //it gets the number of lenders in the country
  {
    return numLenders; //return numLenders
  }

  public String toString()
  {
    //return all of the private variables as a single string
    return "ID: "+ID + " LoanAmount: " + loanAmount + " Country: " + country + " Days To Fund: " + daysToFund + " Num Lenders: " + numLenders; 
  }

  //modifier methods
  //new setID method with parameter int tmp
  public void setID(int tmp) //new method to setID with a tmp parameter
  { 
   ID = tmp; //set ID to tmp
  }

  public void setLoanAmount(double tmp) //new setLoanAmount method with parameter double tmp 
  {
    loanAmount = tmp; //set loanAmount to tmp
  }
  
  public void setCountry(String tmp) //new setCountry method with parameter String tmp 
  {
    country = tmp; //set country to tmp
  }

  public void setDaysToFund(int tmp) //new setDaysToFund method with parameter int tmp 
  {
    daysToFund = tmp; //set daysToFund to tmp
  }

  public void setNumLenders(int tmp) //new setNumLenders method with parameter int tmp 
  {
    numLenders = tmp; //set numLenders to tmp int
  }
}