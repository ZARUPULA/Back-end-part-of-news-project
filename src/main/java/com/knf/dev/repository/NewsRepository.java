package com.knf.dev.repository;



        import com.knf.dev.models.News;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

        import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<News,Long>{
}
