package adapter;

public interface SerachStrategy {
    public void search();
}

class SearchStrategyAll implements SerachStrategy {
    @Override
    public void search() {
        System.out.println("SEARCH ALL");
    }
}

class SearchStrategyImage implements SerachStrategy {
    @Override
    public void search() {
        System.out.println("SEARCH IMAGE");
    }
}

class SearchStrategyNews implements SerachStrategy {
    @Override
    public void search() {
        System.out.println("SEARCH NEWS");
    }
}

class SearchStrategyMap implements SerachStrategy {
    @Override
    public void search() {
        System.out.println("SEARCH MAP");
    }
}

class SearchFindAdapter implements SerachStrategy {

    private FindAlgorithm findAlgorithm;

    public SearchFindAdapter(FindAlgorithm findAlgorithm) {
        this.findAlgorithm = findAlgorithm;
    }

    @Override
    public void search() {
        findAlgorithm.find(true);
    }
}