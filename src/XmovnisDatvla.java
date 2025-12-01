public class XmovnisDatvla {
    public static void main(){
        String m = "testing";
        int count = 0;
        for (int i = 0; i < m.length(); i++) {

            char S = m.charAt(i); {
                if (S == 'a' || S == 'e' || S == 'i' || S == 'o' || S == 'u')
                    count++;
            }
        }
        System.out.println(count);
    }
}


