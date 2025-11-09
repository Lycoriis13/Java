public class MTable {
    public static void main(String[] args) {
        int size = 10;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                int result = i * j;
                System.out.print(i + " * " + j + " = " + result + "\t");
            }

            System.out.println();
        }
    }
}
