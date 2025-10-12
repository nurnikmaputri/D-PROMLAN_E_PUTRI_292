public class MindFinder {
    public static int findMind(int a, int b, int c) {

        if (a <= b && b <=c){
            return a;
        }else if (b <= a && b <= c){
            return b;
        }else {
            return c;
        }
    }
}