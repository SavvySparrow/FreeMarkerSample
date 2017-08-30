package dataModel;

import java.util.HashMap;
import java.util.Map;

import configuration.TemplateConfig;

public class DM {
	
	private Map<String,Object> root = new HashMap<>();
	private Product latest = new Product();
	
	public DM() throws Exception{
		new TemplateConfig();
	}
	
	public void executeDataModel(String title,String user){
		
		root.put("title",title);
		root.put("user",user);
		latest.setUrl("https://www.latestProduct.com");
		latest.setName("Air-Fi");
		root.put("latestProduct",latest);
		root.put("repeat",new RMethod());
		root.put("repeat1",new RMethod1());
	}
	
	public Map<String,Object> getRoot(){
		return root;
	}

	
	
}
