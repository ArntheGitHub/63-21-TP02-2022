/**
 * Classe représentant un compte bancaire.
 *
 * @author (votre nom)
 */
public class Compte
{
    // variables d'instance
    // A développer

    /**
     * Constructeur d'objets de classe Compte
     */
    public Compte(int noCompte, Personne proprietaire, int solde)
    {
        // A développer
    }

    /**
     * Méthode permettant de retirer un certain montant du compte (solde)
     *
     * @param  montant     montant à retirer du compte
     */
    public void retirer(int montant)
    {
        // A développer
    }
    /**
     * Méthode permettant de déposer un certain montant du compte (solde)
     *
     * @param  montant     montant à déposer sur le compte
     */
    public void deposer(int montant)
    {
        // A développer
    }
    /**
     * Méthode permettant de faire un virement d'un certain montant d'un compte à un autre.
     *
     * @param  montant          montant à retirer du compte
     *         destinataire     Compte du destinataire
     */
    public void virement(int montant, Compte destinataire)
    {
        // A développer
    }
    /**
     * Méthode permettant d'afficher les informations du compte.
     *
     * Affichage à produire :
     *         Proriétaire : VALJEAN Jean
     *         Solde : 1000CHF
     *
     */
    public void afficher()
    {
        // A développer
    }
    /**
     * Méthode permettant de faire un achat si le solde du compte est plus grand ou égal au montant de l'achat.
     *
     * Affichage à produire :
     *         Votre achat a été validé
     *                  -- ou --
     *         Votre achat dépasse la valeur de votre solde. Achat annulé.
     *
     * @param  montant          montant à retirer du compte
     */
    public void achat(int montant){
        // A développer
    }
    // Règle : montant <= 10% de la solde
    /**
     * Méthode permettant de faire une demande de prêt.
     *
     *      Si le montant du prêt demandé est inférieur ou égal à 10% du solde du compte ou qu'il n'y a pas un prêt pour ce compte
     *          "Prêt accordé"
     *      Sinon, s'il y a déjà un prêt pour ce compte
     *          "Vous avez déjà un prêt à votre actif."
     *      Sinon
     *          "Le prêt demandé est trop grand comparé à votre solde."
     *
     *
     * @param  montant          montant à déposer sur le compte
     */
    public void demandePret(int montant){
        // A développer
    }
}
