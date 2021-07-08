package com.example.AuthorApp.Model;

public class inquiry {
    private String searchString;

    public inquiry() {
    }

    public inquiry(String searchString) {
        this.searchString = searchString;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
}
