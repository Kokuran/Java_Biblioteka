package Biblioteka;

public class KsiazkaZOkladkaZwykla extends Dekorator{

    public KsiazkaZOkladkaZwykla(Publikacja publikacja) {
        super(publikacja);
    }

    @Override
    public String toString() {
        return publikacja.toString() + TwardaOkladka() ;
    }

    private String TwardaOkladka(){
        return "Okladka Zwykla" + "|";
    }
}
