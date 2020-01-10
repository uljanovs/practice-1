public class BackwardCounter {
    public static void main(String[] args) {
        String whenDevisibleByFive = "Agile";
        String whenDevisibleByThree = "Software";
        String whenDevisibleByBothNumbers = "Testing";

        for (int i = 100; i >= 1; i--) {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println(whenDevisibleByFive);
            } else if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(whenDevisibleByThree);
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(whenDevisibleByBothNumbers);
            } else {
                System.out.println(i);
            }
        }
    }
}
