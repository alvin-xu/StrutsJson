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
			scenery.setDescription("֣�ɹ��������1962��Ϊ����֣�ɹ��ո�̨��300����������������չ��ұ�´������1962��2��1�գ�֣�ɹ��ո�̨��300��������գ���ַ����Χ�̵�ռ�ؼ�13000ƽ���ף�������¥չ��2200ƽ���ף���¥չ���������о���500ƽ���ף������ǹ�ĭ�������ױ���д�ġ�"+
	"�ڼ���ݾ��µĳ��г����֣�ɹ������������������۲�Ƭ��Ь�ӡ�ͼ�µ������ʫ�������У���֣�ɹ���ʫ���������顢��֣�ɹ�������Т����ͼ���������ϼ���¼����������ƽ��������Ӣ�ġ�����ʵ¼���Լ����޺����Ρ��ȣ����С����ϼ���¼�������������ᣩ��1960����ͬ�����ֵ�һ���������Ƿǳ�������ʷ���ϡ����⣬��˫��ͭ�ڣ��������������������������ġ�"+
					
	"֣�ɹ�����ݣ��ں����⸻��ʢ����Ӱ�Σ����Դٽ����ͳһ��ҵ���˻��������á�");
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
