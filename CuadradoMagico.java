
/**
 * Write a description of class CuadradoMagico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class CuadradoMagico
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int sum = 0;
        int hor = 0;
        int ver = 0;
        int dia = 0;
        int diai = 0;
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
            sum += arr[i][i];
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                hor += arr[i][j];
                ver += arr[j][i];
                dia += arr[j][j];
                diai += arr[j][(arr.length - j) - 1];
            }
            if(hor != sum || ver != sum || dia != sum || diai != sum){  
                System.out.print("No");
                System.exit(0);
            }
            hor = 0;
            ver = 0;
            dia = 0;
            diai = 0;
        }
        System.out.println("Yes");
    }
}
