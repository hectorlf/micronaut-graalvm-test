package com.hectorlopezfernandez;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.ModelAndView;

@Controller("/hello")
public class HelloController {

	@Get
	public ModelAndView index() {
		return new ModelAndView("hello", CollectionUtils.mapOf("who", "World"));
	}

}
