
/**
 * Write a description of class MaximaArea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Arrays;

public class MaximaArea
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int indx = 0;
        int cont = 1;
        int area = 0;
        int mayor = 0;
        
        while(sc.hasNextInt() && indx < n){
            arr[indx] = sc.nextInt();
            indx++;
        }
        
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j <= arr.length; j++){
                if(j == i){
                    break;
                }
                if(j == arr.length){
                    j = -1;
                    continue;
                }
                if(arr[j]>=arr[i]){
                    cont++;
                }
            }
            area = arr[i]*cont;
            if(area > mayor){
                mayor = area;
            }
            cont = 1;
        }
        
        System.out.print(mayor);
    }
}
