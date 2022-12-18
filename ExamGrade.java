public class ExamCredit {

    public static void main(String[] args) {

        // equivalence partitioning

            // valid equivalence partitions
            examCredit(12);
            examCredit(55);
            examCredit(73);
            examCredit(84);
            examCredit(97);

            //invalid equivalence partitions
            examCredit(-2);
            examCredit(102);
            //other options with black box technique: letters, special characters
            
        //2 points boundary value analyses
            examCredit(-1);
            examCredit(0);
            examCredit(54);

            examCredit(55);
            examCredit(64);

            examCredit(65);
            examCredit(74);

            examCredit(75);
            examCredit(84);

            examCredit(85);
            examCredit(100);

            examCredit(101);

    }

    public static void examCredit(int score) {

        if (score >= 0 && score < 55) {
            System.out.println("Your final score: " + score + ". You failed the exam.");
        } else if ( score >= 55 && score < 65) {
            System.out.println("Your final score: " + score + ". You passed the exam. You credit is 2.");
        } else if (score >= 65 && score < 75) {
            System.out.println("Your final score: " + score + ". You passed the exam. You credit is 3.");
        } else if (score >= 75 && score < 85) {
            System.out.println("Your final score: " + score + ". You passed the exam. You credit is 4.");
        } else if (score >= 85 && score <= 100) {
            System.out.println("Your final score: " + score + ". You passed the exam. You credit is 5.");
        } else {
            System.out.println("Invalid value");
        }
    }   
}