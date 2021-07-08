package com.example.AuthorApp.Service;

import com.example.AuthorApp.Model.Author;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AuthorService {
    public List<Author> getAuthorList(){
        List<Author> authorList = new ArrayList<>();

        Author firstAuthor = new Author(1,"Parth","https://media.istockphoto.com/photos/writing-in-notebook-closeup-picture-id1080259016?k=6&m=1080259016&s=612x612&w=0&h=GnLvumJG3MmjJTVvown3E2ImFxWOj93nrrat1aF-UCI="
                ,"I am India's Best author with 20 books");
        Author secondAuthor = new Author(2,"Ripal","https://i2.wp.com/feminisminindia.com/wp-content/uploads/2018/01/dd4921ac-34c5-11e7-9993-2f2d999294f7.jpg?resize=960%2C720"
                ,"I am first India's Female author with 10 books");
        authorList.add(firstAuthor);
        authorList.add(secondAuthor);
        return authorList;
    }
    public List<Author> getAuthorList(String str){
        List<Author> authorList = new ArrayList<>();
        List<Author> finalList = new ArrayList<>();
        Author firstAuthor = new Author(1,"Parth","https://media.istockphoto.com/photos/writing-in-notebook-closeup-picture-id1080259016?k=6&m=1080259016&s=612x612&w=0&h=GnLvumJG3MmjJTVvown3E2ImFxWOj93nrrat1aF-UCI="
                ,"I am India's Best author with 20 books");
        Author secondAuthor = new Author(2,"Ripal","https://i2.wp.com/feminisminindia.com/wp-content/uploads/2018/01/dd4921ac-34c5-11e7-9993-2f2d999294f7.jpg?resize=960%2C720"
                ,"I am first India's Female author with 10 books");
        authorList.add(firstAuthor);
        authorList.add(secondAuthor);

        for(Author i :authorList){
            if(i.getName().equals(str)){
                finalList.add(i);
            }
        }

        if(str.equals(""))
            return authorList;


        return finalList;
    }



}
