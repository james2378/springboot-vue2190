package com.entity.view;

import com.entity.GongjiaoluxianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 公交路线
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-04 22:19:36
 */
@TableName("gongjiaoluxian")
public class GongjiaoluxianView  extends GongjiaoluxianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongjiaoluxianView(){
	}
 
 	public GongjiaoluxianView(GongjiaoluxianEntity gongjiaoluxianEntity){
 	try {
			BeanUtils.copyProperties(this, gongjiaoluxianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
