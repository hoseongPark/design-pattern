package adapter;

public class SearchButton {

    private MyProgram myProgram;

    public SearchButton(MyProgram myProgram) {
        this.myProgram = myProgram;
    }

    private SerachStrategy serachStrategy = new SearchStrategyAll();

    public void setSearchStrategy (SerachStrategy serachStrategy) {
        this.serachStrategy = serachStrategy;
    }

    public void onClick() {
        serachStrategy.search();
    }
}
