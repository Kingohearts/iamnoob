package com.example.iamnoob;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

@Service
public class NoobService {
	private static final Logger logger = LogManager.getLogger(NoobService.class);
	Gson gs = new Gson();

	ResponseEntity<?> handlePostRequest(InputBean in) {
		logger.info("printBegin");
		OutputBean out = MapInputOutput.INSTACE.convertToOutputBean(in);
		String outStr = gs.toJson(out);
		RestTemplate rs = new RestTemplate();
		String url = "https://dummy.restapiexample.com/api/v1/create";
		HttpEntity<OutputBean> req = new HttpEntity<OutputBean>(out);
		ResponseEntity<?> response = rs.exchange(url, HttpMethod.POST, req, OutputBean.class);
		logger.info("PRINTING");
		logger.info(outStr);

		//return out;
		return response;
	}
}
