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
	
	// 定义业务操作bean   
    private GoodService goodService = new GoodServiceImpl();   
  
    // 定义返回的对象   
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
  
    // 查询最新商品   
    public String findAll() {   
        goods = goodService.getNewsGood();   
        return SUCCESS;   
    }   
  
    // 查询单个商品   
    public String findById() {   
        good = goodService.findGood();   
        System.out.println("find by id");
        return SUCCESS;
    }

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		System.out.println("servlet request");
		
		if("get".equalsIgnoreCase(request.getMethod())){	//get 请求
			//get请求的参数名若与属性名相同则框架会直接设置到属性值。
			String result=request.getParameter("param");
			System.out.println("result:"+result);
			
		}else{	//post请求
			try {
				BufferedReader reader=request.getReader();
				String temp=null;
				String result="";
				
				//用json格式通过post方法传递到服务器的内容与一般的post表单不一样，
				//无法直接通过参数名获取
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
