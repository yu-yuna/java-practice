package pr_13;

public class Main6 {

    String getLine(String[] words) {

        StringBuilder result = new StringBuilder();

        boolean[] used = new boolean[words.length];

        result.append(words[0]);
        used[0] = true;

        for (int i = 1; i < words.length; i++) {

            char lastChar =
                    Character.toLowerCase(
                            result.charAt(result.length() - 1)
                    );

            for (int j = 0; j < words.length; j++) {

                if (!used[j]) {

                    char firstChar =
                            Character.toLowerCase(words[j].charAt(0));

                    if (lastChar == firstChar) {

                        result.append(" ")
                                .append(words[j]);

                        used[j] = true;
                        break;
                    }
                }
            }
        }

        return result.toString();
    }

    void main() {

        String[] words = {
                "apple",
                "elephant",
                "tiger",
                "rabbit",
                "tree",
                "eagle",
                "egg",
                "giraffe"
        };

        System.out.println(getLine(words));
    }
}