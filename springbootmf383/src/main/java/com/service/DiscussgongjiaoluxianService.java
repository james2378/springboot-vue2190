package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussgongjiaoluxianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussgongjiaoluxianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussgongjiaoluxianView;


/**
 * 公交路线评论表
 *
 * @author 
 * @email 
 * @date 2022-04-04 22:19:37
 */
public interface DiscussgongjiaoluxianService extends IService<DiscussgongjiaoluxianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussgongjiaoluxianVO> selectListVO(Wrapper<DiscussgongjiaoluxianEntity> wrapper);
   	
   	DiscussgongjiaoluxianVO selectVO(@Param("ew") Wrapper<DiscussgongjiaoluxianEntity> wrapper);
   	
   	List<DiscussgongjiaoluxianView> selectListView(Wrapper<DiscussgongjiaoluxianEntity> wrapper);
   	
   	DiscussgongjiaoluxianView selectView(@Param("ew") Wrapper<DiscussgongjiaoluxianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussgongjiaoluxianEntity> wrapper);
   	

}

