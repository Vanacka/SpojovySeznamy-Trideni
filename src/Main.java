import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Prvek hlava = null;

        Scanner sc = new Scanner(System.in);

        for (;;) {
            int vstup = sc.nextInt();
            if (vstup == 0) {
                break;
            }
            Prvek novy = new Prvek(vstup, null);
            if (hlava == null) {
                hlava = novy;
            }
            for (Prvek predchozi = hlava; predchozi != null; predchozi = predchozi.dalsiPrvek) {
                Prvek i = predchozi.dalsiPrvek;
                if (predchozi.hodnota <= hlava.hodnota) {
                    novy.dalsiPrvek = hlava;
                    hlava = novy;
                }
                else {

                }
            }
        }
    }
}