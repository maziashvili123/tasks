public class Massive {
    public static void main() {
        int[] array = {12, 22, 34, 43, 54, 62, 37};
        for (int i = 0; i < array.length; i++) {
            if (i == 5)
                continue;
            System.out.println(array[i]);
        }
    }
}
