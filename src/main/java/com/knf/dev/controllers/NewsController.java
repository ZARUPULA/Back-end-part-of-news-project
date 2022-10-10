package com.knf.dev.controllers;




import com.knf.dev.models.News;
import com.knf.dev.request.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;

    @RestController
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping("api/auth")
    public class NewsController {
        @Autowired
        private NewsService service;

        public NewsController(NewsService service) {
            this.service = service;
        }
        @GetMapping("/news_details")
        public List<News> List()
        {
            return service.getNewsList();
        }
        @GetMapping("/{id}")
        public News newsbyid(@PathVariable long id)
        {
            return service.newsbyid(id);

        }

        @GetMapping("deleteId/{id}")
        public void deletebyId(@PathVariable("id") long id) {

            service.deletebyid(id);
        }
        @PostMapping("/insert_news")
        public void insert(@RequestBody News data)
        {

            service.addNews(data);
        }
        @PutMapping("update/{id}")
        public News updatebyId(@PathVariable Long id,@RequestBody News entry)

        {
            return service.updatebyid(id,entry);
        }



    }





