package Biblioteka;

public class Main {
    public static void main(String[] args) {
        Publikacja k1 = new Ksiazka("Adam Mickiewicz","Pan Tadeusz",340);
        System.out.println(k1);

        Publikacja test = new KsiazkaZAutografem(k1, "To jest test");
        System.out.println(test);
        Publikacja test2 = new KsiazkaZAutografem(k1, "To je2222st test");
        System.out.println(test2);
        Publikacja kk1 = new KsiazkaZOkladkaZwykla(k1);
        System.out.println(kk1);
    }
}
