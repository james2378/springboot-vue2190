package com.dao;

import com.entity.WangzhangonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WangzhangonggaoVO;
import com.entity.view.WangzhangonggaoView;


/**
 * 网站公告
 * 
 * @author 
 * @email 
 * @date 2022-04-04 22:19:36
 */
public interface WangzhangonggaoDao extends BaseMapper<WangzhangonggaoEntity> {
	
	List<WangzhangonggaoVO> selectListVO(@Param("ew") Wrapper<WangzhangonggaoEntity> wrapper);
	
	WangzhangonggaoVO selectVO(@Param("ew") Wrapper<WangzhangonggaoEntity> wrapper);
	
	List<WangzhangonggaoView> selectListView(@Param("ew") Wrapper<WangzhangonggaoEntity> wrapper);

	List<WangzhangonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<WangzhangonggaoEntity> wrapper);
	
	WangzhangonggaoView selectView(@Param("ew") Wrapper<WangzhangonggaoEntity> wrapper);
	

}
