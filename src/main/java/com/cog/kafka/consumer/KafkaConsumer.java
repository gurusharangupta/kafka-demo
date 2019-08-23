package com.cog.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	
	@KafkaListener(topics = "${kafka.topic.name}", groupId = "${kafka.consumer.group.id}", containerFactory = "kafkaListenerContainerFactory")
	public void listen(String message) {
	    System.out.println("Received String Messasge in group foo: " + message.toString());
	}
	
	/*@KafkaListener(topics = "${kafka.topic.name}", groupId = "${kafka.consumer.group.id}", containerFactory = "kafkaListenerContainerFactory")
	public void listen(Greetings message) {
	    System.out.println("Received Messasge in group foo: " + message.toString());
	}*/
	
	/*@KafkaListener(topics = "topicName")
	public void listenWithHeaders(
	  @Payload String message, 
	  @Header("id") int partition) {
	      System.out.println(
	        "Received Message: " + message
	        + "from partition: " + partition);
	}*/

	
/*	@KafkaListener(
			  topicPartitions = @TopicPartition(topic = "topicName",
			  partitionOffsets = {
			    @PartitionOffset(partition = "0", initialOffset = "0"), 
			    @PartitionOffset(partition = "3", initialOffset = "0")
			}))
			public void listenToParition(
			  @Payload String message, 
			  @Header("id") int partition) {
			      System.out.println(
			        "Received Messasge: " + message
			        + "from partition: " + partition);
			}
	*/
}
