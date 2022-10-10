package com.knf.dev.models;

import javax.persistence.*;


import javax.persistence.*;

@Entity
@Table(name="film_info")

public class Film {


    @Id
    @SequenceGenerator(name="film_sequence",
            sequenceName = "film_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "film_sequence"
    )
    private long id;
    private String film_details;
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public Film(String film_details, long id,String image) {
        this.film_details = film_details;
        this.id = id;
        this.image=image;
    }

    public String getFilm_details() {
        return film_details;
    }

    public void setfilm_details(String film_details) {
        this.film_details = film_details;
    }

    public Film() {

    }







    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



}
