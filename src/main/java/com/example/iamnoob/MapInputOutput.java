package com.example.iamnoob;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapInputOutput {
	
	MapInputOutput INSTACE = Mappers.getMapper(MapInputOutput.class);
	
	@Mapping(source = "templateId", target = "templateId")
	@Mapping(source = "notificationText", target = "pushText")
	@Mapping(source = "notificationDesc", target = "pushDesc")
	@Mapping(source = "notificationSubject", target = "title")
	OutputBean convertToOutputBean(InputBean in);
}
