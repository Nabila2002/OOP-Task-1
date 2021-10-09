package nabila;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    String section;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your section :");
    section = input.nextLine();
    Info info= new Info();
    Hobby hobby=new Hobby();

    System.out.println("Section : "+section);
    System.out.println("Name : "+info.name);
    System.out.println("ID NO: "+info.id);
    System.out.println("Hobby : "+hobby.hobbyName);

    }
}
/* Name :Nabila Zannat
ID no: 2012020098
Sec:5(B)
Email :cse_2012020098@lus.ac.bd
Date : 17 JULY 2021
 */