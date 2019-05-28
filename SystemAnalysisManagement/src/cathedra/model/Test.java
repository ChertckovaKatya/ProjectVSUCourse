package cathedra.model;


public class Test {
     private String question;
     private Integer type_answer;
     private String[] answers;
     private Integer quantity_answer;

     private Test(){
     }

    public Test(String question, Integer type_answer, String[] answers, Integer quantity_answer) {
        this.question = question;
        this.type_answer = type_answer;
        this.answers = answers;
        this.quantity_answer = quantity_answer;
    }

    public String getQuestion() {
        return question;
    }

    public Integer getType_answer() {
        return type_answer;
    }

    public String[] getAnswers() {
        return answers;
    }
    public String getgetAnswers(int i){
         return answers[i];
    }

    public Integer getQuantity_answer() {
        return quantity_answer;
    }
}
