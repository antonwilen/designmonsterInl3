package org.example;

public class FilterExclude implements GenreFilter{
    private Album.Genre genreToExclude;

    public FilterExclude(Album.Genre genreToExclude) {
        this.genreToExclude = genreToExclude;
    }

    @Override
    public boolean permit(Album a) {
        if (a.genre().equals(genreToExclude.toString())){
            return false;
        }
        return true;
    }
}
