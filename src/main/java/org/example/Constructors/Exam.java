package org.example.Constructors;

public class Exam {
    String id;
    int score;
    ReattemptExam reattemptExam;

    public Exam(){
        id = "12";
        score = 10;
        this.reattemptExam = new ReattemptExam();
    }

    public Exam(String id, int score) {
        this.id = id;
        this.score = score;
        this.reattemptExam = new ReattemptExam();
    }
    public Exam(Exam e){
        this.id = e.id;
        this.score = e.score;
        this.reattemptExam = new ReattemptExam(e.reattemptExam);
    }

}
