package cn.redarmy.service.impl;

import java.util.ArrayList;
import java.util.List;

import cn.redarmy.domain.Good;
import cn.redarmy.service.GoodService;

public class GoodServiceImpl implements GoodService{

	@Override
	public List<Good> getNewsGood() {
		// TODO Auto-generated method stub
		// 定义返回的结果集   
        List<Good> goods = new ArrayList<Good>();   
        // 在这里可以到数据库中查询最新的商品信息   
        goods.add(new Good(1, "苹果ipad2", 3688));   
        goods.add(new Good(2, "thinkPad E40 0579A12", 3799));   
        goods.add(new Good(3, "thinkPad", 3688));   
        goods.add(new Good(4, "苹果ipad2保护膜", 400));   
        return goods;   
	}

	@Override
	public Good findGood() {
		// TODO Auto-generated method stub
		   // 也是从数据库中查询出来的   
        Good good = new Good(1, "苹果ipad2", 3688);   
        return good;   
	}
	
}
