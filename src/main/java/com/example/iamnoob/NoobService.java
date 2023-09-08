package com.example.iamnoob;

import org.springframework.stereotype.Service;

@Service
public class NoobService {

	OutputBean handlePostRequest(InputBean in) {
		return MapInputOutput.INSTACE.convertToOutputBean(in);
	}
}
