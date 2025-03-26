package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WangzhangonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WangzhangonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WangzhangonggaoView;


/**
 * 网站公告
 *
 * @author 
 * @email 
 * @date 2022-04-04 22:19:36
 */
public interface WangzhangonggaoService extends IService<WangzhangonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WangzhangonggaoVO> selectListVO(Wrapper<WangzhangonggaoEntity> wrapper);
   	
   	WangzhangonggaoVO selectVO(@Param("ew") Wrapper<WangzhangonggaoEntity> wrapper);
   	
   	List<WangzhangonggaoView> selectListView(Wrapper<WangzhangonggaoEntity> wrapper);
   	
   	WangzhangonggaoView selectView(@Param("ew") Wrapper<WangzhangonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WangzhangonggaoEntity> wrapper);
   	

}

