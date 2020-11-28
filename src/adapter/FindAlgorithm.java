package adapter;

public interface FindAlgorithm {
    public void find(boolean global);
}

class FindMovieAlgorithm implements FindAlgorithm {

    @Override
    public void find(boolean global) {
        System.out.println("FIND MOVIE" + (global ? " GLOBALLY" : " "));
    }
}
