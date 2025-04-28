package at.spengergasse;

import at.spengergasse.entities.Question;

public class Start {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        boolean show = true;

        while(show){
            show = Question.QuestionsAndAnswers();
        }

    }
}
