
/**
 * Write a description of class ArregloCircular here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class ArregloCircular
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int contadord = -1;
        int contadori = -1;
        
        if(n == 1){
            System.out.print(0);
            System.exit(0);
        }
        for(int i = x; i < n; i++){
            contadord++;
            if(i == y){
                break;
            }
            if(i == n-1){
                i=-1;
            }
        }
        for(int j = x; j >= 0; j--){
            contadori++;
            if(j == y){
                break;
            }
            if(j == 0){
                j=n;
            }
        }
        if(contadord < contadori){
            System.out.print(contadord);
        }else{
            System.out.print(contadori);
        }
    }
}
