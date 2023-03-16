package com.deepti.movies;

import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "movies")
@Data // lombok annotation to generate getters, setters and toString methods
@AllArgsConstructor // lombok annotation to generate constructor
@NoArgsConstructor 
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> backdrops;
    private List<String> genres;
    @DocumentReference // this annotation tells spring data to store the id of the review in the movie document
    private List<Review> reviewIds;
}

// This is a model (mvc architecture)