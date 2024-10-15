import java.util.ArrayList;
import java.util.Scanner;

public class ChatApp {
    private ArrayList<String> messages;
    private Scanner scanner;

    public ChatApp() {
        messages = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Discussion communautaire commencée.");
        while (true) {
            System.out.println("1. Envoyer un message\n2. Afficher les messages\n3. Quitter");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la ligne

            switch (choix) {
                case 1:
                    envoyerMessage();
                    break;
                case 2:
                    afficherMessages();
                    break;
                case 3:
                    System.out.println("Discussion terminée.");
                    return;
                default:
                    System.out.println("Choix invalide.");
            }
        }
    }

    private void envoyerMessage() {
        System.out.print("Entrez votre message : ");
        String message = scanner.nextLine();
        messages.add(message);
        System.out.println("Message envoyé !");
    }

    private void afficherMessages() {
        System.out.println("Historique des messages :");
        for (String message : messages) {
            System.out.println(message);
        }
    }
}

