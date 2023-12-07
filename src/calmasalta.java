
import java.util.Scanner;


public class calmasalta {

    public static void main(String[] args) {
        
        int arr[]=new int[10];
        int notaMayor=0;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese 10 calificaciones: ");
        for(int i=0; i<arr.length; i++) {
            arr[i]=entrada.nextInt();
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>notaMayor){
                notaMayor=arr[i];
            }
        }
        System.out.println("La nota mayor es: "+notaMayor);
    }
    
}
