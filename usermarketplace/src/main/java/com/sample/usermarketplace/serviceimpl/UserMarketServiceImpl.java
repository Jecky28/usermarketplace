package com.sample.usermarketplace.serviceimpl;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.usermarketplace.dao.UserMarketServiceDAO;
import com.sample.usermarketplace.service.UserMarketService;
@Service
public class UserMarketServiceImpl implements UserMarketService
{

	@Autowired
	UserMarketServiceDAO userMarketServiceDAO;
	
	@Override
	public Object getServiceList() 
	{
		return  Response.status(Response.Status.OK).entity(userMarketServiceDAO.getServiceList()).build().getEntity();
	}

}
