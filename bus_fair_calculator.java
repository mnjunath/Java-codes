//A City Bus is a Ring Route Bus which runs in circular fashion. That is, the Bus once started at
//Source Bus Stop, halts at each Bus Stop in its Route and at the end it reaches to Source Bus stop
//again. If there are n number of Stops and if bus starts at Bus Stop number 1, then after nth Bus
//Stop, the next stop in the Route will be Bus Stop number1 always. If there are n stops, there will
//be n paths. One path connects 2 stops. Distances (in meters) for all paths in Ring Route is given
//in array Path[] as below. Path = [800, 600, 750, 900, 1400, 1200, 1100, 1500] Fare is determined
//based on the distance covered from source to destination stop as Distance d between Input
//Source and Destination Stops can be measured by looking at values in array Path[] and fare can
//be calculated as per following criteria: - If d = 1000 meters, then fare= 5 INR - (When calculating
//fare for other distances, the calculated fare containing any fraction value should be ceiled. For
//example, for distance 900, when fare initially calculated is 4.5 which must be ceiled to 5) Path is
//circular in function. Value at each index indicate distance till current stop from previous one.
//And each index positions can be mapped with values at same index in Busstops[] array, which is
//a string array holding abbreviation of names for all stops as "THANERAILWAYSTN'= "TH",
//"GAONDEVI"="GA", "ICEFACTROY"="IC") "HARINIWASCIRCLE"="HA", "TEENHATHNAKA"="TE",
//"LUISWADI"="LU", "NITINCOMPANYJUNCTION"="NI", "CADBURRYJUNCTION"="CA”
//Given, n=8, where n is number of total Bus Stops. Bus Stops =["TH", "GA", "IC", "HA", "TE",
//"LU", "NI", "CA"). Write a code with function getFare(String Source, String Destination) which
//takes Input as source and destination stops(in the format containing first 2 characters of Name
//of the Busstop) and calculate and return travel fare.
//Example 1:
//Input Values
//ca
//Ca
//Output Values
//INVALID INPUT
//Example 2:
//Input Values
//NI
//HA
//Output Values
//23.0 INR

//Note: Input and Output should be in format given in example.
//Input should not be case sensitive and output should be in the format <FLOAT> INR.





import java.util.*;
class Bus_fair_calculator {
    public static double get_bus_fair(String source, String destination){
        
        String[] bus_stops = {"TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA"};
        int[] path = {800, 600, 750, 900, 1400, 1200, 1100, 1500};
        
        source = source.toUpperCase();
        destination = destination.toUpperCase();
        
        int src_ind = -1;
        int des_ind = -1;
        int n = bus_stops.length;
        int index;
        for(index = 0; index < n; index++){
            if(bus_stops[index].equals(source)){
                src_ind = index;
            }
            if(bus_stops[index].equals(destination)){
                des_ind = index;
            }
        }
        
        if(src_ind == -1 || des_ind == -1){
            return -1;
        }
        if(src_ind == des_ind){
            return 0.00;
        }
        
        int distance = 0;
        
        while(src_ind != des_ind){
            distance += path[src_ind];
            src_ind++;
            if(src_ind > n - 1){
                src_ind = 0;
            }
        }
        
        double fare = Math.ceil((double) distance / 1000) * 5;
        return fare;
    }
    
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String source = kbd.next();
        String destination = kbd.next();
        
        System.out.println(get_bus_fair(source ,destination));
        
    }
}