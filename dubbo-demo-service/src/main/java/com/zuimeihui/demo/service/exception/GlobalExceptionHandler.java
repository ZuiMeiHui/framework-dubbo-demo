package com.zuimeihui.demo.service.exception;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.ContentCachingRequestWrapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zuimeihui.demo.service.ApiResult;

/**
 * 异常收集
 * 
 * @ClassName: GlobalExceptionHandler
 * @Description: TODO
 * @author ZuiMeiHui.com 醉美会
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public ApiResult<?> exceptionHandler(HttpServletRequest request, Exception e) {
		String body = null;
		if (request != null && request instanceof ContentCachingRequestWrapper) {
			ContentCachingRequestWrapper wrapper = (ContentCachingRequestWrapper) request;
			body = StringUtils.toEncodedString(wrapper.getContentAsByteArray(), Charset.forName(wrapper.getCharacterEncoding()));
		}
		System.out.println("param error : " + getRequestMsg(request, null));
		System.out.println("body error : " + body);
		System.out.println("message error : " + e);
		return ApiResult.fail("本服务错误" + e.getMessage());
	}

	private String getRequestMsg(HttpServletRequest request, Map<Object, Object> mapBody) {
		Map<String, Object> msg = new HashMap<String, Object>();
		msg.put("url", request.getMethod() + " " + request.getServletPath());
		msg.put("params", request.getParameterMap());
		ObjectMapper msgMapper = new ObjectMapper();
		try {
			return msgMapper.writeValueAsString(msg);
		} catch (JsonProcessingException e) {
			return "{}";
		}
	}
}
