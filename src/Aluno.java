import java.util.Scanner;

public class Aluno {
    private String name;

    public Aluno(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String makeQuestion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Faça a pergunta: ");
        final String question = sc.nextLine();
        return question;
    }
}
