package org.example;
import java.util.ArrayList;
import java.util.List;

public class Feste {
    public static void main(String[] args) {
            // Creazione di una lista di stringhe
            List<String> lista = new ArrayList<>();

            // Aggiunta di elementi alla lista
            lista.add("Natale");
            lista.add("Pasqua");
            lista.add("Capodanno");
            lista.add("Festa della mamma");

            // Stampa della lista dopo l'aggiunta degli elementi
            System.out.println("Lista dopo l'aggiunta degli elementi: " + lista);

            // Rimozione di un elemento dalla lista
            lista.remove("Festa della mamma");

            // Stampa della lista dopo la rimozione dell'elemento
            System.out.println("Lista dopo la rimozione di 'Festa della mamma': " + lista);

            // Iterazione attraverso la lista e stampa di ogni elemento
            System.out.println("Elementi nella lista:");
            for (String feste : lista) {
                System.out.println(feste);
            }

            // Verifica se un elemento esiste nella lista
            String elementoDaVerificare = "Natale";
            if (lista.contains(elementoDaVerificare)) {
                System.out.println(elementoDaVerificare + " è presente nella lista.");
            } else {
                System.out.println(elementoDaVerificare + " non è presente nella lista.");
            }

            // Ottenere un elemento specifico dalla lista
            int indice = 1;
            String elemento = lista.get(indice);
            System.out.println("L'elemento all'indice " + indice + " è " + elemento);

            // Modificare un elemento della lista
            lista.set(1, "Festa dei lavoratori");
            System.out.println("Lista dopo la modifica: " + lista);

            // Dimensione della lista
            int dimensione = lista.size();
            System.out.println("La lista contiene " + dimensione + " elementi.");
        }
    }


