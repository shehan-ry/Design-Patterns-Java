package strategy.gui.model;

public class DigitStrategy implements Checker {

    @Override
    public boolean check(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
