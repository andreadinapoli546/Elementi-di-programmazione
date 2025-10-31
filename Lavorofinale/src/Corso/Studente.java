package Corso;

public class Studente {
	
	    private String nome;
	    private String cognome;
	    private String codFiscale;
	    private String corsoIscritto;

	    public Studente(String nome, String cognome, String codFiscale, String corsoIscritto) {
	        this.nome = nome;
	        this.cognome = cognome;
	        this.codFiscale = codFiscale;
	        this.corsoIscritto = corsoIscritto;
	    }

	    public String getNome() { return nome; }
	    public String getCognome() { return cognome; }
	    public String getCodFiscale() { return codFiscale; }
	    public String getCorsoIscritto() { return corsoIscritto; }

	    
	    public String toString() {
	        return "Studente [Nome=" + nome + ", Cognome=" + cognome + ", CF=" + codFiscale + ", Corso=" + corsoIscritto + "]";
	    }

	    public String toCSV() {
	        return nome + ";" + cognome + ";" + codFiscale + ";" + corsoIscritto;
	    }

	    public static Studente fromCSV(String line) {
	        String[] parts = line.split(";");
	        return new Studente(parts[0], parts[1], parts[2], parts[3]);
	    }
	}


}
