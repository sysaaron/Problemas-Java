
/**
 * Write a description of class LetraRepetida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class LetraRepetida
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String[] x = word.split("");
        int contador = 0;
        
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x.length; j++){
                if(j==i){
                    continue;
                }else if(x[i].equals(x[j])){
                    contador++;
                    break;
                }
            }
        }
        if(contador>0){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
    }
}
