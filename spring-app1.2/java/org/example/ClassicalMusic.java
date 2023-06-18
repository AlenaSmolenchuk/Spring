package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

// creating bean with annotation
@Component("classicalMusic")
@Scope("prototype")
public class ClassicalMusic implements Music {

   /* List<String> tracks = new ArrayList<>();
    {
        tracks.add("Hungarian Rhapsody");
        tracks.add("Night on Bald Mountain");
        tracks.add("Symphony no. 5 in C Minor, op. 67");
    } */

    @PostConstruct
    public void doMyInit() {
        System.out.println("Initialisation!");
    }
    @PreDestroy
    public void doMyDistract(){
        System.out.println("Destruction!");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
  /*  public List<String> getSong() {
        return tracks;
    } */
}
