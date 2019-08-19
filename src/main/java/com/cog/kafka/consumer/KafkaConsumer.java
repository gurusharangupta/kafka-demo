package com.cog.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;

import com.cog.kafka.model.Greetings;

public class KafkaConsumer {

	
	@KafkaListener(topics = "${kafka.topic.name}", groupId = "${kafka.consumer.group.id}", containerFactory = "kafkaListenerContainerFactory")
	public void listen(Greetings message) {
	    System.out.println("Received Messasge in group foo: " + message.toString());
	}
	
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
