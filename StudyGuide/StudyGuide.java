/**
 * This class is a "Study Guide" program in built using Java to learn Java.
 * 
 * Continually expand functionality throughout the quarter.
 * 
 */
public class StudyGuide {
    
    // instance variables (aka: member variables or fields)
    // -------------------------------------------------------

    // This stores the user's points.
    private double points;

    // This stores the number of questions
    private double countOfQuestions;

    /**
     * class constructor (name must match class name)
     * 
     * we initialize fields in the constructor
     */
    public StudyGuide() {

        // initialize points to 0.
        points = 0;

        // initialize number of questions (this should be dynamic).
        countOfQuestions = 2;

    }
    
    /**
     * Application method (entry point for the our program).
     * 
     * @param args (Optional)
     */
    public static void main(String[] args) {
        
        System.out.print("What language are we studying: ");

        String correctAnswer = "java";
        String getAnswer = System.console().readLine().toLowerCase();

        StudyGuide studyGuide = new StudyGuide();

        if (getAnswer.equals(correctAnswer)) {
            System.out.println("Correct!");
            studyGuide.incrementPoints();
        } else {
            System.out.println("Wrong!");
        }

        double score = studyGuide.scorePoints();
        System.out.println("You scored: " + Math.round(score) + "%");

        studyGuide.questionTwo();

    }

    /**
     * Question Two and the Application Method are currently doing the same thing. Will need to figure out how to created a reuseable method or class to handle questions.  This should be easy in the coming days or weeks... or maybe even after a session of "Super Mario World!"
     */
    public void questionTwo() {
        System.out.println("Question #2:");
        System.out.println(
            "An __________ __________ is a memory \n" +
            "location where the value of an object's \n" +
            "property is stored."
        );

        String correctAnswer = "instance variable";
        String getAnswer = System.console().readLine().toLowerCase();

        if (getAnswer.equals(correctAnswer)) {
            System.out.println("Correct!");
            incrementPoints();
        } else {
            System.out.println("Wrong!");
        }

        double score = scorePoints();
        System.out.println("You scored: " + Math.round(score) + "%");
        
    }

    /**
     * Increment points by 1.
     */
    public void incrementPoints() {
        points++;
    }
    
    /**
     * Calculates the user's score.
     * 
     * @return The user's score as a percent.     */
    public double scorePoints() {
        return (points / countOfQuestions) * 100;
    }

}