public class numeros {
    public static void main(String[] args) {
        double [] numeros = new double[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Double.parseDouble(IO.readln("Ingresa un numero: "));
        }
        //saber cual es el numero menor
        double menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("El numero menor es: " + menor);

        //saber cual es el numero mayor
        double mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {

                mayor = numeros[i];
            }

    }
    System.put.println("El numero mayor es: " + mayor);
     //que posicion ocupa el numero menor y numero mayor 
        int posMenor = 0;
        int posMayor = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == menor) {
                posMenor = i;
            }
            if (numeros[i] == mayor) {
                posMayor = i;
            }
        }
        System.out.println("El numero menor se encuentra en la posicion: " + posMenor);
        System.out.println("El numero mayor se encuentra en la posicion: " + posMayor);
}
}

 