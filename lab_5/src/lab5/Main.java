package lab5;


public class Main {
    public static void main(String[] args) {
        int[] MnogoMnogo = { 3, 5, 4, 1, 32, 32};
        int[] MaloMalo = new int[MnogoMnogo.length];
        for (int t = 0; t < MnogoMnogo.length; t++)
        {
            MaloMalo[t] = MnogoMnogo[t]+17;
            System.out.println(MaloMalo[t]);
        }
        try{
            int a = 0;
            int b = 42 / a;
        }
        catch (Exception e){
            System.out.println('1');
        }
    }
}