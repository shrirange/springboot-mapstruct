package com.example.mapstruct;

import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/list")
	public List<SampleDTO> listSamples() {
		return sampleRepository.findAll()
				.stream()
				.map(element -> sampleMapper.fromSample(element))
				.collect(Collectors.toList());
	}

}
