package cn.redarmy.action;

import java.util.List;

import cn.redarmy.domain.Good;
import cn.redarmy.service.GoodService;
import cn.redarmy.service.impl.GoodServiceImpl;

import com.opensymphony.xwork2.ActionSupport;

public class GoodAction extends ActionSupport{

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
        return SUCCESS;
    }   

}
