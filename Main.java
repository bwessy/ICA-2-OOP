package com.company;
import java.util.Scanner;
import java.util.*;
import java.io.*;

class Main {
    static Scanner input =  new Scanner(System.in);
    LinkedList<Cruise> cruiseHolidays = new LinkedList<Cruise>();
    LinkedList<International> internationalHolidays = new LinkedList<International>();
    LinkedList<Domestic> domesticHolidays = new LinkedList<Domestic>();
    public static void main(String[] args) {
        Main n = new Main();
        n.menu();
    }

    public void menu(){

        System.out.println(" Cruise = 1 \n International = 2 \n Domestic = 3 \n exit = 4");
        System.out.println("What Would you like to add an entry to?");
        int userInput = input.nextInt();

        while (true){
            switch (userInput){
                case 1:
                    cruise();
                case 2:
                    international();
                case 3:
                    domestic();
                case 4:
                    System.out.println("thank you for using this program");
                    System.out.println("-Program Terminated-");
                    System.exit(1);
                default:
                    System.out.print("That is not a valid input please try again!");
                    menu();
            }
        }
    }
    public void cruise() {

        String C ;
        String DP;
        String RP;
        int PN;
        int NP;
        int P;
        String SD;
        String ED;
        int N;


        System.out.println("\n Add Data = 1 \n View Data = 2 \n Exit to menu = 3");
        System.out.println("What would you like to do?");

        int userInput = input.nextInt();
        input.nextLine();
        while (true){
            switch (userInput){
                case 1:
                    System.out.println("please enter the values for the following");
                    System.out.println("\n Cabin Type");
                    C = input.nextLine();
                    System.out.println("\n Departure Port");
                    DP = input.nextLine();
                    System.out.println("\n Return Port");
                    RP = input.nextLine();
                    System.out.println("\n Number of People");
                    NP = input.nextInt();
                    input.nextLine();
                    System.out.println("\n Total Price");
                    P = input.nextInt();
                    input.nextLine();
                    System.out.println("\n The Start Date - DD/MM/YYYY");
                    SD = input.nextLine();
                    System.out.println("\n The End Date - DD/MM/YYYY");
                    ED = input.nextLine();
                    System.out.println("\n The Total Nights of the Stay");
                    N = input.nextInt();
                    input.nextLine();
                    PN = P/N;

                    cruiseHolidays.add(new Cruise(

                            DP,
                            C,
                            RP,
                            PN,
                            NP,
                            P,
                            SD,
                            ED,
                            N));

                    System.out.printf("The data has been added!");
                    cruise();


                    break;
                case 2:
                    System.out.println(cruiseHolidays.size());
                    System.out.println(cruiseHolidays.toString());
                    cruise();
                    break;
                case 3:
                    menu();
                    break;
                default:
                    System.out.println("unexpected input please try again");
                    cruise();
            }
        }
    }
    public void international(){
        String C ;
        String DP;
        String RP;
        int PN;
        int NP;
        int P;
        String SD;
        String ED;
        int N;


        System.out.println("\n Add Data = 1 \n View Data = 2 \n Exit to menu = 3");
        System.out.println("What would you like to do?");

        int userInput = input.nextInt();
        input.nextLine();
        while (true){
            switch (userInput){
                case 1:
                    System.out.println("Please enter the values for the following. \n");
                    System.out.println("\n Seat Type");
                    C = input.nextLine();
                    System.out.println("\n Departure AirPort");
                    DP = input.nextLine();
                    System.out.println("\n Return AirPort");
                    RP = input.nextLine();
                    System.out.println("\n Number of People");
                    NP = input.nextInt();
                    input.nextLine();
                    System.out.println("\n Total Price");
                    P = input.nextInt();
                    input.nextLine();
                    System.out.println("\n The Start Date - DD/MM/YYYY");
                    SD = input.nextLine();
                    System.out.println("\n The End Date - DD/MM/YYYY");
                    ED = input.nextLine();
                    System.out.println("\n The Total Nights of the Stay");
                    N = input.nextInt();
                    input.nextLine();
                    PN = P/N;

                    internationalHolidays.add(new International(

                            DP,
                            C,
                            RP,
                            PN,
                            NP,
                            P,
                            SD,
                            ED,
                            N));

                    System.out.printf("The data has been added!");
                    international();


                    break;
                case 2:
                    System.out.println(internationalHolidays.size());
                    System.out.println(internationalHolidays.toString());
                    cruise();
                    break;
                case 3:
                    menu();
                    break;
                default:
                    System.out.println("unexpected input please try again");
                    international();
            }
        }

    }
    public void domestic(){
        String C ;
        String DP;
        String RP;
        int PN;
        int NP;
        int P;
        String SD;
        String ED;
        int N;


        System.out.println("\n Add Data = 1 \n View Data = 2 \n Exit to menu = 3");
        System.out.println("What would you like to do?");

        int userInput = input.nextInt();
        input.nextLine();
        while (true){
            switch (userInput){
                case 1:
                    System.out.println("Please enter the values for the following. \n");
                    System.out.println("\n Seat Type");
                    C = input.nextLine();
                    System.out.println("\n Departure AirPort");
                    DP = input.nextLine();
                    System.out.println("\n Return AirPort");
                    RP = input.nextLine();
                    System.out.println("\n Number of People");
                    NP = input.nextInt();
                    input.nextLine();
                    System.out.println("\n Total Price");
                    P = input.nextInt();
                    input.nextLine();
                    System.out.println("\n The Start Date - DD/MM/YYYY");
                    SD = input.nextLine();
                    System.out.println("\n The End Date - DD/MM/YYYY");
                    ED = input.nextLine();
                    System.out.println("\n The Total Nights of the Stay");
                    N = input.nextInt();
                    input.nextLine();
                    PN = P/N;

                    domesticHolidays.add(new Domestic(

                            DP,
                            C,
                            RP,
                            PN,
                            NP,
                            P,
                            SD,
                            ED,
                            N));

                    System.out.print("The data has been added!");
                    domestic();


                    break;
                case 2:
                    System.out.println(domesticHolidays.size());
                    System.out.println(domesticHolidays.toString());
                    domestic();
                    break;
                case 3:
                    menu();
                    break;
                default:
                    System.out.println("unexpected input please try again");
                    domestic();
            }
        }

    }



}
class Booking{

