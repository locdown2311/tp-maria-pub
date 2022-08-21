package Exercicio_10;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Primos {
    public String fatoraPrimos(int n) {
        ArrayList<Integer> fatores = new ArrayList<>();
        for(int i = 2; i< n; i++) {
            while(n%i == 0) {
                System.out.println(i+" ");
                fatores.add(i);
                n = n/i;

            }
        }
        if(n >2) {
            System.out.println(n);
            fatores.add(n);
        }
        return fatores.toString();
    }



}
