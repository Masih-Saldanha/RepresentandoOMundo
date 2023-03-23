import java.util.Scanner;

public class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public String answerQuestion(String question) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a resposta para a pergunta: " + question);
        final String answer = sc.nextLine();
        return answer;
    }
}
