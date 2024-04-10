public class App {
    public static void main(String[] args) throws Exception {
        //Crear la instancia de la (Clase u objeto) MetodosOrder.
        MetodosOrder metodosOrder = new MetodosOrder();

        int [] numeros = {30, 7, 12, 5};
        metodosOrder.imprime(numeros);
        //Llamo el método sortByBubble y su respuesta la guardo en la variable arreglOrdenadoBubble.
        int [] arregloOrdenado = metodosOrder.sortByBubble(numeros, true);
        metodosOrder.imprime(arregloOrdenado);
    }
}