    int ppn; //price per person per night
    int numPeople;
    int price;
    String startDate;
    String endDate;
    int numNights;

    Booking()
    {
        ppn = 0;
        numPeople = 0;
        price = 0;
        startDate = "";
        endDate = "";
        numNights = 0;
    }
    //(ppn, numPeople, price, startDate, endDate, numNights )
    Booking(int pn, int np, int p, String sd, String ed, int night)
    {
        ppn = pn;
        numPeople = np;
        price = p;
        startDate = sd;
        endDate = ed;
        numNights = night;
    }
}
class Cruise extends Booking{

    String depPort;
    String retPort;
    String cabin; //internal or seaView

    Cruise()
    {
        super();
        depPort = "";
        retPort = "";
        cabin = "";
    }
    //(cabin, depPort, retPort, ppn, numPeople, price, startDate, endDate, numNights )
    Cruise(String c, String dp, String rp, int pn, int np, int p, String sd, String ed, int night)
    {
        super(pn, np, p, sd, ed, night);
        cabin = c;
        depPort = dp;
        retPort = rp;
    }
    @Override
    public String toString() {
        return  "\n Cruise Booking \n" +
                "\n Cabin Type: " + depPort + "\n" +
                "\n Departure Port: " + retPort + "\n" +
                "\n Return Port: " + cabin + "\n" +
                "\n Price Per Night: " + ppn + "\n" +
                "\n Number of People: " + numPeople + "\n" +
                "\n Number of Nights: " + numNights + "\n" +
                "\n Start Date: " + startDate + "\n" +
                "\n End Date: " + endDate + "\n"+
                "\n Total Price: " + price + "\n";
    }


}
class International extends Booking{

    String depAP;
    String destAP;
    String seatType;

    International()
    {
        super();
        depAP = "";
        destAP = "";
        seatType = "";
    }
    //(cabin, depPort, retPort, ppn, numPeople, price, startDate, endDate, numNights )
    International(String seat, String dep, String dest, int pn, int np, int p, String sd, String ed, int night)
    {
        super(pn, np, p, sd, ed, night);
        depAP = dep;
        destAP = dest;
        seatType = seat;
    }
    @Override
    public String toString() {
        return  "\n International Flight Booking \n" +
                "\n Seat Type: " + seatType + "\n" +
                "\n Departure AirPort: " + depAP + "\n" +
                "\n Return Airport: " + destAP + "\n" +
                "\n Price Per Night: " + ppn + "\n" +
                "\n Number of People: " + numPeople + "\n" +
                "\n Number of Nights: " + numNights + "\n" +
                "\n Start Date: " + startDate + "\n" +
                "\n End Date: " + endDate + "\n"+
                "\n Total Price: " + price + "\n";
    }

}
class Domestic extends Booking{

    String depCity;
    String destCity;
    String domSeat;

    Domestic(){
        super();
        String depCity = "";
        String destCity = "";
        String domSeat = "";
    }
    //(domSeat ,depCity, destCity, ppn, numPeople, price, startDate, endDate, numNights)
    Domestic(String DS, String depC, String destC, int pn, int np, int p, String sd, String ed, int night){
        super(pn, np, p, sd, ed, night);
        depCity = depC;
        destCity = destC;
        domSeat = DS;
    }
    @Override
    public String toString() {
        return  "\n Domestic Flight Booking\n" +
                "\n Departure AirPort: " + depCity + "\n" +
                "\n Return AirPort: " + destCity + "\n" +
                "\n Seat Type: " + domSeat + "\n" +
                "\n Price Per Night: " + ppn + "\n" +
                "\n Number of People: " + numPeople + "\n" +
                "\n Number of Nights: " + numNights + "\n" +
                "\n Start Date: " + startDate + "\n" +
                "\n End Date: " + endDate + "\n"+
                "\n Total Price: " + price + "\n";
    }
}