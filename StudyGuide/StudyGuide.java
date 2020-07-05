/**
 * This class is a "Study Guide" program in built using Java to learn Java
 * 
 * GOAL: continually expand functionality throughout the quarter
 * 
 */
public class StudyGuide {
    
    public static void main(String[] args) {
        
        System.out.print("What language are we studying: ");

        String correctAnswer = "java";
        String getAnswer = System.console().readLine().toLowerCase();

        double points = 0;
        double countOfQuestions = 1;

        if (getAnswer.equals(correctAnswer)) {
            System.out.println("Correct!");
            points++;
        } else {
            System.out.println("Wrong!");
        }

        double score = (points / countOfQuestions) * 100;
        System.out.println("You scored: " + Math.round(score) + "%");

    }

}