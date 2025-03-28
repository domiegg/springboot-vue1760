package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 排名计分
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-22 16:16:30
 */
@TableName("paimingjifen")
public class PaimingjifenEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PaimingjifenEntity() {
		
	}
	
	public PaimingjifenEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 计分编号
	 */
					
	private String jifenbianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：计分编号
	 */
	public void setJifenbianhao(String jifenbianhao) {
		this.jifenbianhao = jifenbianhao;
	}
	/**
	 * 获取：计分编号
	 */
	public String getJifenbianhao() {
		return jifenbianhao;
	}
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
