package Biblioteka;

public class Ksiazka implements Publikacja{
    private String autorPublikacji, tytulPublikacji, ksiazka;
    private int liczbaStronPublikacji;

    @Override
    public void setAutor(String daneAutora) {
        this.autorPublikacji = daneAutora;
    }

    public void setTtytul (String tytul) {
        this.tytulPublikacji = tytul;
    }

    public void setStrony(int liczbaStron) {
        this.liczbaStronPublikacji = liczbaStron;
    }

    public Ksiazka(String autor, String tytul, int strony){
        setAutor(autor);
        setTtytul(tytul);
        setStrony(strony);
    }

    public String toString(){
        return "|"+this.autorPublikacji+"|"+this.tytulPublikacji+"|"+this.liczbaStronPublikacji+"|";
    }
}
