package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * GOODS表对应的实体类，用于保存表中一行类别二信息
 * @author Administrator
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class2 {
	/**
	 * 类别二编号
	 */
	private Integer class2Id;

	/**
	 * 类别二名称
	 */
	private String class2Name;

	/**
	 * 类别一编号
	 */
	private Integer class1Id;

	/**
	 * 备注
	 */
	private String remark;

}