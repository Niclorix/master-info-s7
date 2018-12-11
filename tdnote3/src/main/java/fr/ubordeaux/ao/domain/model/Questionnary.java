package fr.ubordeaux.ao.domain.model;

import fr.ubordeaux.ao.domain.exception.QuestionExamException;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.List;

public class Questionnary {
    private String id;
    private List<Question> questionList;
    private Map<Question,String> answerMap;
    private int score = 0;

    public Questionnary(String id, List<Question> questionList) {
        this.listId(id);
        this.listQuestionList(questionList);
        answerMap = new HashMap<Question,String>();
    }

    public String getId() {
        return id;
    }

    public List<Question> getQuestionList() {
    	List<Question> tmp = new ArrayList<Question>(this.questionList);
        return tmp;
    }

    public int getScore() {
    	//TODO need to calculate the score
        return this.score;
    }

    public void answer(Question question, String answer) {
        this.answerMap.put(question, answer);
        //if question = answer
        //increment score
        //else decrement score
    }


    private void listId(String id) {
        if (id == null) throw new QuestionExamException("cannot create questionnary with null id");
        this.id = id;
    }

    private void listQuestionList(List<Question> questionList) {
        if (questionList == null) throw new QuestionExamException("cannot create questionnay with null question");
        this.questionList = questionList;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Questionnary) {
            Questionnary otherQuestionnay = (Questionnary) other;
            boolean sameId = this.getId().compareTo(otherQuestionnay.getId())==0;
            
            boolean equals = sameId;
			return equals;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return getId();
    }
}
