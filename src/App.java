public class App {
    public static void main(String[] args) throws Exception {
        Aluno masih = new Aluno("Masih");
        Professor diego = new Professor("Diego");

        String question = masih.makeQuestion();

        String answer = diego.answerQuestion(question);

        System.out.println();
        System.out.println(question);
        System.out.println(answer);
    }
}
