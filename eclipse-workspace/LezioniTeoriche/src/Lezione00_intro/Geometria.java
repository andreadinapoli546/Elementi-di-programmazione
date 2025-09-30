package Lezione00_intro;

public class Geometria {
	    public static void main(String[] args) {
	     
	        double baseRettangolo = 18;
	        double altezzaRettangolo = 9.4;

	        double baseTriangolo = 5.8;
	        double altezzaTriangolo = 4.6;
	        double lato1Triangolo = 6.5;
	        double lato2Triangolo = 3.2;

	        
	        System.out.println("Rettangolo:");
	        double areaRettangolo = baseRettangolo * altezzaRettangolo;
	        double perimetroRettangolo = 2 * (baseRettangolo + altezzaRettangolo);
	        System.out.println("Area = " + areaRettangolo);
	        System.out.println("Perimetro = " + perimetroRettangolo);

	        
	        System.out.println("Triangolo:");
	        double areaTriangolo = (baseTriangolo * altezzaTriangolo) / 2;
	        double perimetroTriangolo = baseTriangolo + lato1Triangolo + lato2Triangolo;
	        System.out.println("Area = " + areaTriangolo);
	        System.out.println("Perimetro = " + perimetroTriangolo);

	        
	        baseRettangolo = 20; 
	        altezzaRettangolo = 10;

	        System.out.println("\nRettangolo (dati modificati):");
	        areaRettangolo = baseRettangolo * altezzaRettangolo;
	        perimetroRettangolo = 2 * (baseRettangolo + altezzaRettangolo);
	        System.out.println("Area = " + areaRettangolo);
	        System.out.println("Perimetro = " + perimetroRettangolo);
	    }
	}



