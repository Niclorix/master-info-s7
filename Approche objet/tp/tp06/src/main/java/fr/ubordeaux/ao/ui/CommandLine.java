package fr.ubordeaux.ao.ui;

import java.util.*;
import java.io.IOException;
import fr.ubordeaux.ao.domain.exception.QuestionExamException;


public class CommandLine {
    public static void main(String[] args) {
        try {
            TextualMenu tm = new TextualMenu(System.in, System.out);
			tm.handleUserInstructions();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
    }    
}