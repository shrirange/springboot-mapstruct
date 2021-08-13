package com.example.mapstruct;

import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {
	
	@Autowired
	private SampleMapper sampleMapper;
	
	@Autowired
	private SampleRepository sampleRepository;
	
	@PostMapping("/create")
	public Sample createSample(@RequestBody SampleDTO sampledto) {
		Sample sample = sampleMapper.toSample(sampledto);
		return sampleRepository.save(sample);
		
	}

}
