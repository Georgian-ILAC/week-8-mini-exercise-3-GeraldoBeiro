/* Author: Geraldo Beiro
* Date: Jul 10th, 2024.
* Time: 01:54 AM
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Employee one = new Employee("Geraldo", "Beiro", 1000, 30, 5.7);
        System.out.println(one.toString());


        System.out.println("The hourly payment after raise for "+one.firstName+" is: "+one.getRaise());


        System.out.print("Enter the amount of hours worked this week by "+one.firstName+" :");
        int workedHours = scanner.nextInt();

        double payForWeek = one.payDay(workedHours);
        System.out.println("-----------------------------------------------");
        System.out.println("The amount to be paid for the week is: $"+payForWeek);
        System.out.println("-----------------------------------------------");


    scanner.close();
    }


}
