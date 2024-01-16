public class Tabpersonne{
    // creation d'attribut 
    static int salaire=400000;
    // creation d'un constructeur qui affecte chaque objet l'attribut salaire
    public Tabpersonne(){
        this.salaire=salaire;
    }
    //creation d'une methode qui prend en parametre des personnes
    public static int somme(Tabpersonne[] tab){
        int somme=0;
         for(int i=0; i<tab.length; i++){
            somme=somme+salaire;

         }
        return somme;
    }

    public static void main(String[] args) {
        // creation d'un tableau objet 
        Tabpersonne[] person=new Tabpersonne[7];
        
      System.out.println(" la somme des salaires de ces personnes = "+somme(person));
        
    }
}