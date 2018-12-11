
package fr.ubordeaux.ao.infrastructure.inmemory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.ubordeaux.ao.domain.exception.QuestionExamException;
import fr.ubordeaux.ao.domain.model.Question;
import fr.ubordeaux.ao.domain.model.QuestionRepository;
import fr.ubordeaux.ao.domain.model.Questionnary;

public class QuestionRepositoryInMemory implements QuestionRepository {
    private List<Question> questionList;
    private int questionnaryId;

    public QuestionRepositoryInMemory() {
        this.questionList = new ArrayList<Question>();
        questionnaryId = 0;
    }

    public void addQuestion(Question question) {
        //this.addQuestion(question);
        questionList.add(question);
    }

    public Questionnary createRandomQuestionnary(int numberOfQuestion) {
    	if(numberOfQuestion<5) throw new QuestionExamException("should not create questionnary with too few question");
        List<Question> sample = new ArrayList<Question>();
        List<Question> questionnayQuestionList = new ArrayList<Question>();
        sample.addAll(questionList);
        Collections.shuffle(sample);
        for (int i = 0 ; i < numberOfQuestion ; i++) {
            questionnayQuestionList.add(sample.get(i));
        }
        String id = "#"+questionnaryId++;
        return new Questionnary(id, questionList);
    }

}