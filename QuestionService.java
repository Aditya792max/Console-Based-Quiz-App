public class QuestionService {
    Question[] questions = new Question[5];
    
    public void SetQuestions(){
        this.questions[0] = new Question(1, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris");
        this.questions[1] = new Question(2, "What is the largest planet in our solar system?", "Earth", "Jupiter", "Mars", "Saturn", "Jupiter");
        this.questions[2] = new Question(3, "What is the chemical symbol for gold?", "Au", "Ag", "Fe", "Pb", "Au");
        this.questions[3] = new Question(4, "What is the smallest prime number?", "0", "1", "2", "3", "2");
        this.questions[4] = new Question(5, "What is the largest ocean on Earth?", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean", "Pacific Ocean");
    }
    public void displayQuestions(Question[] questions){
        for(int i=0; i<questions.length; i++){
            System.out.println("Question " + (i+1) + ": " + questions[i].getQuestion());
            System.out.println("1. " + questions[i].getOpt1());
            System.out.println("2. " + questions[i].getOpt2());
            System.out.println("3. " + questions[i].getOpt3());
            System.out.println("4. " + questions[i].getOpt4());
            System.out.println();
        }
    }
    public void displayOnlyQuestion(Question[] questions){
        for(int i=0; i<questions.length; i++){
            System.out.println("Question " + (i+1) + ": " + questions[i].getQuestion());
        }
    }
    public String getQuestionById(Question[] questions, int id){
        System.out.println("Question " + id + ": " + questions[id].getQuestion());
        System.out.println("1. " + questions[id].getOpt1());
        System.out.println("2. " + questions[id].getOpt2());
        System.out.println("3. " + questions[id].getOpt3());
        System.out.println("4. " + questions[id].getOpt4());
        return questions[id].getAns();
    }
    

}