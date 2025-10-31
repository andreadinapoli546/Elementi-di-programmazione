package Corso;

public class Corso {

	    private String titolo;
	    private String codice;
	    private int numPartecipanti;

	    public Corso(String titolo, String codice, int numPartecipanti) {
	        this.titolo = titolo;
	        this.codice = codice;
	        this.numPartecipanti = numPartecipanti;
	    }

	    public String getTitolo() { return titolo; }
	    public String getCodice() { return codice; }
	    public int getNumPartecipanti() { return numPartecipanti; }

	   
	    public String toString() {
	        return "Corso [Titolo=" + titolo + ", Codice=" + codice + ", Partecipanti=" + numPartecipanti + "]";
	    }

	    public String toCSV() {
	        return titolo + ";" + codice + ";" + numPartecipanti;
	    }

	    public static Corso fromCSV(String line) {
	        String[] parts = line.split(";");
	        return new Corso(parts[0], parts[1], Integer.parseInt(parts[2]));
	    }
	}



