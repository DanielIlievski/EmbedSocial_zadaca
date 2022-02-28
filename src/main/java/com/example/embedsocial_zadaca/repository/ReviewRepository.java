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
    List<Review> findAll1(int min_rating);

    //Text = Yes
    //Rating = Highest First
    //Date = Newest First
    //Minimum rating = min_rating
    @Query("SELECT r FROM Review r WHERE r.rating >= :min_rating ORDER BY r.isThereText DESC, r.rating DESC, r.reviewCreatedOnDate DESC")
    List<Review> findAll2(int min_rating);

    //Text = Yes
    //Rating = Lowest First
    //Date = Oldest First
    //Minimum rating = min_rating
    @Query("SELECT r FROM Review r WHERE r.rating >= :min_rating ORDER BY r.isThereText DESC, r.rating ASC, r.reviewCreatedOnDate ASC")
    List<Review> findAll3(int min_rating);

    //Text = Yes
    //Rating = Lowest First
    //Date = Newest First
    //Minimum rating = min_rating
    @Query("SELECT r FROM Review r WHERE r.rating >= :min_rating ORDER BY r.isThereText DESC, r.rating ASC, r.reviewCreatedOnDate DESC")
    List<Review> findAll4(int min_rating);

    //Text = No
    //Rating = Highest First
    //Date = Oldest First
    //Minimum rating = min_rating
    @Query("SELECT r FROM Review r WHERE r.rating >= :min_rating ORDER BY r.rating DESC, r.reviewCreatedOnDate ASC")
    List<Review> findAll5(int min_rating);

    //Text = No
    //Rating = Highest First
    //Date = Newest First
    //Minimum rating = min_rating
    @Query("SELECT r FROM Review r WHERE r.rating >= :min_rating ORDER BY r.rating DESC, r.reviewCreatedOnDate DESC")
    List<Review> findAll6(int min_rating);

    //Text = No
    //Rating = Lowest First
    //Date = Oldest First
    //Minimum rating = min_rating
    @Query("SELECT r FROM Review r WHERE r.rating >= :min_rating ORDER BY r.rating ASC, r.reviewCreatedOnDate ASC")
    List<Review> findAll7(int min_rating);

    //Text = No
    //Rating = Lowest First
    //Date = Newest First
    //Minimum rating = min_rating
    @Query("SELECT r FROM Review r WHERE r.rating >= :min_rating ORDER BY r.rating ASC, r.reviewCreatedOnDate DESC")
    List<Review> findAll8(int min_rating);

}
