package com.entity.model;

import com.entity.PaimingjifenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 排名计分
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-22 16:16:30
 */
public class PaimingjifenModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 比赛得分
	 */
	
	private String bisaidefen;
		
	/**
	 * 排名
	 */
	
	private String paiming;
		
	/**
	 * 计分时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jifenshijian;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 裁判账号
	 */
	
	private String caipanzhanghao;
		
	/**
	 * 裁判姓名
	 */
	
	private String caipanxingming;
		
	/**
	 * 选手账号
	 */
	
	private String xuanshouzhanghao;
		
	/**
	 * 选手姓名
	 */
	
	private String xuanshouxingming;
				
	
	/**
	 * 设置：比赛得分
	 */
	 
	public void setBisaidefen(String bisaidefen) {
		this.bisaidefen = bisaidefen;
	}
	
	/**
	 * 获取：比赛得分
	 */
	public String getBisaidefen() {
		return bisaidefen;
	}
				
	
	/**
	 * 设置：排名
	 */
	 
	public void setPaiming(String paiming) {
		this.paiming = paiming;
	}
	
	/**
	 * 获取：排名
	 */
	public String getPaiming() {
		return paiming;
	}
				
	
	/**
	 * 设置：计分时间
	 */
	 
	public void setJifenshijian(Date jifenshijian) {
		this.jifenshijian = jifenshijian;
	}
	
	/**
	 * 获取：计分时间
	 */
	public Date getJifenshijian() {
		return jifenshijian;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：裁判账号
	 */
	 
	public void setCaipanzhanghao(String caipanzhanghao) {
		this.caipanzhanghao = caipanzhanghao;
	}
	
	/**
	 * 获取：裁判账号
	 */
	public String getCaipanzhanghao() {
		return caipanzhanghao;
	}
				
	
	/**
	 * 设置：裁判姓名
	 */
	 
	public void setCaipanxingming(String caipanxingming) {
		this.caipanxingming = caipanxingming;
	}
	
	/**
	 * 获取：裁判姓名
	 */
	public String getCaipanxingming() {
		return caipanxingming;
	}
				
	
	/**
	 * 设置：选手账号
	 */
	 
	public void setXuanshouzhanghao(String xuanshouzhanghao) {
		this.xuanshouzhanghao = xuanshouzhanghao;
	}
	
	/**
	 * 获取：选手账号
	 */
	public String getXuanshouzhanghao() {
		return xuanshouzhanghao;
	}
				
	
	/**
	 * 设置：选手姓名
	 */
	 
	public void setXuanshouxingming(String xuanshouxingming) {
		this.xuanshouxingming = xuanshouxingming;
	}
	
	/**
	 * 获取：选手姓名
	 */
	public String getXuanshouxingming() {
		return xuanshouxingming;
	}
			
}
