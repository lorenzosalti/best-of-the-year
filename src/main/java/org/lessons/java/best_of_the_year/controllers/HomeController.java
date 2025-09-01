package org.lessons.java.best_of_the_year.controllers;

import java.util.ArrayList;
import java.util.List;

import org.lessons.java.best_of_the_year.classes.Movie;
import org.lessons.java.best_of_the_year.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
public class HomeController {

  @GetMapping("/")
  public String homePage(Model model, String name) {
    name = "Lorenzo S.";
    model.addAttribute("name", name);
    return "home";
  };

  @GetMapping("/movies")
  public String moviesPage(Model model) {
    String movieTitles = "";

    for (Movie movie : getBestMovies()) {
      movieTitles += movie.getTitle() + ", ";
    }

    model.addAttribute("name", "Lorenzo S.");
    model.addAttribute("title", "Movies");
    model.addAttribute("list", movieTitles);

    return "stringList";
  }

  @GetMapping("/songs")
  public String songsPage(Model model) {
    String songTitles = "";

    for (Song song : getBestSongs()) {
      songTitles += song.getTitle() + ", ";
    }

    model.addAttribute("name", "Lorenzo S.");
    model.addAttribute("title", "Songs");
    model.addAttribute("list", songTitles);

    return "stringList";
  }

  private List<Movie> getBestMovies() {
    List<Movie> movieList = new ArrayList<Movie>();
    movieList.add(new Movie(1, "The Alto Knights"));
    movieList.add(new Movie(2, "Black Bag"));
    movieList.add(new Movie(3, "Bring her back"));
    movieList.add(new Movie(4, "Sinners"));
    movieList.add(new Movie(5, "A normal family"));
    return movieList;
  };

  private List<Song> getBestSongs() {
    List<Song> songList = new ArrayList<Song>();
    songList.add(new Song(1, "Ordinary"));
    songList.add(new Song(2, "Anxiety"));
    songList.add(new Song(3, "Bad Dreams"));
    songList.add(new Song(4, "Azizam"));
    songList.add(new Song(5, "Die With A Smile"));
    return songList;
  };

}
