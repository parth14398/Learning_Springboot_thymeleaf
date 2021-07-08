package com.example.AuthorApp;

import com.example.AuthorApp.Model.inquiry;
import com.example.AuthorApp.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @Autowired
    private AuthorService authorService;
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("inquiry",new inquiry());
        return "index";
    }
    @GetMapping("/Author.html")
    public String Author(Model model){
        model.addAttribute("authors",authorService.getAuthorList());

        return "Author";
    }

    @PostMapping("/Author.html")
    public String searchAuthor(Model model , @ModelAttribute inquiry inquiry){

        model.addAttribute("authors",authorService.getAuthorList(inquiry.getSearchString()));

        return "Author";
    }
}
