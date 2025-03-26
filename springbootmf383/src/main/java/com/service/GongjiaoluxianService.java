package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongjiaoluxianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongjiaoluxianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongjiaoluxianView;


/**
 * 公交路线
 *
 * @author 
 * @email 
 * @date 2022-04-04 22:19:36
 */
public interface GongjiaoluxianService extends IService<GongjiaoluxianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongjiaoluxianVO> selectListVO(Wrapper<GongjiaoluxianEntity> wrapper);
   	
   	GongjiaoluxianVO selectVO(@Param("ew") Wrapper<GongjiaoluxianEntity> wrapper);
   	
   	List<GongjiaoluxianView> selectListView(Wrapper<GongjiaoluxianEntity> wrapper);
   	
   	GongjiaoluxianView selectView(@Param("ew") Wrapper<GongjiaoluxianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongjiaoluxianEntity> wrapper);
   	

}

