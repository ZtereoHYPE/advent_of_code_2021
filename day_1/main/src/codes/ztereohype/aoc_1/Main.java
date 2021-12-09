package codes.ztereohype.aoc_1;

public class Main {
    public static void main(String[] args) {
        int timesIncreased = 0;
        for (int i = 0; i < args.length - 1; i++) {
            if (Integer.parseInt(args[i+1]) > Integer.parseInt(args[i])) timesIncreased++;
        }
        System.out.println(timesIncreased);
    }
}
