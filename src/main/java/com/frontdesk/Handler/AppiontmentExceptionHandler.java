package com.frontdesk.Handler;

import org.apache.tomcat.util.http.fileupload.InvalidFileNameException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class AppiontmentExceptionHandler {
	
	@ExceptionHandler
	@ResponseBody
	public String handelExp(InvalidFileNameException excp) {
		return excp.getMessage();
	}

}
