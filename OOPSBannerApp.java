import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC7 {

    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    static class CharacterPatternMap {
        private static final Map<Character, String[]> map = new HashMap<>();

        static {
            map.put('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            });

            map.put('P', new String[]{
                    "***** ",
                    "*     *",
                    "*     *",
                    "***** ",
                    "*      ",
                    "*      ",
                    "*      "
            });

            map.put('S', new String[]{
                    " ***** ",
                    "*     *",
                    "*      ",
                    " ***** ",
                    "      *",
                    "*     *",
                    " ***** "
            });
        }

        public static String[] getPattern(char ch) {
            return map.get(ch);
        }
    }

    public static void main(String[] args) {

        String word = "OOPS";
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = CharacterPatternMap.getPattern(ch);
                line.append(pattern[i]).append("   ");
            }

            banner[i] = line.toString();
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
    

