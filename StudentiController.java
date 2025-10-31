package Corso;

import model.Studente;
import java.io.*;
import java.util.*;

public class StudentiController {

    private static final String FILE_PATH = "db/StudentiDB.csv";

    public void aggiungiStudente(Studente studente) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            bw.write(studente.toCSV());
            bw.newLine();
            System.out.println("✅ Studente aggiunto con successo!");
        } catch (IOException e) {
            System.err.println("Errore durante la scrittura nel file degli studenti: " + e.getMessage());
        }
    }

    public List<Studente> leggiStudenti() {
        List<Studente> studenti = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                studenti.add(Studente.fromCSV(line));
            }
        } catch (IOException e) {
            System.err.println("Errore durante la lettura degli studenti: " + e.getMessage());
        }
        return studenti;
    }
}
