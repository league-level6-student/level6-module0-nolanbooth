package _03_intro_to_authenticated_APIs;

import javax.swing.*;

public class NewsRunner {

    public static void main(String[] args) {
        NewsApi newsApi = new NewsApi();
        //newsApi.testRequest();
        String topic = JOptionPane.showInputDialog("Please enter a topic for a news story");
       // String story = newsApi.findStory(topic);
       newsApi.testRequest();
        
        //System.out.println(story);
    }

}
