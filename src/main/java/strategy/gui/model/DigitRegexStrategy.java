package strategy.gui.model;

public class DigitRegexStrategy implements Checker {

    @Override
    public boolean check(String text) {
        return text.matches("^\\d+$");
    }
}
