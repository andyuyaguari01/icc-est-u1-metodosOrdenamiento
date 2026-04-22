public class BubbleSort {
    // Constructor
    public BubbleSort(){
       System.out.println("Se creo la clase en el constructor");

    }
    public void sorAscendente(int numeros[]){
        for (int i = 0; i< numeros.length; i++){
            for (int j = i+1; j<numeros.length; j++){
                if(numeros[i]> numeros[j]){
                    // si se cumple -> intercambio
                    int aux = numeros[i];
                    numeros[i]= numeros [j];
                    numeros[j]= aux;
                    
                }

            }
        }
       
    }
    public void sortDescendente(int[] numeros){
        for (int i = 0; i< numeros.length; i++){
            for (int j = i+1; j<numeros.length; j++){
                if(numeros[i]> numeros[j]){
                    // si se cumple -> intercambio
                    int aux = numeros[i];
                    numeros[i]= numeros [j];
                    numeros[j]= aux;
                    
                }

            }
        }
       
    }



     public void printArreglo(int[] numeros){
            for( int i : numeros) {
                System.out.print(i+ "," );
            }

        }
    public void sort(int[]numeros, boolean asc){
        if(asc){
            sorAscendente(numeros);
        }else {}sortDescendente(numeros);
      

    }

    
    public static void printlnArreglo(int[] numeros) {
        
    }
    




}
