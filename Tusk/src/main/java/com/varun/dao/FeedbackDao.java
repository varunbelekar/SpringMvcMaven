package com.varun.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.varun.model.Feedback;

public class FeedbackDao {
	@Autowired
	HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	
	public void addFeedBackDao(Feedback fb) {
		template.save(fb);
	}
	
	
}
