package Exercicio_08;

public class IntegerSet {
    private static final int TAMANHO = 101;

    private boolean array[];

    public IntegerSet() {
        this.array = new boolean[TAMANHO];
    }

    private IntegerSet(boolean values[]) {
        this.array = values;
    }

    public IntegerSet intersecction(IntegerSet outro) {
        boolean intersect[] = new boolean[TAMANHO];
        for (int i = 0; i < TAMANHO; i++) {
            intersect[i] = this.array[i] && outro.array[i];
        }
        return new IntegerSet(intersect);
    }


    public IntegerSet union(IntegerSet outro) {
        boolean un[] = new boolean[TAMANHO];
        for (int i = 0; i < TAMANHO; i++) {
            un[i] = this.array[i] || outro.array[i];
        }
        return new IntegerSet(un);
    }

    public void insertElement(int pos) {
        this.array[pos] = true;
    }

    public void deleteElement(int pos) {
        this.array[pos] = false;
    }
}
