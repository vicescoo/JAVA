public class Promedio {
    public static void main(String[] args) {

        double promedio, mate, progra, bd, comuni;
        String nombre;

        nombre = IO.readln("Ingresa tu nombre");

        mate = Double.parseDouble(IO.readln("Ingresa la calificacion de Matematicas"));
        progra = Double.parseDouble(IO.readln("Ingresa la calificacion de Programacion"));
        bd = Double.parseDouble(IO.readln("Ingresa la calificacion de Base de Datos"));
        comuni = Double.parseDouble(IO.readln("Ingresa la calificacion de Comunicacion"));

        promedio = (mate + progra + bd + comuni) / 4;

        if (promedio < 6) {

            IO.println("Nombre del alumno: " + nombre);
            IO.println("Promedio general: " + promedio);
            IO.println("Alumno Rezagado");

        } else {

            if (promedio >= 6 && promedio < 8) {

                IO.println("Nombre del alumno: " + nombre);
                IO.println("Promedio general: " + promedio);
                IO.println("Alumno Aprobado");

            } else {

                if (promedio >= 8 && promedio < 9) {

                    IO.println("Nombre del alumno: " + nombre);
                    IO.println("Promedio general: " + promedio);
                    IO.println("Alumno con Buen desempeño");

                } else {

                    if (mate >= 8 && progra >= 8 && bd >= 8 && comuni >= 8) {

                        IO.println("Nombre del alumno: " + nombre);
                        IO.println("Promedio general: " + promedio);
                        IO.println("Alumno con Excelencia academica");
                        IO.println("Beca del 20% en inscripcion del siguiente semestre");

                    } else {

                        IO.println("Nombre del alumno: " + nombre);
                        IO.println("Promedio general: " + promedio);
                        IO.println("Alumno con Excelencia academica");

                    }
                }
            }
        }
    }
}