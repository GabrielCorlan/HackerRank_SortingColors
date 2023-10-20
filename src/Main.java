public class Main {
    public static void main(String[] args) {

        int[] sosete = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        // int[] sosete = {1, 2, 1, 2, 1, 3, 2}

        int soseta1 = 0;
        int soseta2 = 0;
        int soseta3 = 0;

        for (int i = 0; i < sosete.length; i++) {
            if(sosete[i] == 1){
                soseta1++;
            }
            else if(sosete[i] == 2){
                soseta2++;
            }
            else {
                soseta3++;
            }
        }

        System.out.println("Numarul de perechi este: " + (soseta1/2 + soseta2/2 + soseta3/2));
    }
}
