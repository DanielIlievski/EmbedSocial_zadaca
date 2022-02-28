package com.example.embedsocial_zadaca.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "review")
public class Review {

    @Id
    private Long id;

    private String reviewId;

    private String reviewFullText;

    private String reviewText;

    //Dopolnitelna promenliva koja kje pokazuva dali ima text ili ne za prioretiziranje koga ima a koga nema text
    private boolean isThereText;

    private int numLikes;

    private int numComments;

    private int numShares;

    private int rating;

    private String reviewCreatedOn;

    private String reviewCreatedOnDate;

    private String reviewCreatedOnTime;

    private String reviewerId;

    private String reviewerUrl;

    private String reviewerName;

    private String reviewerEmail;

    private String sourceType;

    private boolean isVerified;

    private String source;

    private String sourceName;

    private String sourceId;

    @ManyToMany
    private List<Tag> tags;

    private String href;

    private String logoHref;

    @ManyToMany
    private List<Photo> photos;


}
