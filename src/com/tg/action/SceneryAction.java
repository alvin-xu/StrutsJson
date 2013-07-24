package com.tg.action;

import java.util.ArrayList;
import java.util.List;


import com.opensymphony.xwork2.ActionSupport;
import com.tg.entity.Scenery;

public class SceneryAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;

	private Scenery scenery;

	private List<Scenery> sceneries;

	private String result;

	public String sceneryDetail() {
		System.out.println("sc_detail id="+id);
		scenery = new Scenery();
		scenery.setName("�չ���");
		scenery.setAddress("˼��������·73��");
		scenery.setPlayTime(60);
		scenery.setBusinessHour("8:00-17:30");
		scenery.setTicket("�������չ�����Ʊ��");
		scenery.setScore(6);
		scenery.setEvalNum(6 * 100);
		scenery.setDescription("֣�ɹ��������1962��Ϊ����֣�ɹ��ո�̨��300����������������չ��ұ�´������1962��2��1�գ�֣�ɹ��ո�̨��300��������գ���ַ����Χ�̵�ռ�ؼ�13000ƽ���ף�������¥չ��2200ƽ���ף���¥չ���������о���500ƽ���ף������ǹ�ĭ�������ױ���д�ġ�"
				+ "�ڼ���ݾ��µĳ��г����֣�ɹ������������������۲�Ƭ��Ь�ӡ�ͼ�µ������ʫ�������У���֣�ɹ���ʫ���������顢��֣�ɹ�������Т����ͼ���������ϼ���¼����������ƽ��������Ӣ�ġ�����ʵ¼���Լ����޺����Ρ��ȣ����С����ϼ���¼�������������ᣩ��1960����ͬ�����ֵ�һ���������Ƿǳ�������ʷ���ϡ����⣬��˫��ͭ�ڣ��������������������������ġ�"
				+ "֣�ɹ�����ݣ��ں����⸻��ʢ����Ӱ�Σ����Դٽ����ͳһ��ҵ���˻��������á�");
		result="success";
		return SUCCESS;
	}

	public String showSceneries() {

		System.out.println("id:" + id);
		sceneries = new ArrayList<Scenery>();
		Scenery scenery;
		for (int i = 0; i < 20; i++) {
			scenery = new Scenery();
			scenery.setName("aaa" + i);
			scenery.setScore(i);
			scenery.setEvalNum(i * 100);
			scenery.setDescription("֣�ɹ��������1962��Ϊ����֣�ɹ��ո�̨��300����������������չ��ұ�´������1962��2��1�գ�֣�ɹ��ո�̨��300��������գ���ַ����Χ�̵�ռ�ؼ�13000ƽ���ף�������¥չ��2200ƽ���ף���¥չ���������о���500ƽ���ף������ǹ�ĭ�������ױ���д�ġ�"
					+ "�ڼ���ݾ��µĳ��г����֣�ɹ������������������۲�Ƭ��Ь�ӡ�ͼ�µ������ʫ�������У���֣�ɹ���ʫ���������顢��֣�ɹ�������Т����ͼ���������ϼ���¼����������ƽ��������Ӣ�ġ�����ʵ¼���Լ����޺����Ρ��ȣ����С����ϼ���¼�������������ᣩ��1960����ͬ�����ֵ�һ���������Ƿǳ�������ʷ���ϡ����⣬��˫��ͭ�ڣ��������������������������ġ�"
					+"֣�ɹ�����ݣ��ں����⸻��ʢ����Ӱ�Σ����Դٽ����ͳһ��ҵ���˻��������á�");
			sceneries.add(scenery);
		}
		result = "success";
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

	public Scenery getScenery() {
		return scenery;
	}

	public void setScenery(Scenery scenery) {
		this.scenery = scenery;
	}

}
