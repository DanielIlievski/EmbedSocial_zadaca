package com.example.embedsocial_zadaca.repository;

import com.example.embedsocial_zadaca.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

    //Text = Yes
    //Rating = Highest First
    //Date = Oldest First
    //Minimum rating = min_rating
    @Query("SELECT r FROM Review r WHERE r.rating >= :min_rating ORDER BY r.isThereText DESC, r.rating DESC, r.reviewCreatedOnDate ASC")
    List<Review> findAll(int min_rating);


}
