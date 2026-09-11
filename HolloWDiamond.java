public class HolloWDiamond {
     public static void main(String[] args) {

        int n = 5;

        // Upper half
        for (int i = 0; i < n; i++) {

            // Spaces before diamond
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            // Stars and spaces
            for (int j = 0; j < i * 2 + 1; j++) {

                if (j == 0 || j == i * 2) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 2; i >= 0; i--) {

            // Spaces before diamond
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            // Stars and spaces
            for (int j = 0; j < i * 2 + 1; j++) {

                if (j == 0 || j == i * 2) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}