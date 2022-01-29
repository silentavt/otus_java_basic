import java.util.Scanner;

public class HomeWork03 {
    private static final int QUESTIONS_INDEX = 0;
    private static final int ANSWERS_INDEX = 1;
    private static final int CORRECT_ANSWER_INDEX = 2;
    private static final String[][][] testSourceData = {
            {
                    {"Сколько будет 2 * 2?"},
                    {"2", "22", "4", "44"},
                    {"3"}
            },
            {
                    {"Какая температура таяния льда?"},
                    {"10 C", "0 C", "567 C", "4 C", "-1 C"},
                    {"2"}
            },
            {
                    {"Есть ли жизнь на Марсе?"},
                    {"Да", "Нет", "Науке это неизвестно"},
                    {"3"}
            }
    };

    public static void main(String[] args) {
        int correctAnswersCount = 0;
        int incorrectAnswersCount = 0;
        Scanner scanner = new Scanner(System.in);
        String selectedAnswer;

        for (String[][] currentDataSet : testSourceData) {
            for (String question : currentDataSet[QUESTIONS_INDEX]) {
                System.out.println(question);
            }

            for (int i = 0; i < currentDataSet[ANSWERS_INDEX].length; i++) {
                System.out.println((i + 1) + ". " + currentDataSet[ANSWERS_INDEX][i]);
            }

            System.out.println("Введите свой вариант ответа: ");
            selectedAnswer = scanner.next().trim();
            if (selectedAnswer.equals(currentDataSet[CORRECT_ANSWER_INDEX][0])) {
                System.out.println("Верно");
                correctAnswersCount++;
            } else {
                System.out.println("Неверно");
                incorrectAnswersCount++;
            }
        }

        System.out.println("Результат: ");
        System.out.println("Верных ответов: " + correctAnswersCount);
        System.out.println("Неверных ответов: " + incorrectAnswersCount);
    }
}
