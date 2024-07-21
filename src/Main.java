import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a year: ");
        int leap = Integer.parseInt(scanner.nextLine());
        if(leap % 4 != 0){
            System.out.println("the year is not a leap year.");
        }
        else if (leap %100 == 0 && leap %400 ==0 ){
            System.out.println("the year is leap year ");
        }
        else if (leap % 4 == 0){
            System.out.println("the year is leap year");
        }
        else {
            System.out.println("they year is not leap year");
        }
    }
}