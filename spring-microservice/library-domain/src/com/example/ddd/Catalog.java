package com.example.ddd;

import com.example.ddd.annotations.Aggregate;

@Aggregate(id="isbn")
public class Catalog {
	
	private Cover cover;
	private ISBN isbn;
	private Title title;
	private Author author;
	private NumberOfPages numberOfPages;
	private PublishDate publishDate;
	private PublishingHouse publishingHouse;
	private Language language;
	private Type type;             // like novel, poem, article
	private Topic topic;           // like  history, sience,
	private UseTarget useTarget;   // lesson or daily
	private Periodical periodical; // Limited or unlimeted
	
}
