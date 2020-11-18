package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: areidx
 * @Date: 20/10/29 17:31
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
	private Integer uid;
	private String username;
	private String sex;
	private Date birthday;
	private String address;
}
