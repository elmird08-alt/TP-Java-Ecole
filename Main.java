package Ecole;

public class Main {

    public static void main(String[] args) {

        Etudiant e1 = new Etudiant("Ali", "Ben Salah", "ali@gmail.com", "E001");
        e1.ajouterNote(14);
        e1.ajouterNote(16);
        e1.ajouterNote(12);

        Etudiant e2 = new Etudiant("Sara", "Trabelsi", "sara@gmail.com", "E002");
        e2.ajouterNote(18);
        e2.ajouterNote(15);

        Enseignant p1 = new Enseignant("Mohamed", "Khalil", "mohamed@gmail.com", "Informatique", 20);

        Enseignant p2 = new Enseignant("Amira", "Saidi", "amira@gmail.com", "Mathematiques", 15);

        Personne[] personnes = {e1, e2, p1, p2};

        for (Personne p : personnes) {
            System.out.println("--------------------");
            p.afficherInfos();
        }

        Cours cours = new Cours("POO Java", p1);

        cours.ajouterEtudiant(e1);
        cours.ajouterEtudiant(e2);

        cours.afficherMeilleurEtudiant();
    }
}