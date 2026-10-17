public class ChocolateFeast {

    public static void main(String[] args) {
        System.out.println(maximumChocolates(15, 1, 3));
    }

    public static int maximumChocolates(int money, int price, int wrap) {
        int chocolates = money / price;

        if (chocolates == 0 || wrap <= 1) {
            return chocolates;
        }

        int wrappers = chocolates;

        while (wrappers >= wrap) {
            int newChocolates = wrappers / wrap;
            chocolates += newChocolates;
            wrappers = (wrappers % wrap) + newChocolates;
        }

        return chocolates;
    }
}