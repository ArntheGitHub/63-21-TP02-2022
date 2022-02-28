public class Test{
    // variables d'instance 
    public static void main(String[] args) {
        Personne p1 = new Personne("Maral", "Jean");
        Compte compteJean = new Compte(123456, p1, 7600);
        Personne p2 = new Personne("Maral", "Adele");
        Compte compteAdele = new Compte(123456, p1, 7600);
        compteJean.afficher();
        compteJean.retirer(600);
        System.out.println("----- Retrait 600 -----");
        compteJean.afficher();
        compteJean.deposer(50);
        System.out.println("----- Dépôt 50 -----");
        compteJean.afficher();
        compteJean.virement(70,compteAdele);
        System.out.println("----- Virement 70 -----");
        compteJean.afficher();
        System.out.println("----- Achat 999999999 -----");
        compteJean.achat(999999999);
        System.out.println("----- Achat 100 -----");
        compteJean.achat(100);
        compteJean.afficher();
        System.out.println("----- Prêt 5000000 -----");
        compteJean.demandePret(5000000);
        compteJean.afficher();
        System.out.println("----- Prêt 500 -----");
        compteJean.demandePret(500);
        compteJean.afficher();
        System.out.println("----- Prêt 400 -----");
        compteJean.demandePret(400);
    }
}
