package strategy.gui.model;

public class Context {

    private Checker checker;

    public void setStrategy(Checker checker){
        this.checker = checker;
    }

    public boolean useChecker(String text){
        return this.checker.check(text);
    }
}
