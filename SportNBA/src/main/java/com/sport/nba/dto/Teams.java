package com.sport.nba.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Teams {
	private int id;
	private String conference;
	private String division;
	private String city;
	private String name;
	private String full_name;
	private String abbreviation;
}
