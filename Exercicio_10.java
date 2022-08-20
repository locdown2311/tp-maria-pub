import java.util.ArrayList;
public class Exercicio_10 {
  public int[] fatoraPrimos(int n) {
    int contador = 0;
    ArrayList<Integer> fatores = new ArrayList<Integer>();
    int c = 2; // Inicio
    while (n > 1) {
      if (n % c == 0) {
        System.out.println(c + " ");
        fatores.add(c);
        n /= c;
        contador++;
      } else
        c++;
    }
    int tam = fatores.size();
    int[] vetFatores = new int[tam];
    vetFatores = fatores.toArray();
  }
}