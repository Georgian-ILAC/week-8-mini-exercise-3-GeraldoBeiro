/* Author: Geraldo Beiro
* Date: Jul 10th, 2024.
* Time: 01:54 AM
*/

public class Person {

    protected  String firstName;
    protected  String lastName;
    protected double height;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    protected double getHeight(){
        return height;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    protected void setHeight(double height){
        this.height=height;
    }

}