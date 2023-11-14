import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Aukeratu eragiketa bat:");
        System.out.println("1.Batuketa       2.Kenketa");
        System.out.println("3.Biderketa      4.Zatiketa");
        System.out.println("5.Berreketa      6.Hondarra");
        int eragiketa = sc.nextInt();

        if (eragiketa >= 7 || eragiketa == 0){
            System.out.println("Sartu duzun aukera ez da egokia.");
            System.exit(0);
        }

        System.out.println("Sartu lehen zenbakia (hamartarra izan daiteke):");
        double zenbakia1 = sc.nextDouble();
        System.out.println("Sartu bigarren zenbakia (hamartarra izan daiteke):");
        double zenbakia2 = sc.nextDouble();
        sc.close();


        double guztira = 0;

        if (eragiketa ==1){
            guztira = zenbakia1 + zenbakia2;

    }
}