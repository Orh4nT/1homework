public class Main {
    public static void main(String[] args) {
        int[] dakikalar = {700,25,156,320,489,328};
        String[] isimler = {"Akif","Orhan","Eren","Mustafa","İzzet","Emre"};
        race race1 = new race(isimler,dakikalar);
        race1.mesajlar();
    }
}