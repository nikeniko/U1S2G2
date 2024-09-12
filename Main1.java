import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> words = new HashSet<>();
        List<String> duplicates = new ArrayList<>();

        System.out.println("Inserisci il quantitativo di parole, 0 per uscire dal programma");
        int numParole = Integer.parseInt(scanner.nextLine());

        if (numParole > 0) {

            for (int i = 0; i < numParole; i++) {
                System.out.println("Aggiungi parola");
                String word = scanner.nextLine();
                boolean added = words.add(word);
                if (!added) {
                    System.out.println(word + " parola già inclusa");
                    duplicates.add(word);
                }
            }
            System.out.println("Numero di parole: " + words.size());
            System.out.println("Elenco parole " + words);
            System.out.println("Elenco parole uguali " + duplicates);
        } else
            {
                System.out.println("Numero minore uguale a 0");
            }
            scanner.close();
        }

    }

