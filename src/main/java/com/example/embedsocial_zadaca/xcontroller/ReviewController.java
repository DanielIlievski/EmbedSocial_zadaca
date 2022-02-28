package com.example.embedsocial_zadaca.xcontroller;

import com.example.embedsocial_zadaca.service.ReviewService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    public String getFilterPage(){
        return "filterReviews";
    }

    @GetMapping("/all")
    public String getReviewsPage(@RequestParam String rating,
                                 @RequestParam int min_rating,
                                 @RequestParam String date,
                                 @RequestParam String text,
                                 Model model){
        model.addAttribute("reviews", this.reviewService.sortAndFilter(rating, min_rating, date, text));
        return "allReviews";
    }
}
