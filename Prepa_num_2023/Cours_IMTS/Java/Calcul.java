public class Calcul {
    public static int calculer(int a, int b) {
        int result = a + b;

        if (a == 0)  {
            result = b * 2;
        }

        if (b == 0) {
            result = a * a;
        }

        return result;

    }
}