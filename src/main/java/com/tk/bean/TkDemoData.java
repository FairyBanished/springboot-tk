package com.tk.bean;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TkDemoData implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String id;

    private String name;

    private String remark;

}
