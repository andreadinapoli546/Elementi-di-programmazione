package Corso;

import model.Corso;
import java.io.*;
import java.util.*;

public class CorsoController {

    private static final String FILE_PATH = "db/CorsiDB.csv";

    public void aggiungiCorso(Corso corso) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            bw.write(corso.toCSV());
            bw.newLine();
            System.out.println("✅ Corso aggiunto con successo!");
        } catch (IOException e) {
            System.err.println("Errore durante la scrittura nel file dei corsi: " + e.getMessage());
        }
    }

    public List<Corso> leggiCorsi() {
        List<Corso> corsi = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                corsi.add(Corso.fromCSV(line));
            }
        } catch (IOException e) {
            System.err.println("Errore durante la lettura dei corsi: " + e.getMessage());
        }
        return corsi;
    }
}
