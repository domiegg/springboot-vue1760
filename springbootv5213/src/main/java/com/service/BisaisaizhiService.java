package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BisaisaizhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BisaisaizhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BisaisaizhiView;


/**
 * 比赛赛制
 *
 * @author 
 * @email 
 * @date 2022-04-22 16:16:30
 */
public interface BisaisaizhiService extends IService<BisaisaizhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BisaisaizhiVO> selectListVO(Wrapper<BisaisaizhiEntity> wrapper);
   	
   	BisaisaizhiVO selectVO(@Param("ew") Wrapper<BisaisaizhiEntity> wrapper);
   	
   	List<BisaisaizhiView> selectListView(Wrapper<BisaisaizhiEntity> wrapper);
   	
   	BisaisaizhiView selectView(@Param("ew") Wrapper<BisaisaizhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BisaisaizhiEntity> wrapper);
   	

}

