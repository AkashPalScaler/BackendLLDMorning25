package org.example.Constructors;

public class ReattemptExam {
    String id;
    int score;

    public ReattemptExam(){

    }

    public ReattemptExam(ReattemptExam e){
        this.id = e.id;
        this.score = e.score;
    }
}
