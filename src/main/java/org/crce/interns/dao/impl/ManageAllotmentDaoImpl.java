package org.crce.interns.dao.impl;

import org.crce.interns.dao.ManageAllotmentDao;
import org.crce.interns.model.Allotment;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("manageAllotmentDao")
public class ManageAllotmentDaoImpl implements ManageAllotmentDao{

	@Autowired
	private SessionFactory sessionFactory;

	public void createAllotment(Allotment allotment) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(allotment);	
	}
}
