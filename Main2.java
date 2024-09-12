import java.util.*;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero di parole e premi Invio:");
        int numeroParole = scanner.nextInt();

        List<Integer> numeriCasuali = generaNumeriCasuali(numeroParole);

        System.out.println("-------------------- FUNZIONE 1 ----------------------");
        visualizzaLista(numeriCasuali);

        System.out.println("-------------------- FUNZIONE 2 ----------------------");
        List<Integer> specchiata = creaListaSpecchiata(numeriCasuali);
        visualizzaLista(specchiata);

        System.out.println("-------------------- FUNZIONE 3 ----------------------");
        mostraIndiciDispariPari(specchiata, false); 
        mostraIndiciDispariPari(specchiata, true);

        scanner.close();
    }
    public static List<Integer> generaNumeriCasuali(int numero) {
        List<Integer> numeri = new ArrayList<>();
        Random casuale = new Random();
        for (int i = 0; i < numero; i++) {
            numeri.add(casuale.nextInt(101));
        }
        Collections.sort(numeri);
        return numeri;
    }
    public static List<Integer> creaListaSpecchiata(List<Integer> listaOriginale) {
        List<Integer> listaCombinata = new ArrayList<>(listaOriginale);
        for (int i = listaOriginale.size() - 1; i >= 0; i--) {
            listaCombinata.add(listaOriginale.get(i));
        }
        return listaCombinata;
    }
    public static void visualizzaLista(List<Integer> lista) {
        System.out.println("Visualizzazione lista di dimensione " + lista.size());
        int posizione = 0;
        for (Integer numero : lista) {
            System.out.println("Indice [" + posizione++ + "]: " + numero);
        }
    }
    public static void mostraIndiciDispariPari(List<Integer> lista, boolean pari) {
        System.out.println("Visualizzazione lista di dimensione " + lista.size());
        String tipoIndice = pari ? "pari" : "dispari";
        System.out.println("Mostro solo i numeri in posizioni " + tipoIndice + ":");
        for (int i = 0; i < lista.size(); i++) {
            if ((pari && i % 2 == 0) || (!pari && i % 2 != 0)) {
                System.out.println("Indice [" + i + "]: " + lista.get(i));
            }
        }
    }
}
