package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuanzhongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuanzhongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuanzhongView;


/**
 * 观众
 *
 * @author 
 * @email 
 * @date 2022-04-22 16:16:30
 */
public interface GuanzhongService extends IService<GuanzhongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuanzhongVO> selectListVO(Wrapper<GuanzhongEntity> wrapper);
   	
   	GuanzhongVO selectVO(@Param("ew") Wrapper<GuanzhongEntity> wrapper);
   	
   	List<GuanzhongView> selectListView(Wrapper<GuanzhongEntity> wrapper);
   	
   	GuanzhongView selectView(@Param("ew") Wrapper<GuanzhongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuanzhongEntity> wrapper);
   	

}

