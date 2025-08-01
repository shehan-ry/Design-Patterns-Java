package strategy.model;

public class Context {

    private Search search;

    public void setSearch(Search search){
        this.search = search;
    }

    public void useSearch(String text){
        System.out.println(this.search.search(text));;
    }
}
