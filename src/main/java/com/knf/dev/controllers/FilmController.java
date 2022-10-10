package com.knf.dev.controllers;




import com.knf.dev.models.Film;
import com.knf.dev.request.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("api/auth")
public class FilmController {
    @Autowired
    private FilmService service;

    public FilmController(FilmService service) {
        this.service = service;
    }
    @GetMapping("/film_details")
    public List<Film> List()
    {
        return service.getFilmList();
    }
    @GetMapping("film/{id}")
    public Film filmbyid(@PathVariable long id)
    {
        return service.filmbyid(id);

    }

    @GetMapping("deletefilmId/{id}")
    public void deletebyId(@PathVariable("id") long id) {

        service.deletebyid(id);
    }
    @PostMapping("/insert_film")
    public void insert(@RequestBody Film data)
    {

        service.addFilm(data);
    }
    @PutMapping("updatefilm/{id}")
    public Film updatebyId(@PathVariable Long id,@RequestBody Film entry)

    {
        return service.updatebyid(id,entry);
    }



}
