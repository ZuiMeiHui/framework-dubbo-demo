package com.zuimeihui.demo.service.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 用户表POJO
 * 
 * @author 醉美会 ZuiMeiHui.com
 * @date 2023-11-12 14:53:39
 */
@Setter
@Getter
@ToString
public class DemoUser implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Date timeCreate;

	private Date timeUpdate;

	private String adminId;

	private String adminName;

	private String name;

	private Integer age;

	private Integer sex;

	private String mobilePhone;

	private String email;

	private Boolean freeze;

	private String remark;

}