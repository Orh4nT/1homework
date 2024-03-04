public class race {
    public String[] isim;
    public int[] dakika;

    public race(String[] isim, int[] dakika) {
        this.isim = isim;
        this.dakika = dakika;
    }

    public int birinciKosucu() {
        int dusuk = dakika[0];
        int x = 0;

        for (int i = 0; i < dakika.length; i++) {
            if (dakika[i] < dusuk) {
                dusuk = dakika[i];
                x = i;
            }
        }
        return x;
    }

    public int ikinciKosucu() {
        int dusuk = 999999999;
        int firstindex = birinciKosucu();
        int x = 0;
        for (int i = 0; i < dakika.length; i++) {
            if (i == firstindex) continue;
            if (dakika[i] < dusuk) {
                dusuk = dakika[i];
                x = i;
            }
        }
        return x;
    }

    public int ucuncuKosucu() {
        int min = 99999999;
        int firstindex = birinciKosucu();
        int secondindex = ikinciKosucu();
        int index = 0;
        for (int i = 0; i < dakika.length; i++) {
            if (i == firstindex || i == secondindex) continue;
            if (dakika[i] < min) {
                min = dakika[i];
                index = i;
            }
        }
        return index;
    }

    public void birinciMesaji() {
        int i = birinciKosucu();
        System.out.println("Birinci: " + isim[birinciKosucu()] + " " + dakika[birinciKosucu()] + "'");
    }

    public void ikinciMesaji() {
        int i = birinciKosucu();
        System.out.println("İkinci: " + isim[ikinciKosucu()] + " " + dakika[ikinciKosucu()] + "'");
    }

    public void ucuncuMesaji() {
        int i = birinciKosucu();
        System.out.println("Üçüncü: " + isim[ucuncuKosucu()] + " " + dakika[ucuncuKosucu()] + "'");
    }

    public void mesajlar() {
        birinciMesaji();
        ikinciMesaji();
        ucuncuMesaji();
        liste();
    }

    public void liste() {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < dakika.length; i++) {
            if (dakika[i] >= 400)
                c++;
            else if (dakika[i] >= 300)
                b++;
            else if (dakika[i] >= 200)
                a++;
        }
        System.out.println("A -> " + a);
        System.out.println("B -> " + b);
        System.out.println("C -> " + c);

    }
}








