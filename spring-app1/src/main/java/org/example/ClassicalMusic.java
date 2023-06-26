package org.example;
 
public class ClassicalMusic implements Music {

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }
  
    // there (doMyInit and doMyDestroy) can be any access modifier and
    // methods should not take any values
    public void doMyInit() {
        System.out.println("Doing my initialization!");
    }

    public void doMyDestroy() {
        System.out.println("Doing my distraction!");
    }
    
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }


}
