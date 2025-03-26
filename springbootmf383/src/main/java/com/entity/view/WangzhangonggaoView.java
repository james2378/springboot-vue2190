package com.entity.view;

import com.entity.WangzhangonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 网站公告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-04 22:19:36
 */
@TableName("wangzhangonggao")
public class WangzhangonggaoView  extends WangzhangonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WangzhangonggaoView(){
	}
 
 	public WangzhangonggaoView(WangzhangonggaoEntity wangzhangonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, wangzhangonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
