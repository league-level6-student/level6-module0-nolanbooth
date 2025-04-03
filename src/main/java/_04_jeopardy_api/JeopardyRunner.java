package _04_jeopardy_api;

import javax.swing.*;

public class JeopardyRunner {

    public static void main(String[] args) {

        JeopardyApi jeopardyApi = new JeopardyApi();

        //1. Create a score variable
        int score = 0;
        
        //2. Add a for loop where:
        //i starts at 100,
        //continues while i <= 1000
        //increments by 100
        for(int i = 100; i <= 1000; i++) {
        	if(i == 700 || i == 900) {
        		continue;
        	}else {
        	//	jeopardyApi.getClue(i);
        		
        	
        
            //3. If i == 700 or i == 900, continue;
            //there are no questions for these values

            //4. Call the getClue() method with i yes
        	
            //5. Save the question in a String variable 
        		String question = jeopardyApi.getClue(i).getClue();
            //6. Save the answer in a String variable

            //7. Save the title in a String variable
            //note that this is part of the Category object
        		String title = jeopardyApi.getClue(i).getCategory(); // something wrong here
        		
            //8. Use a JOptionPane to display the question.
            //You can set the title of the JOptionPane to the question title.
        		String answer = JOptionPane.showInputDialog(null, question, title, JOptionPane.INFORMATION_MESSAGE);
        	
        		if(answer.equalsIgnoreCase(jeopardyApi.getClue(i).getResponse())) {
        	    	JOptionPane.showMessageDialog(null, "Correct!");
        			score+=i;
        	    }else {
        	    	JOptionPane.showMessageDialog(null, "Incorrect.");
        	    }
        	}
            //9. If they got the question correct, add the value of that question to their score
    
        
        }
        //10. Tell the user their final score
        JOptionPane.showMessageDialog(null, "final score = " + score);
    }

}
