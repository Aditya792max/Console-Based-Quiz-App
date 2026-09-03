import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuestionService qs = new QuestionService();
        qs.SetQuestions();
        Scores s = new Scores(0);
        for(int i=0;i<qs.questions.length;i++){
            String ans = qs.getQuestionById(qs.questions, i);
            String userAnswer = sc.nextLine();
            if(userAnswer.equals(ans)){
                s.score++;
            }
            s.printScore();
        }

    }
}