package org.crce.interns.service.impl;


import org.crce.interns.beans.AllotmentBean;
import org.crce.interns.dao.ManageAllotmentDao;
import org.crce.interns.model.Allotment;
import org.crce.interns.service.ManageAllotmentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("manageAllotmentService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class ManageAllotmentServiceImpl implements ManageAllotmentService{

	@Autowired
	private ManageAllotmentDao manageAllotmentDao;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addAllotment(AllotmentBean allotmentBean) {
		// TODO Auto-generated method stub
		Allotment allotment = new Allotment();
		BeanUtils.copyProperties(allotmentBean, allotment);
		//profile.setRole_id("1");

		manageAllotmentDao.createAllotment(allotment);
	}

}
