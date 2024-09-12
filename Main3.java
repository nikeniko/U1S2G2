import java.util.HashMap;
import java.util.Map;

public class Main3 {
    private static final Map<String, String> contatti = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("-------------------- FUNZIONE 1 ----------------------");
        try {
            aggiungiContatto("Mario Rossi", "+39 3456789012");
            aggiungiContatto("Luigi Bianchi", "+39 3456789013");
            aggiungiContatto("Anna Verdi", "+39 3456789014");
            System.out.println("Numero di contatti aggiunti: " + contatti.size());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("-------------------- FUNZIONE 2 ----------------------");
        int numeroContattiPreEliminazione = contatti.size();
        rimuoviContattoPerNome("Anna Verdi");
        System.out.println("Contatti rimossi: " + (numeroContattiPreEliminazione - contatti.size()));

        System.out.println("-------------------- FUNZIONE 3 ----------------------");
        trovaPersonaPerNumero("+39 3456789012");

        System.out.println("-------------------- FUNZIONE 4 ----------------------");
        trovaNumeroPerNome("Mario Rossi");

        System.out.println("-------------------- FUNZIONE 5 ----------------------");
        stampaLista();
    }

    private static void aggiungiContatto(String nome, String telefono) {
        contatti.put(nome, telefono);
    }

    private static void rimuoviContattoPerNome(String nome) {
        contatti.remove(nome);
    }

    private static void trovaPersonaPerNumero(String telefono) {
        String nome = "";
        for (Map.Entry<String, String> entry : contatti.entrySet()) {
            if (telefono.equals(entry.getValue())) {
                nome = entry.getKey();
                break;
            }
        }
        System.out.println(!nome.isEmpty() ? nome : "Contatto non trovato");
    }

    private static void trovaNumeroPerNome(String nome) {
        String telefono = contatti.get(nome);
        System.out.println(telefono != null ? telefono : "Numero non trovato!");
    }

    private static void stampaLista() {
        for (Map.Entry<String, String> entry : contatti.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Numero di telefono: " + entry.getValue());
        }
    }
}
