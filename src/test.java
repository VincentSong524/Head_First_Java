public class Test {
    public static void main(String[] args) {
        String [] numArray = new String[10];
        for ( int i = 0; i < 10; i++) {
            numArray[i] = "a" + i;
        }
        for (String num: numArray) {
            System.out.println(num);
        }
    }
}