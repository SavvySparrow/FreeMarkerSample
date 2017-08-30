package userM;

import freemarker.template.*;

import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import configuration.TemplateConfig;
import dataModel.DM;

public class Stest {

	public static void main(String afr[]) throws Exception{
		
		DM model = new DM();		
		model.executeDataModel("Latest Product Details","Sahil Jalan");
		
		Template temp = TemplateConfig.getConfig().getTemplate("sample.ftlh");
		
		Writer out = new OutputStreamWriter(System.out);
		temp.process(model.getRoot(), out);
		out.flush();
		out.close();
		
		Writer file = new FileWriter(new File("template.html"));
		temp.process(model.getRoot(), file);
		file.flush();
		file.close();
		
	}
}
