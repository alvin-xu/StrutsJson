package cn.redarmy.service;
import java.util.List;

import com.tg.entity.*;


public interface GoodService {
	public abstract List<Good> getNewsGood();   
	  
    public abstract Good findGood();   
}
