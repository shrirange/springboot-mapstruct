package com.example.mapstruct;

import java.util.List;
import org.slf4j.MDC;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/sample")
public class SampleController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SampleController.class);
	
	@Autowired
	private SampleMapper sampleMapper;
	
	@Autowired
	private SampleRepository sampleRepository;
	
	@PostMapping("/create")
	public Sample createSample(@RequestBody SampleDTO sampledto) {
		
		Sample sample = sampleMapper.toSample(sampledto);
		
        sample =sampleRepository.save(sample);
        MDC.put("sample.id", sample.getSampleID().toString());
        MDC.put("sample.name", sample.getSampleName());
        MDC.put("sample", sample.toString());
        LOGGER.info("Sample is created" + sample.getSampleID().toString());
        MDC.clear();
		return sample;
		
	}
	
	@GetMapping("/list")
	public List<SampleDTO> listSamples() {
		return sampleRepository.findAll()
				.stream()
				.map(element -> sampleMapper.fromSample(element))
				.collect(Collectors.toList());
	}

}
