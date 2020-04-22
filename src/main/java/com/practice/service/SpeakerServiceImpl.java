package com.practice.service;

import java.util.List;

import com.practice.model.Speaker;
import com.practice.repository.HibernateSpeakerRepositoryImpl;
import com.practice.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {

	private SpeakerRepository speakerRepository = new HibernateSpeakerRepositoryImpl(); 

	public List<Speaker> findAll() {
		
		return speakerRepository.finalAll();
	}
}
