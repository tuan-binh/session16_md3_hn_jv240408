package com.example.session16_md3_hn_jv240408.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer
{
	@Override
	protected Class<?>[] getRootConfigClasses()
	{
		return new Class[0];
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses()
	{
		return new Class[]{AppConfig.class};
	}
	
	@Override
	protected String[] getServletMappings()
	{
		return new String[]{"/"};
	}
	
	@Override
	protected Filter[] getServletFilters()
	{
		CharacterEncodingFilter filter = new CharacterEncodingFilter("UTF-8", true);
		return new Filter[]{filter};
	}
}
