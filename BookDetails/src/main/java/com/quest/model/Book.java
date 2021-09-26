package com.quest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Book {
	
	@Id
	@GeneratedValue
	
private int Book_Id;
	
	private String Book_Name;
	
    private Boolean Book_Status;
	
	
	

}
