package Lezione00_intro;

public class EsercizioSpesa {
	public static void main (String[] args) {
		
		double speseGenerali = 240.00;
		double speseAuto = 300.00;;
		double speseVacanze = 460.00;
		double speseCasa = 260.00;
		
		double totaleSpese = speseGenerali + speseAuto + speseVacanze + speseCasa;
		double mediaSpese = totaleSpese / 4 ;
		double mediaTrimestre = totaleSpese * 3/4;
		
	System.out.println("Totale delle spese:" + totaleSpese );
	System.out.println("Media delle spese:" + mediaSpese );
	System.out.println("Totale del trimestre:" + mediaTrimestre );
	
	
	
	
		
	
			
			
	}

}
