public class TanxmovnisDatvla {
    public static void main() {
        String m = "testing";
        int count = 0;
        int i = 0;

        while (i < m.length()) {
            char S = m.charAt(i);
            i++;
            {
                if (S != 'a' && S != 'e' && S != 'i' && S != 'o' && S != 'u')
                    count++;
            }
        }
        System.out.println(count);
    }
}


