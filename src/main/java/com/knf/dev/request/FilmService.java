package com.knf.dev.request;

import com.knf.dev.models.Film;

import com.knf.dev.repository.FilmRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;





@Service
public class FilmService {
    @Autowired
    private  final FilmRepository repository;

    public FilmService(FilmRepository repository) {
        this.repository = repository;
    }
    public void addFilm(Film data)
    {
        repository.save(data);
    }

    public Film filmbyid(long Id)
    {

        return repository.findById(Id).get();
    }
    public void  deletebyid(long id)
    {
        repository.deleteById(id);
    }
    public Film updatebyid(long id, Film updatebyid)
    {
        updatebyid.setId(id);
        return repository.save(updatebyid);

    }

    public List<Film> getFilmList() {
        return repository.findAll();
    }

}
