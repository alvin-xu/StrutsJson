package cn.redarmy.action;

import java.util.ArrayList;
import java.util.List;

import cn.redarmy.domain.Scenery;

import com.opensymphony.xwork2.ActionSupport;

public class SceneryAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private List<Scenery> sceneries;
	
	private String result;

	public String showSceneries(){
		
		System.out.println("id:"+id);
		sceneries=new ArrayList<Scenery>();
		Scenery scenery;
		for(int i=0;i<20;i++){
			scenery=new Scenery();
			scenery.setName("aaa"+i);
			scenery.setScore(i);
			scenery.setEvalNum(i*100);
			scenery.setDescription("郑成功纪念馆是1962年为纪念郑成功收复台湾300周年而建立。落在日光岩北麓，建于1962年2月1日，郑成功收复台湾300周年纪念日，馆址及周围绿地占地计13000平方米，其中主楼展厅2200平方米，陪楼展厅及资料研究室500平方米，馆匾是郭沫若先生亲笔题写的。"+
	"在纪念馆精致的陈列橱里，有郑成功佩带的玉带穿过的龙袍残片、鞋子、图章等遗物。在诗画资料中，有郑成功的诗作及其手书、《郑成功与王忠孝对奕图》、《海上见闻录定本》、延平王户官杨英的《先王实录》以及《稗海纪游》等，其中《海上见闻录定本》（共两册）是1960年在同安发现的一部抄本，是非常珍贵的历史资料。此外，有双龙铜炮，以炮身饰有两条游龙而命名的。"+
					
	"郑成功纪念馆，在海内外富有盛誉和影晌，它对促进祖国统一大业起了积极的作用。");
			sceneries.add(scenery);
		}
		result="success";
		return SUCCESS;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Scenery> getSceneries() {
		return sceneries;
	}

	public void setSceneries(List<Scenery> sceneries) {
		this.sceneries = sceneries;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	
	
	

}
