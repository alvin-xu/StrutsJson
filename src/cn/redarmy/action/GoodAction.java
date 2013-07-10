package cn.redarmy.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.apache.struts2.interceptor.ServletRequestAware;

import cn.redarmy.domain.Good;
import cn.redarmy.service.GoodService;
import cn.redarmy.service.impl.GoodServiceImpl;

import com.opensymphony.xwork2.ActionSupport;

public class GoodAction extends ActionSupport implements ServletRequestAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// ����ҵ�����bean   
    private GoodService goodService = new GoodServiceImpl();   
  
    // ���巵�صĶ���   
    private List<Good> goods;   
    private Good good;   
  
    public List<Good> getGoods() {   
        return goods;   
    }   
  
    public void setGoods(List<Good> goods) {   
        this.goods = goods;   
    }   
  
    public Good getGood() {   
        return good;   
    }   
  
    public void setGood(Good good) {   
        this.good = good;   
    }   
  
    // ��ѯ������Ʒ   
    public String findAll() {   
        goods = goodService.getNewsGood();   
        return SUCCESS;   
    }   
  
    // ��ѯ������Ʒ   
    public String findById() {   
        good = goodService.findGood();   
        System.out.println("find by id");
        return SUCCESS;
    }

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		System.out.println("servlet request");
		
		if("get".equalsIgnoreCase(request.getMethod())){	//get ����
			//get����Ĳ�����������������ͬ���ܻ�ֱ�����õ�����ֵ��
			String result=request.getParameter("param");
			System.out.println("result:"+result);
			
		}else{	//post����
			try {
				BufferedReader reader=request.getReader();
				String temp=null;
				String result="";
				
				//��json��ʽͨ��post�������ݵ���������������һ���post����һ����
				//�޷�ֱ��ͨ����������ȡ
				System.out.println("name:"+request.getParameter("name"));
				System.out.println("age:"+request.getParameter("age"));
				
				while((temp=reader.readLine())!=null) result+=temp;
				System.out.println("all:"+result);
				
				JSONObject json=JSONObject.fromObject(result);
				
				System.out.println("name:"+json.getString("name"));
				System.out.println("age:"+json.getInt("age"));
				System.out.println("gender:"+json.getString("gender"));
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
