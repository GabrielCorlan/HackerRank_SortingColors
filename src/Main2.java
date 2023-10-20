import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        ArrayList<Integer> sosete = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Cate sosete vrei sa ai in morman?");
        int numarSosete = sc.nextInt();

        for (int i = 0; i < numarSosete; i++) {
            System.out.println("Introdu o soseta: ");
            sosete.add(sc.nextInt());
        }

        System.out.println(sosete);
        int numarPerechi = 0;


        for (int i = 0; i < sosete.size(); i++) {
            boolean pairFound = false;
            for (int j = i + 1; j < sosete.size(); j++) {
                if (sosete.get(i).equals(sosete.get(j))) {
                      numarPerechi++;
                      pairFound = true;
                      sosete.remove(j);
                      sosete.remove(i);
                      break;
                }
                if(j == sosete.size()-1 && !pairFound){
                    System.out.println("Am gasit " + numarPerechi + " perechi");
                    return;
                }
            }

            i = -1;
            if(sosete.size() < 2){
                break;
            }
        }

        System.out.println("Am gasit " + numarPerechi + " perechi");
    }
}
