package QuizConsoleApplication;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];
    public QuestionService(){
        questions[0] = new Question(1, "size of int", "2", "4", "8", "1", "4");
        questions[1] = new Question(2, "size of double", "2", "4", "8", "1", "8");
        questions[2] = new Question(3, "size of char", "2", "4", "8", "1", "4");
        questions[3] = new Question(4, "size of long", "2", "4", "8", "1", "8");
        questions[4] = new Question(5, "size of boolean", "2", "4", "8", "1", "1");
    }
    public void playQuiz(){
        // System.out.println("in quesiton display");
        int ind = 0;
        for(Question q : questions){
            System.out.println("Question Number : "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1()+" "+q.getOpt2()+" "+q.getOpt3()+" "+q.getOpt4());
            Scanner scn = new Scanner(System.in);
            selection[ind++]=scn.nextLine();
            scn.close();
        }
        for(String s : selection){
            System.out.print(s+" ");
        }
    }
    public void printScore(){
        int score=0;
        for(int i=0; i<questions.length; i++){
            Question que = questions[i];

            String ans = que.getAnswer();
            String userAns = selection[i];

            if(ans.equals(userAns))score++;
        }
        System.out.println("Your Total Score is : "+score);
    }
}
