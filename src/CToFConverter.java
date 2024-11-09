import java.util.Scanner;
public class CToFConverter {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        boolean done=false;
        do {
            System.out.println("Input the temperature in Celsius(C)");
            if(in.hasNextDouble()){
                double tempInC = in.nextDouble();
                double tempInF;
                tempInF = ((tempInC * 1.8) + 32);
                System.out.println(tempInC + " is " + tempInF + " in Fahrenheit");
                done=true;
            }
            else{
                System.out.println("invalid input");
                in.nextLine();
            }
        }while(!done);
    }
}