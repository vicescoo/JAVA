
import java.util.ArrayList;

public class dulceria {
    public static void main(String[] args) {

        String[] productos = {"Chocolate", "Paleta", "Gomitas", "Galletas"};
        double[] precios = {18, 12, 25, 15};
        int[] vendidos = {0, 0, 0, 0};

        ArrayList<String> clientes = new ArrayList<String>();

        int cantidadClientes = Integer.parseInt(
            IO.readln("Ingresa la cantidad de clientes: "));

        while (cantidadClientes <= 0) {
            cantidadClientes = Integer.parseInt(
                IO.readln("Ingresa un numero mayor que cero: "));
        }

        double totalGeneral = 0;

        for (int i = 1; i <= cantidadClientes; i++) {

            String nombre = IO.readln("Ingresa el nombre del cliente: ");
            clientes.add(nombre);

            double totalCliente = 0;
            int unidadesCliente = 0;
            String continuar = "si";

            IO.println("\nCliente: " + nombre);

            while (continuar.equalsIgnoreCase("si")) {

                IO.println("\nCATALOGO");

                for (int j = 0; j < productos.length; j++) {
                    IO.println((j + 1) + " " + productos[j]
                        + ": $" + precios[j]);
                }

                int codigo = Integer.parseInt(
                    IO.readln("\nIngresa el codigo del producto: "));

                while (codigo < 1 || codigo > 4) {
                    codigo = Integer.parseInt(
                        IO.readln("Codigo incorrecto, ingresa del 1 al 4: "));
                }

                int cantidad = Integer.parseInt(
                    IO.readln("Cuantas unidades deseas comprar: "));

                while (cantidad <= 0) {
                    cantidad = Integer.parseInt(
                        IO.readln("Ingresa una cantidad mayor que cero: "));
                }

                String producto = "";
                double precio = 0;
                int posicion = codigo - 1;

                switch (codigo) {
                    case 1:
                        producto = productos[0];
                        precio = precios[0];
                        break;
                    case 2:
                        producto = productos[1];
                        precio = precios[1];
                        break;
                    case 3:
                        producto = productos[2];
                        precio = precios[2];
                        break;
                    case 4:
                        producto = productos[3];
                        precio = precios[3];
                        break;
                }

                double importe = precio * cantidad;

                vendidos[posicion] += cantidad;
                totalCliente += importe;
                unidadesCliente += cantidad;

                IO.println("\nProducto comprado: " + producto);
                IO.println("Cantidad: " + cantidad);
                IO.println("Precio unitario: $" + precio);
                IO.println("Total de este producto: $" + importe);

                continuar = IO.readln(
                    "Desea agregar otro producto? (si/no): ");
            }

            double promedio = totalCliente / unidadesCliente;

            IO.println("\nRESUMEN CLIENTE");
            IO.println("Nombre: " + nombre);
            IO.println("Unidades compradas: " + unidadesCliente);
            IO.println("Total de compra: $" + totalCliente);
            IO.println("Promedio de venta: $" + promedio);

            totalGeneral += totalCliente;
        }

        IO.println("\nREPORTE FINAL");
        IO.println("Clientes atendidos: " + clientes.size());

        for (int i = 0; i < clientes.size(); i++) {
            IO.println("Cliente " + (i + 1) + ": " + clientes.get(i));
        }

       


        IO.println("\nTotal recaudado: $" + totalGeneral);
    }
}
