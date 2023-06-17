package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("rockMusic")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
  /*  List<String> tracks = new ArrayList<>();

    {
        tracks.add("Wind cries Mary");
        tracks.add("Numb");
        tracks.add("405");
    }
    public List<String> getSong() {
           return tracks;
    } */
}
