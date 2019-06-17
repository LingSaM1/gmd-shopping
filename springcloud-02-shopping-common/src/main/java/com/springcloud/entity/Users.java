package com.springcloud.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Users表对应的实体类：用于封装Users表中的一行信息
 * 
 * @author 万秀玲
 *
 */

@Entity
@Table(name = "users")
@Data // 添加get set..方法
@NoArgsConstructor // 无参构造方法
@AllArgsConstructor // 全参构造方法
public class Users implements java.io.Serializable {

	private static final long serialVersionUID = 2504015899170623862L;

	/**
	 * 用户编号
	 */
	@Id // 当前成员变量是主键
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 自增长
	private Integer userId;

	/**
	 * 用户姓名
	 */
	@Column(name = "user_name")
	private String userName;

	/**
	 * 身份证号
	 */
	@Column(name = "user_number")
	private String userNumber;
	/**
	 * 用户密码
	 */
	@Column(name = "user_password")
	private String userPassword;
	/**
	 * 用户性别（0为男，1为女）
	 */
	@Column(name = "user_sex")
	private Integer userSex;
	/**
	 * 出生日期
	 */
	@Column(name = "user_birthday")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date userBirthday;
	/**
	 * 收货地址
	 */
	@Column(name = "user_site")
	private String userSite;
	/**
	 * 联系电话
	 */
	@Column(name = "user_phone")
	private String userPhone;

	/**
	 * 电子邮箱
	 */
	@Column(name = "user_email")
	private String userEmail;
	/**
	 * 头像
	 */
	@Column(name = "user_hphoto")
	private String userHphoto;
	/**
	 * 权限编号（1为超级管理员，2为普通管理员，3为普通用户，4为VIP用户）
	 */
	@Column(name = "jdiction_id")
	private Integer jdictionId;
	/**
	 * 用户状态（0为启用，1为禁用）
	 */
	@Column(name = "user_status")
	private Integer userStatus;

}
