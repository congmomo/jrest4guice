package org.jrest.rest.http;

import javax.servlet.http.HttpServletResponse;

import com.google.inject.Provider;

public class HttpResponseProvider implements Provider<HttpServletResponse> {

	public HttpServletResponse get() {
		return HttpContextManager.getResponse();
	}
}
