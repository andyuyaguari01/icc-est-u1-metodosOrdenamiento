public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {10, 0, -5, 5, 15, 2};
        //runBubblesort();
        runBubblesortAvz();
    }
    
    public static void runBubblesort(){
        System.out.println("Metodo Burbuja");
        int[]numeros = {-5, 10, 2, 0, 7};
        // Instancia de clase
        BubbleSort bubblesort = new BubbleSort();
        BubbleSort.printlnArreglo(numeros);
        //bubblesort.sorAscendente(numeros);
        //bubblesort.printArreglo (numeros);
        //bubblesort.sortDescendente(numeros);
        //bubblesort.printArreglo(numeros);
        
        bubblesort.printArreglo(numeros);
        bubblesort.sort(numeros , true);
        bubblesort.printArreglo(numeros);
        bubblesort.sort(numeros,  false);
        bubblesort.printArreglo(numeros);
    }

    private static void runBubblesortAvz() {
        int[] array= new int[]{9,2,3,0,8,5};
       
        //instanciar la clase
        BubbleSortAvz bSortAvz = new BubbleSortAvz(array);
        bSortAvz.printArray();
        bSortAvz.sort( true);
        bSortAvz.printArray();
        
    }

    
}

