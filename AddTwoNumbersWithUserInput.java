import java.util.Scanner;

public class AddTwoNumbersWithUserInput {
  public static void main(String[] args) {
    
    Scanner myObj=new Scanner(System.in);

    System.out.println("Input the first number: ");
    //first=myObj.nextInt();
    double first=myObj.nextDouble();

    System.out.println("Input the second number: ");
    //second=myObj.nextInt();
     double second=myObj.nextDouble();

    double sum=first+second;
    System.out.println("The summary is: "+sum);
}
}