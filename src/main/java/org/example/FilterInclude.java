package org.example;

public class FilterInclude implements GenreFilter{
    private Album.Genre genreToInclude;

    public FilterInclude(Album.Genre genreToInclude) {
        this.genreToInclude = genreToInclude;
    }

    @Override
    public boolean permit(Album a) {
        if(a.genre().equals(genreToInclude.toString())){
            return true;
        }
        return false;
    }
}
