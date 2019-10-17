package it.cai.cividale.server.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppConfigIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
	return new Class<?>[] { RootConfig.class, HibernateConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
	return new Class<?>[] { WebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
	return new String[] { "/" };
    }
}
