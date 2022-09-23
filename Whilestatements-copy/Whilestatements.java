public class Whilestatements
{
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;

    public void run() {
        int i = 0;
        while (i < 15) {
            System.out.println("i =" + i + "which is < 15");
            i++;
        }
        int k = 10;
        while (k > 5) {
            System.out.println("k = " + k + "k which is > 5");
            k--;
        }
        int b = 8;
        while (a < 10) {
            while (b <= 20) {
                System.out.println("b = " + b + " which is <= 20," + " a is " + a + " which is < 10");
                a++;
                b++;
        }
    }
} 
    public static void main(String[] args)
    {        
        Whilestatements hw = new Whilestatements();
        hw.run();
    }
}