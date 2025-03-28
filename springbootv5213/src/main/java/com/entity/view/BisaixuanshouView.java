package com.entity.view;

import com.entity.BisaixuanshouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 比赛选手
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-22 16:16:30
 */
@TableName("bisaixuanshou")
public class BisaixuanshouView  extends BisaixuanshouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BisaixuanshouView(){
	}
 
 	public BisaixuanshouView(BisaixuanshouEntity bisaixuanshouEntity){
 	try {
			BeanUtils.copyProperties(this, bisaixuanshouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
