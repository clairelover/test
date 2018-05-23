package com.jiashi.domain;

import java.util.List;

/**
 * @author xaitingting
 * 此类用于映射查询试卷返回的结果
 *
 */
public class ListObjectQuestionnaire {

	private List<ObjectQuestionnaire> questionnaires;

	public List<ObjectQuestionnaire> getQuestionnaires() {
		return questionnaires;
	}

	public void setQuestionnaires(List<ObjectQuestionnaire> questionnaires) {
		this.questionnaires = questionnaires;
	}

	public ListObjectQuestionnaire() {
		super();
	}
	
}
