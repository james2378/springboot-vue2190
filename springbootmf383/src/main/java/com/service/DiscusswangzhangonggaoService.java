package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswangzhangonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswangzhangonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswangzhangonggaoView;


/**
 * 网站公告评论表
 *
 * @author 
 * @email 
 * @date 2022-04-04 22:19:37
 */
public interface DiscusswangzhangonggaoService extends IService<DiscusswangzhangonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswangzhangonggaoVO> selectListVO(Wrapper<DiscusswangzhangonggaoEntity> wrapper);
   	
   	DiscusswangzhangonggaoVO selectVO(@Param("ew") Wrapper<DiscusswangzhangonggaoEntity> wrapper);
   	
   	List<DiscusswangzhangonggaoView> selectListView(Wrapper<DiscusswangzhangonggaoEntity> wrapper);
   	
   	DiscusswangzhangonggaoView selectView(@Param("ew") Wrapper<DiscusswangzhangonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswangzhangonggaoEntity> wrapper);
   	

}

