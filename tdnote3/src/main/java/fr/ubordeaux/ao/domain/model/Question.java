package fr.ubordeaux.ao.domain.model;

import fr.ubordeaux.ao.domain.exception.QuestionExamException;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

public class Question {
    private String question;
    private String description;
    private List<String> candidateAnswerList;
    private List<String> trueAnswerList;

    public Question(String question, String description, List<String> candidateAnswerList, List<String> trueAnswerList) {
        this.listQuestion(question);
        this.listDescription(description);
        this.listCandidateAnswerList(candidateAnswerList);
        this.listTrueAnswerList(trueAnswerList);
    }

    public String getQuestion() {
        return this.question;
    }

    public String getDescription() {
        return this.description;
    }

    public List<String> getCandidateAnswerList() {
    	List<String> tmp = new ArrayList<String>(this.candidateAnswerList);
        return tmp;
    }

    public List<String> getTrueAnswerList() {
    	List<String> tmp = new ArrayList<String>(this.trueAnswerList);
        return tmp;
    }

    private void listQuestion(String question) {
        if (question == null) throw new QuestionExamException("cannot create question with null question");
        this.question = question;
    }

    private void listDescription(String description) {
        if (description == null) throw new QuestionExamException("cannot create question with null description");
        this.description = description;
    }

    private void listCandidateAnswerList(List<String> candidateAnswerList) {
        if (candidateAnswerList == null) throw new QuestionExamException("cannot create question with null candidateAnswerList");
        this.candidateAnswerList = candidateAnswerList;
    }

    private void listTrueAnswerList(List<String> trueAnswerList) {
        if (trueAnswerList == null) throw new QuestionExamException("cannot create question with null trueAnswerList");
        this.trueAnswerList = trueAnswerList;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Question) {
            Question otherQuestion = (Question)other;
            boolean sameQuestion = this.getQuestion().compareTo(otherQuestion.getQuestion())==0;
            boolean sameDescription = this.getDescription().compareTo(otherQuestion.getQuestion())==0;
            boolean sameCandidateAnswerList = true;
            boolean sameTrueAnswerList = true;

            boolean equals = sameQuestion && sameDescription && sameCandidateAnswerList && sameTrueAnswerList;
			return equals;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuestion()+getDescription());
    }

    @Override
    public String toString() {
    	StringBuilder str = new StringBuilder();
    	str.append("Question :");
    	str.append(question);
    	str.append("\nDescription");
    	str.append(description);
    	return str.toString();
    }
}
