public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma(2, 2, 2);
        System.out.println(resultado);

        Coche miCoche;
        miCoche = new Coche();
        miCoche.incremento();
    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
    class Coche {
        public int puertas = 0;

        public void incremento(){
                this.puertas++;
        }

}

        // Crear una clase coche.

       // Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

       // Una función que incremente el número de puertas que tiene el coche.

        //Crear un objeto miCoche en el main y añadirle una puerta.

        //Mostrar el número de puertas que tiene el objeto..