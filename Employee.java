/* Author: Geraldo Beiro
* Date: Jul 10th, 2024.
* Time: 01:54 AM
*/


public class Employee extends Person{
    
    //The two private variables (id and hourlyPay)
    private int id;
    private double hourlyPay;



    //Constructors for the variables
    public Employee (String firstName, String lastName, int id, double hourlyPay, double height){

        super(firstName, lastName);
        this.id=id;
        this.hourlyPay=hourlyPay;
        this.height=height;

    }

    //getters and setters
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setHourlyPay(double hourlyPay){
        this.hourlyPay=hourlyPay;
    }

    public double getHourlyPay(){
        return hourlyPay;
    }

    //Now I'll create the method getRaise
    public double getRaise(){
        hourlyPay = hourlyPay*1.15;
        return hourlyPay;
    }


    //And below the method for the pay day:
    public double payDay(double workedHours){

        double totalPay; //now I am creating a variable double for total pay

        //if condition below specifying the amount of overtime
        if(workedHours > 40){
            double overtime = workedHours - 40;
            totalPay = (hourlyPay*40) + (overtime * hourlyPay*1.5);

        } else{ //If workedhours do not exceed 40h totalpay = workedhours*hourlypay

            totalPay = workedHours*hourlyPay;
        
        }
        return totalPay;

    }


    //Now I will override the toString method
    @Override
    public String toString(){

        return "\n"+"Employee name: " + getFirstName() + " " + getLastName() + "\n" +
        "He/She is " + getHeight() + " feet/inches tall \n" +
        "He/She makes $"+hourlyPay + "\n"+
        "His/Her employee ID is: " + id + "\n";

    }






}
