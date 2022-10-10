package com.knf.dev.request;


import com.knf.dev.models.News;
import com.knf.dev.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;
    @Service
    public class NewsService {
        @Autowired
        private  final NewsRepository repository;

        public NewsService(NewsRepository repository) {
            this.repository = repository;
        }
        public void addNews(News data)
        {
            repository.save(data);
        }

        public News newsbyid(long Id)
        {

            return repository.findById(Id).get();
        }
        public void  deletebyid(long id)
        {
            repository.deleteById(id);
        }
        public News updatebyid(long id,News updatebyid)
        {
            updatebyid.setId(id);
            return repository.save(updatebyid);

        }

        public List<News> getNewsList() {
            return repository.findAll();
        }
    }


