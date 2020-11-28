package strategy;

public class MyProgram {
    private SearchButton searchButton = new SearchButton(this);

    public void setModeAll() {
        searchButton.setSearchStrategy(new SerachStrategyAll());
    }

    public void setModeImage() {
        searchButton.setSearchStrategy(new SerachStrategyImage());
    }

    public void setModeNews() {
        searchButton.setSearchStrategy(new SerachStrategyNews());
    }

    public void setModeMap() {
        searchButton.setSearchStrategy(new SerachStrategyMap());
    }

    public void testProgram() {
        searchButton.onClick();
        setModeImage();
        searchButton.onClick();
        setModeNews();
        searchButton.onClick();
        setModeMap();
        searchButton.onClick();
    }
}
