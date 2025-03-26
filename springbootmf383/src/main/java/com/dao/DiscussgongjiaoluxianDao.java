package com.dao;

import com.entity.DiscussgongjiaoluxianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussgongjiaoluxianVO;
import com.entity.view.DiscussgongjiaoluxianView;


/**
 * 公交路线评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-04 22:19:37
 */
public interface DiscussgongjiaoluxianDao extends BaseMapper<DiscussgongjiaoluxianEntity> {
	
	List<DiscussgongjiaoluxianVO> selectListVO(@Param("ew") Wrapper<DiscussgongjiaoluxianEntity> wrapper);
	
	DiscussgongjiaoluxianVO selectVO(@Param("ew") Wrapper<DiscussgongjiaoluxianEntity> wrapper);
	
	List<DiscussgongjiaoluxianView> selectListView(@Param("ew") Wrapper<DiscussgongjiaoluxianEntity> wrapper);

	List<DiscussgongjiaoluxianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussgongjiaoluxianEntity> wrapper);
	
	DiscussgongjiaoluxianView selectView(@Param("ew") Wrapper<DiscussgongjiaoluxianEntity> wrapper);
	

}
