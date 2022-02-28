package com.example.embedsocial_zadaca.service;


import com.example.embedsocial_zadaca.model.Review;

import java.util.List;

public interface ReviewService {

    List<Review> findAll();
    List<Review> sortAndFilter(String rating, int min_rating, String date, String text);
}
