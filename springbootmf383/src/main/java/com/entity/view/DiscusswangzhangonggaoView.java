package com.entity.view;

import com.entity.DiscusswangzhangonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 网站公告评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-04 22:19:37
 */
@TableName("discusswangzhangonggao")
public class DiscusswangzhangonggaoView  extends DiscusswangzhangonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusswangzhangonggaoView(){
	}
 
 	public DiscusswangzhangonggaoView(DiscusswangzhangonggaoEntity discusswangzhangonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, discusswangzhangonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
