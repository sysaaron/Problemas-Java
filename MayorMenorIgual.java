
/**
 * Write a description of class MayorMenorIgual here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class MayorMenorIgual
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a < b){
            System.out.println("<");
        }else if(a == b){
            System.out.println("=");
        }else if(a > b){
            System.out.println(">");
        }
    }
}
