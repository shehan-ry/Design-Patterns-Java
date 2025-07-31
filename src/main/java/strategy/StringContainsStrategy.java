package strategy;

public class StringContainsStrategy implements Search {

    @Override
    public boolean search(String text) {
        if (text.contains("a")) {
            return true;
        }
        return false;
    }
}