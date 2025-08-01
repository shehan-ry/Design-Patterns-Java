package strategy.gui.model;

public class IntegerValidationStrategy implements Checker {

    @Override
    public boolean check(String text) {

        try {
            int i = Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
}
