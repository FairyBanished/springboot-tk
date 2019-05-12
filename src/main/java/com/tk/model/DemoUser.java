package com.tk.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DemoUser {
	private String userid;
	private String username;
	private String password;
	private Date createtime;
	private String timezone;
}
