package com.practice.main;

import com.practice.service.SpeakerService;
import com.practice.service.SpeakerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		SpeakerService speakerService = new SpeakerServiceImpl(); // Hard coded to SpeakerServiceImpl() object 
		System.out.println(speakerService.findAll().get(0).getFirstName() + " " + speakerService.findAll().get(0).getLastName());
	}
}
