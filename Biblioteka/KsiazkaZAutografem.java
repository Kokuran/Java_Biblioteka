package Biblioteka;

public class KsiazkaZAutografem extends Dekorator{

    private String autograf;

    public KsiazkaZAutografem(Publikacja publikacja, String autograf) {
        super(publikacja);
        System.out.println(publikacja);
        setAutograf(autograf);
    }

    @Override
    public String toString() {
        return publikacja.toString() + this.autograf +"|";
    }

    private void setAutograf(String autograf){
this.autograf = autograf;
    }
}
