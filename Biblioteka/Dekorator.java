package Biblioteka;

public class Dekorator implements Publikacja {
 Publikacja publikacja;

 public Dekorator(Publikacja publikacja){
     this.publikacja = publikacja;
 }

    @Override
    public void setAutor(String daneAutora) {
    }

    @Override
    public void setTtytul(String tytul) {
    }

    @Override
    public void setStrony(int liczbaStron) {
    }
}
