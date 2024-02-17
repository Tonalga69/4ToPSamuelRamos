public class SelectionSort {
    public static void main(String[] args) {
        int[] arreglo = {64, 34, 25, 12, 22, 11, 90};

        imprimirArreglo(arreglo);

        selectionSort(arreglo);


        imprimirArreglo(arreglo);
    }

    public static void selectionSort(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            int temp = arreglo[indiceMenor];
            arreglo[indiceMenor] = arreglo[i];
            arreglo[i] = temp;
        }
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
