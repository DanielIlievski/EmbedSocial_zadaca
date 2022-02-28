package com.example.embedsocial_zadaca.service.impl;

import com.example.embedsocial_zadaca.model.Review;
import com.example.embedsocial_zadaca.repository.ReviewRepository;
import com.example.embedsocial_zadaca.service.ReviewService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }


    @Override
    public List<Review> findAll() {
        return this.reviewRepository.findAll();
    }

    @Override
    public List<Review> sortAndFilter(String rating, int min_rating, String date, String text) {
        if(text.contains("Yes")){
            if(rating.contains("Highest")){
                if(date.contains("Oldest")){
                    return this.reviewRepository.findAll(min_rating);
                }
                else if(date.contains("Newest")){
                    return Collections.emptyList();
                }
            }
            else if(rating.contains("Lowest")){
                if(date.contains("Oldest")){
                    return Collections.emptyList();
                }
                else if(date.contains("Newest")){
                    return Collections.emptyList();
                }
            }
        }
        else if(text.contains("No")){
            if(rating.contains("Highest")){
                if(date.contains("Oldest")){
                    return Collections.emptyList();
                }
                else if(date.contains("Newest")){
                    return Collections.emptyList();
                }
            }
            else if(rating.contains("Lowest")){
                if(date.contains("Oldest")){
                    return Collections.emptyList();
                }
                else if(date.contains("Newest")){
                    return Collections.emptyList();
                }
            }
        }
        return Collections.emptyList();
    }
}
