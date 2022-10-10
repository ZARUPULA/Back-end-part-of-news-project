package com.knf.dev.models;

import javax.persistence.*;


    import javax.persistence.*;

    @Entity
    @Table(name="news_info")

    public class News {


        @Id
        @SequenceGenerator(name="news_sequence",
                sequenceName = "news_sequence",
                allocationSize = 1
        )
        @GeneratedValue(
                strategy = GenerationType.IDENTITY,
                generator = "news_sequence"
        )
        private long id;
        private String news_details;
        private String image;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
        public News(String news_details, long id,String image) {
            this.news_details = news_details;
            this.id = id;
            this.image=image;
        }

        public String getNews_details() {
            return news_details;
        }

        public void setNews_details(String news_details) {
            this.news_details = news_details;
        }

        public News() {

        }







        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }



    }



