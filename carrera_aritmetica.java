import java.util.Random;

public class carrera_aritmetica {
    public static void main(String[] args){
        Random random = new Random();
        IO.println("Ingresa tu numero de entrada");
        double datos_entrada = Double.parseDouble(IO.readln());

        IO.println("Ingresa tu mes de nacimiento");
        int mes_nacimiento = Integer.parseInt(IO.readln());
        double salida;
        double entrada;
        // ETAPA 1
        double suma = 0;
        double promedio = 0;
        for (int i=0; i < 5; i++) {
            int numero = random.nextInt(10) + 1; 
            suma = suma+numero;
            promedio = suma/5;
        }
        entrada = datos_entrada;
        salida = entrada+promedio;
         //ETAPA 2
         
         double residuo = salida/7;
         entrada = salida;
         salida = entrada+residuo;
         
         //ETAPA 3
         double porcentaje = (salida*0.12);
         entrada = salida;
         salida = entrada + (entrada * porcentaje);

         //ETAPA 4
          int suma_n = 5+8+9+12+34;
          entrada = salida;
          salida = entrada + suma_n;
        // ETAPA 5
        entrada = salida;
        IO.println("Elige un divisor 1-9");
        double divisor = Double.parseDouble(IO.readln());
        salida = entrada / divisor ;
           
          switch (mes_nacimiento % 2) {
            case 0: {
                  int salida_final = (int) salida;
                  IO.println("la salida final es: "+salida_final);
                  break;
            }
            case 1 : {
                IO.println("La salida final es: "+ String.format("%.4f", salida));
                break ;
            }
                


                      

          }





        






    }
    
}
