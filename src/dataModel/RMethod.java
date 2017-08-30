package dataModel;

import java.util.ArrayList;
import java.util.List;

import freemarker.template.TemplateMethodModel;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;

@SuppressWarnings("deprecation")
public class RMethod implements TemplateMethodModel {

	

	@Override
	public Object exec(List arg0) throws TemplateModelException {
		
		if(arg0.size()!=2)
			throw new TemplateModelException("Wrong Arguments");
		
		int i=0;
		int j=Integer.parseInt((String) arg0.get(1));
		List ab = new ArrayList();
		while(i<j){
			ab.add(arg0.get(0));
			i++;
		}
			
		
		return ab;
	}
	
}
