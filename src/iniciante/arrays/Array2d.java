package iniciante.arrays;

public class Array2d {
    public static void main(String[] args) {
        /*  Aprendendo sobre arrays de arrays simplemente array 2d
        * */
        String[][] ninjasEAldeias = new String[3][3];

        ninjasEAldeias[0][0] = "Kohoha";
        ninjasEAldeias[0][1] = "Naruto";
        ninjasEAldeias[0][2] = "Sasuke";

        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Zabuza";
        ninjasEAldeias[1][2] = "HAku";

        ninjasEAldeias[2][0] = "Deserto";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "temari";

//        System.out.println(ninjasEAldeias[0][0]);

        for (String[] i : ninjasEAldeias) {
            for (String ninjaEAldeia : i) {
                System.out.println(ninjaEAldeia);
            }
        }

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            for (int j = 0; j < ninjasEAldeias[i].length; j++) {
                System.out.println(ninjasEAldeias[i][j]);
            }
        }

    }
}
