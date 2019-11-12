package Biblioteka;

public class KsiazkaZOkladkaTwarda extends Dekorator{

        public KsiazkaZOkladkaTwarda(Publikacja publikacja) {
            super(publikacja);
        }

        @Override
        public String toString() {
            return publikacja.toString() + TwardaOkladka() ;
        }

        private String TwardaOkladka(){
            return "Okladka Twarda" +"|";
        }
    }

