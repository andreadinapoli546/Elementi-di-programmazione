package Corso; // oppure meglio package main; (vedi nota sotto)

import controller.*;
import model.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CorsoController corsoCtrl = new CorsoController();
        StudentiController studCtrl = new StudentiController();

        int scelta;
        do {
            System.out.println("\n===== MENU GESTIONE SCUOLA =====");
            System.out.println("1. Inserisci nuovo corso");
            System.out.println("2. Inserisci nuovo studente");
            System.out.println("3. Mostra tutti i corsi");
            System.out.println("4. Mostra tutti gli studenti");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            scelta = sc.nextInt();
            sc.nextLine(); // pulisce il buffer

            switch (scelta) {
                case 1:
                    System.out.print("Titolo corso: ");
                    String titolo = sc.nextLine();
                    System.out.print("Codice corso: ");
                    String codice = sc.nextLine();
                    System.out.print("Numero partecipanti: ");
                    int num = sc.nextInt(); 
                    sc.nextLine();

                    Corso c = new Corso(titolo, codice, num);
                    corsoCtrl.aggiungiCorso(c);
                    break;

                case 2:
                    System.out.print("Nome studente: ");
                    String nome = sc.nextLine();
                    System.out.print("Cognome studente: ");
                    String cognome = sc.nextLine();
                    System.out.print("Codice Fiscale: ");
                    String cf = sc.nextLine();
                    System.out.print("Corso iscritto: ");
                    String corsoIscritto = sc.nextLine();

                    Studente s = new Studente(nome, cognome, cf, corsoIscritto);
                    studCtrl.aggiungiStudente(s);
                    break;

                case 3:
