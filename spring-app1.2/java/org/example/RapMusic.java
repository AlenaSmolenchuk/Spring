package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Chicago Freestyle";
    }
   /* List<String> tracks = new ArrayList<>();

    {
      tracks.add("Too Much");
      tracks.add("Chicago Freestyle");
      tracks.add("Tootsie Slide");
    }
    public List<String> getSong() {
        return tracks;
    }

    */
}
