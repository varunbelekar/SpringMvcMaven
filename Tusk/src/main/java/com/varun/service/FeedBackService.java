package com.varun.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.varun.dao.FeedbackDao;
import com.varun.model.Feedback;

public class FeedBackService {
	@Autowired
	FeedbackDao dao;

	public FeedbackDao getDao() {
		return dao;
	}

	public void setDao(FeedbackDao dao) {
		this.dao = dao;
	}
	
	
	public void addFeedBack(Feedback fb) {
		dao.addFeedBackDao(fb);
	}
}
