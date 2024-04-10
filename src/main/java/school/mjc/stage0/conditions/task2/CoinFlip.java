package school.mjc.stage0.conditions.task2;

public class CoinFlip {
    public void throwCoin(int from1UpTo1000) {
/*is less than 500 print "Eagle" otherwise "Tail"
 */
        if (from1UpTo1000 < 500) System.out.println("Eagle");
        else System.out.println("Tail");
    }
}
