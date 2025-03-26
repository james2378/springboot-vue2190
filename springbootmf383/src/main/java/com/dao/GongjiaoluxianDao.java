package com.dao;

import com.entity.GongjiaoluxianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongjiaoluxianVO;
import com.entity.view.GongjiaoluxianView;


/**
 * 公交路线
 * 
 * @author 
 * @email 
 * @date 2022-04-04 22:19:36
 */
public interface GongjiaoluxianDao extends BaseMapper<GongjiaoluxianEntity> {
	
	List<GongjiaoluxianVO> selectListVO(@Param("ew") Wrapper<GongjiaoluxianEntity> wrapper);
	
	GongjiaoluxianVO selectVO(@Param("ew") Wrapper<GongjiaoluxianEntity> wrapper);
	
	List<GongjiaoluxianView> selectListView(@Param("ew") Wrapper<GongjiaoluxianEntity> wrapper);

	List<GongjiaoluxianView> selectListView(Pagination page,@Param("ew") Wrapper<GongjiaoluxianEntity> wrapper);
	
	GongjiaoluxianView selectView(@Param("ew") Wrapper<GongjiaoluxianEntity> wrapper);
	

}
