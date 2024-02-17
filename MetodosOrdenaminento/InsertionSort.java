public class InsertionSort {
    public static void main(String[] args) {
        int[] arreglo = {64, 34, 25, 12, 22, 11, 90};

    
        imprimirArreglo(arreglo);

        insertionSort(arreglo);

    
        imprimirArreglo(arreglo);
    }

    public static void insertionSort(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 1; i < n; i++) {
            int elementoActual = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > elementoActual) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = elementoActual;
        }
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
