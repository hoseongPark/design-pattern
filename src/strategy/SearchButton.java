package strategy;

public class SearchButton {

    private MyProgram myProgram;

    public SearchButton(MyProgram myProgram) {
        this.myProgram = myProgram;
    }

    private SerachStrategy serachStrategy = new SerachStrategyAll();

    public void setSearchStrategy (SerachStrategy serachStrategy) {
        this.serachStrategy = serachStrategy;
    }

    public void onClick() {
        serachStrategy.search();
    }
}
