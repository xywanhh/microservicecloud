package com.leaf.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

// 工程集成lombok有问题，此处先不用
// maven clean install -> jar包依赖更新
@SuppressWarnings("serial")
//@NoArgsConstructor
//@Data
//@Accessors(chain=true)
public class Dept implements Serializable {// entity --orm--- db_table

	private Long 	deptno; // 主键
	private String 	dname; // 部门名称
	private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	
	public Long getDeptno() {
		return deptno;
	}
	public Dept setDeptno(Long deptno) {
		this.deptno = deptno;
		return this;
	}
	public String getDname() {
		return dname;
	}
	public Dept setDname(String dname) {
		this.dname = dname;
		return this;
	}
	public String getDb_source() {
		return db_source;
	}
	public Dept setDb_source(String db_source) {
		this.db_source = db_source;
		return this;
		
	}
	
	
	
//	public Dept(String dname)
//	{
//		super();
//		this.dname = dname;
//	}
}
