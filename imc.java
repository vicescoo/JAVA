public class imc {
    public static void main(String[] args) {
        int opcion;
        do {
            double peso = Double.parseDouble(IO.readln("Ingresa tu peso en kg"));
            double estatura = Double.parseDouble(IO.readln("Ingresa tu estatura en metros"));
            double imc = peso/(estatura * estatura);
            int nivel;
            if (imc<18.5){ 
                nivel = 1;
            }else if (imc<24.9){
                nivel = 2;
            }else if (imc < 29.9){
                nivel = 3;
            }else if (imc < 34.9){
                nivel = 4;
            }else if (imc < 39.9){
                nivel = 5;
            }else{
                nivel = 6;
            }
            IO.println("Tu Indice Muscular Corporal es:" + imc);
            switch (nivel){
                case 1:
                     IO.println("TU NIVEL DE PESO ES: BAJO PESO");
                    IO.println("Aumentar el consumo de alimentos nutritivos, Consultar a un nutriologo");
                    break;
                    case 2:
                        IO.println("TU NIVEL DE PESO ES: NORMAL");
                        IO.println("Seguir con los habitos, no descuidar la alimentacion ni actdividad fisica");
                        break;
                        case 3:
                            IO.println("TU NIVEL DE PESO ES: SOBREPESO");
                            IO.println("Regular la alimentacion, aun no es un caso severo pero hacer caso de la alimentacion balanceada y saludable");
                            break;
                            case 4:
                                IO.println("TU NIVEL DE PESO ES: OBESIDAD GRADO 1");
                                break;
                                case 5:
                                    IO.println("TU NIVEL DE PESO ES: OBESIDAD GRADO 2");
                                    break;
                                    case 6:
                                        IO.println("TU NIVEL DE PESO ES: OBESIDAD GRADO 3");
                                        break;
                                        

            }
            opcion = Integer.parseInt(IO.readln("Escribe 1 si quieres calcular otro IMC o 0 para salir: "));

        } while (opcion == 1);

        IO.println("Programa terminado");
    }
}
            

        
