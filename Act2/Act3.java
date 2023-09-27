package Act2;

import java.util.*;

public class Act3 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe el primer numero");
        int a = sc.nextInt();
        int x = a;

        System.out.println("Escribe el segundo numero");
        int b = sc.nextInt();

        a = b;
        System.out.println("El primer numero:" + a);
        b = x;
        System.out.println("El primer numero:" + b);

    }

}
