package Biblioteka;

public class KsiazkaZObwoluta extends Dekorator {
    public KsiazkaZObwoluta(Publikacja publikacja) {
        super(publikacja);
    }

    public String toString() {
        return publikacja.toString() + Obwoluta() ;
    }

    private String Obwoluta(){
        return "Ksiazka z obwoluta" +"|";
    }
}
