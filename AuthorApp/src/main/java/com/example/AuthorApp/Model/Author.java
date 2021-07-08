package com.example.AuthorApp.Model;

public class Author {
    private int id;
    private String name;
    private String profilePic;
    private String authorInformation;

    public Author(int id, String name, String profilePic, String authorInformation) {
        this.id = id;
        this.name = name;
        this.profilePic = profilePic;
        this.authorInformation = authorInformation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getAuthorInformation() {
        return authorInformation;
    }

    public void setAuthorInformation(String authorInformation) {
        this.authorInformation = authorInformation;
    }
}
