package strategy.model;

public class Main {

    public static void main(String[] args) {

        String text = "Java";

        Context context = new Context();

        context.setSearch(new CharacterSearchStrategy());
        context.useSearch(text);

        context.setSearch(new StringContainsStrategy());
        context.useSearch(text);
    }
}
