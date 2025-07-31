package strategy;

public class CharacterSearchStrategy implements Search {

    @Override
    public boolean search(String text) {

        boolean status = false;

        for (int i = 0; i < text.length(); i++) {
            if (String.valueOf(text.charAt(i)).equals("a")) {
                status = true;
                break;
            }
        }

        return status;
    }
}