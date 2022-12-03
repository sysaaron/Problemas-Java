
/**
 * Write a description of class EstaOrdenado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class EstaOrdenado
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = sc.nextInt();
        String res = "Ordenado";
        
        for(int i = 0; i < n-1; i++){
            int x = sc.nextInt();
            if(x >= first){
                first = x;
            }else{
                res = "Desordenado";
                break;
            }
        }
        
        System.out.print(res);
    }
}
