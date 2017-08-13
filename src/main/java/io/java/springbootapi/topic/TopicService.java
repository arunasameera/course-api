package io.java.springbootapi.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic("Spring",
			"Spring Framwork", "Spring Framwork Description"), new Topic(
			"Java", "Core Java", "Spring Framwork Description"), new Topic(
			"javascript", "javascript", "javascript Framwork Description")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {

		return topics.get(1);
		
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
		for(int i=0;i<topics.size();i++){
			Topic t=topics.get(i);
			if(t.getId().equals(id)){
				topics.set(i, topic);
			}
			
		}
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topics.remove(1);
		System.out.println("deleteTopic deleteTopic deleteTopic deleteTopic");
	}

}
