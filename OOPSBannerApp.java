public class OOPSBannerUC4 {
    public static void main(String[] args) {

        // Step 1: Store banner lines in array
        String[] banner = {

                String.join("", " *****   ", "*****   ", "*****   ", "***** "),
                String.join("", "*     * ", "*     * ", "*     * ", "*     *"),
                String.join("", "*     * ", "*     * ", "*     * ", "*     *"),
                String.join("", "*     * ", "*****   ", "*****   ", "***** "),
                String.join("", "*     * ", "*       ", "*       ", "    * "),
                String.join("", "*     * ", "*       ", "*       ", "    * "),
                String.join("", " *****  ", "*       ", "*       ", "***** ")

        };

        // Step 2: Print using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
    
