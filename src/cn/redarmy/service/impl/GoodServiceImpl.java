package cn.redarmy.service.impl;

import java.util.ArrayList;
import java.util.List;

import cn.redarmy.domain.Good;
import cn.redarmy.service.GoodService;

public class GoodServiceImpl implements GoodService{

	@Override
	public List<Good> getNewsGood() {
		// TODO Auto-generated method stub
		// ���巵�صĽ����   
        List<Good> goods = new ArrayList<Good>();   
        // ��������Ե����ݿ��в�ѯ���µ���Ʒ��Ϣ   
        goods.add(new Good(1, "ƻ��ipad2", 3688));   
        goods.add(new Good(2, "thinkPad E40 0579A12", 3799));   
        goods.add(new Good(3, "thinkPad", 3688));   
        goods.add(new Good(4, "ƻ��ipad2����Ĥ", 400));   
        return goods;   
	}

	@Override
	public Good findGood() {
		// TODO Auto-generated method stub
		   // Ҳ�Ǵ����ݿ��в�ѯ������   
        Good good = new Good(1, "ƻ��ipad2", 3688);   
        return good;   
	}
	
}
