package strategy;

public interface SerachStrategy {
    public void search();
}

class SerachStrategyAll implements SerachStrategy {
    @Override
    public void search() {
        System.out.println("SEARCH ALL");
    }
}

class SerachStrategyImage implements SerachStrategy {
    @Override
    public void search() {
        System.out.println("SEARCH IMAGE");
    }
}

class SerachStrategyNews implements SerachStrategy {
    @Override
    public void search() {
        System.out.println("SEARCH NEWS");
    }
}

class SerachStrategyMap implements SerachStrategy {
    @Override
    public void search() {
        System.out.println("SEARCH MAP");
    }
}