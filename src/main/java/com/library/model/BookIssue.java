package com.library.model;

import java.util.Date;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.Getter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BookIssue{
	    private int id;
	    private int bookId;
	    private int userId;
	    private Date issueDate;
	    private Date returnDate;

	    // Getters and Setters
	    
	}