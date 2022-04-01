package com.example.ddd;

import com.example.ddd.annotations.Aggregate;

@Aggregate(id = "isbn")
public class broadcast {
	private final ISBN isbn;
	private BroadcastName broadcastName;
	private Author author;
	private PublishingHouse publishingHouse;
	private PublishYear publishYear;
	private Language language;
	private Category category;
	private Topic topic;
	private UseTarget useTarget;
	
	
}
