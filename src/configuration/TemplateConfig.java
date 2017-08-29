package configuration;

import java.io.File;

import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;

public class TemplateConfig{
	
	private static Configuration cfg;
	
	public TemplateConfig() throws Exception{
		
		setConfig();
		
	}
	
	private void setConfig() throws Exception{
		cfg = new Configuration(Configuration.VERSION_2_3_26);
		cfg.setDirectoryForTemplateLoading(new File("templates"));
		cfg.setDefaultEncoding("UTF-8");
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		cfg.setLogTemplateExceptions(false);
	}

	public static Configuration getConfig(){
		return cfg;
	}
}
