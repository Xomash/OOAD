
package com.ooad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ooad.dao.OplataDao;
import com.ooad.service.OplataService;

public class OplataServiceImpl implements OplataService {

	
	@Autowired
	OplataDao oplataDao;
}
