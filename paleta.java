public class paleta {
    public static void main(String[] args) {
        double fresa = 15;
        double limon = 12;
        double coco = 18;
        double ventaf;
        double vental;
        double ventac;
        double dia;
        double diasrabaj = Double.parseDouble(IO.readln("Ingresa cuantos dias se trabajaron: "));
        double total = 0;
    
     for (int i = 1; i<=diasrabaj; i++){
        ventaf = Double.parseDouble(IO.readln("Cuantas paletas de fresa vendiste el dia " + i + ": "));
        vental = Double.parseDouble(IO.readln("Cuantas paletas de limon vendiste el dia " + i+ ": "));
        ventac = Double.parseDouble(IO.readln("Cuantas paletas de coco vendiste el dia " + i + ": "));
        dia = (ventaf * fresa) + (vental * limon) + (ventac * coco);
        total = total + dia;
        IO.println("El total de ventas del dia " + i + " es: " + dia);
        
     }
     
     
        IO.println("El total de ventas de los " + diasrabaj + " dias es: " + total);
    }
}
