public class Exercicio_03 {
  public int recursao(int n) {
    if (n == 1)
      return 1;
    else if (n == 2)
      return 2;
    else
      return 2 * recursao(n - 1) + 3 * recursao(n - 2);
  }
}
