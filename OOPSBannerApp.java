/**
 * OOPSBannerApp
 *
 * UC4: Store banner in String array and print using loop
 *
 * @author Niyati
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {

                String.join("  ",
                        " ***** ",
                        " ***** ",
                        " ***** ",
                        " ***** "),

                String.join("  ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     "),

                String.join("  ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     "),

                String.join("  ",
                        "*     *",
                        "*     *",
                        " ***** ",
                        " ***** "),

                String.join("  ",
                        "*     *",
                        "*     *",
                        "*      ",
                        "*     "),

                String.join("  ",
                        "*     *",
                        "*     *",
                        "*      ",
                        "*     "),

                String.join("  ",
                        " ***** ",
                        " ***** ",
                        "*      ",
                        " ***** ")
        };

        // Enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
