package by.epam.unit03.main;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Rom, Arab;
        System.out.print("Enter Roman number: ");
        Rom = sc.nextLine();
        System.out.print("Roman number " + Rom);
        switch(Rom) {
            case "I":
                Arab = "1";
                break;
            case "II":
                Arab = "2";
                break;
            case "III":
                Arab="3";
                break;
            case "IV":
                Arab="4";
                break;
            case "V":
                Arab="5";
                break;
            case "VI":
                Arab="6";
                break;
            case "VII":
                Arab="7";
                break;
            case "VIII":
                Arab="8";
                break;
            case "IX":
                Arab="9";
                break;
            case "X":
                Arab="10";
                break;
            default:
                Arab="invalid format";
                break;
        }
        System.out.println(" means Arabic: " + Arab);
   }
}
