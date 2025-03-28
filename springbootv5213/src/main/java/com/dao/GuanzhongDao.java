package com.dao;

import com.entity.GuanzhongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuanzhongVO;
import com.entity.view.GuanzhongView;


/**
 * 观众
 * 
 * @author 
 * @email 
 * @date 2022-04-22 16:16:30
 */
public interface GuanzhongDao extends BaseMapper<GuanzhongEntity> {
	
	List<GuanzhongVO> selectListVO(@Param("ew") Wrapper<GuanzhongEntity> wrapper);
	
	GuanzhongVO selectVO(@Param("ew") Wrapper<GuanzhongEntity> wrapper);
	
	List<GuanzhongView> selectListView(@Param("ew") Wrapper<GuanzhongEntity> wrapper);

	List<GuanzhongView> selectListView(Pagination page,@Param("ew") Wrapper<GuanzhongEntity> wrapper);
	
	GuanzhongView selectView(@Param("ew") Wrapper<GuanzhongEntity> wrapper);
	

}
