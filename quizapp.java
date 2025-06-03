import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        String[] questions = {
            "1. What is the size of int in Java?\n(a) 2 bytes\n(b) 4 bytes\n(c) 8 bytes",
            "2. Which keyword is used to inherit a class in Java?\n(a) this\n(b) import\n(c) extends",
            "3. What does JVM stand for?\n(a) Java Virtual Machine\n(b) Java Variable Method\n(c) Just Very Mad"
        };

        char[] answers = {'b', 'c', 'a'};

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("🧠 Welcome to the Java Quiz!");
        System.out.println("----------------------------");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer (a/b/c): ");
            char userAnswer = scanner.next().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + answers[i] + "\n");
            }
        }

        System.out.println("🎉 Quiz completed! Your score: " + score + "/" + questions.length);
        scanner.close();
    }
}
