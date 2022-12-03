
/**
 * Write a description of class ElementosMX here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class ElementosMX
{
    public static void main(String[] args) {
        
        String test = "5\n 3 4 1 2 2\n 3\n 0\n 1\n 4";
        Scanner sc = new Scanner(test);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int contador = 0;
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int c = sc.nextInt();
        for(int j = 0; j < c; j++){
            int x = sc.nextInt();
            for(int k = 0; k < arr.length; k++){
                if(arr[k]>x){
                    contador++;
                }
            }
            System.out.println(contador);
            contador = 0;
        }
    }
}
