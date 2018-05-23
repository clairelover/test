package com.jiashi.domain;

import com.mysql.fabric.xmlrpc.base.Data;

public class Questionnaire {
	
	/**
	 * 问卷表实体类
	 */
	
	//问卷表名id
	private int questionnaire_id;
	
	//问卷名称
	private String questionnaire_name;
	
	//问卷类型
	private int questionnaire_type;
	
	//答题时间
	private int questionnaire_time;
	
	//总分
	private int questionnaire_sum;
	
	//备注
	private String questionnaire_remark;
	
	//创建人名称
	private String create_user;
	
	//创建日期
	private Data create_date;
	
	//修改人名称
	private String update_user;
	
	//修改日期
	private Data update_date;

	public int getQuestionnaire_id() {
		return questionnaire_id;
	}

	public void setQuestionnaire_id(int questionnaire_id) {
		this.questionnaire_id = questionnaire_id;
	}

	public String getQuestionnaire_name() {
		return questionnaire_name;
	}

	public void setQuestionnaire_name(String questionnaire_name) {
		this.questionnaire_name = questionnaire_name;
	}

	public int getQuestionnaire_type() {
		return questionnaire_type;
	}

	public void setQuestionnaire_type(int questionnaire_type) {
		this.questionnaire_type = questionnaire_type;
	}

	public int getQuestionnaire_time() {
		return questionnaire_time;
	}

	public void setQuestionnaire_time(int questionnaire_time) {
		this.questionnaire_time = questionnaire_time;
	}

	public int getQuestionnaire_sum() {
		return questionnaire_sum;
	}

	public void setQuestionnaire_sum(int questionnaire_sum) {
		this.questionnaire_sum = questionnaire_sum;
	}

	public String getQuestionnaire_remark() {
		return questionnaire_remark;
	}

	public void setQuestionnaire_remark(String questionnaire_remark) {
		this.questionnaire_remark = questionnaire_remark;
	}

	public String getCreate_user() {
		return create_user;
	}

	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

	public Data getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Data create_date) {
		this.create_date = create_date;
	}

	public String getUpdate_user() {
		return update_user;
	}

	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}

	public Data getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Data update_date) {
		this.update_date = update_date;
	}

	public Questionnaire() {
		super();
	}

	public Questionnaire(int questionnaire_id, String questionnaire_name, int questionnaire_type,
			int questionnaire_time, int questionnaire_sum, String questionnaire_remark, String create_user,
			Data create_date, String update_user, Data update_date) {
		super();
		this.questionnaire_id = questionnaire_id;
		this.questionnaire_name = questionnaire_name;
		this.questionnaire_type = questionnaire_type;
		this.questionnaire_time = questionnaire_time;
		this.questionnaire_sum = questionnaire_sum;
		this.questionnaire_remark = questionnaire_remark;
		this.create_user = create_user;
		this.create_date = create_date;
		this.update_user = update_user;
		this.update_date = update_date;
	}
	
	
}
