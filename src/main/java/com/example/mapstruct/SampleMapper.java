package com.example.mapstruct;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SampleMapper {

    SampleMapper MAPPER = Mappers.getMapper(SampleMapper.class);


    @Mapping(source = "sampleDtoName", target = "sampleName")
    @Mapping(source = "sampleDtoType", target = "type")
    Sample toSample(SampleDTO sampleDto);

    @InheritInverseConfiguration
    SampleDTO fromSample(Sample sample);
}
