package codes.ztereohype.aoc_1b;

public class Main {
    public static void main(String[] args) {
        int[] cumValues = new int[args.length - 2];
        for (int i = 0; i < args.length - 2; i++) {
            cumValues[i] = Integer.parseInt(args[i]) + Integer.parseInt(args[i+1]) + Integer.parseInt(args[i+2]);
        }

        int timesIncreased = 0;
        for (int i = 0; i < cumValues.length - 1; i++) {
            if (cumValues[i+1] > cumValues[i]) timesIncreased++;
        }
        System.out.println(timesIncreased);
    }
}
