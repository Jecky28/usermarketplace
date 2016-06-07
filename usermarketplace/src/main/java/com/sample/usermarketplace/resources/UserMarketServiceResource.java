package com.sample.usermarketplace.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.usermarketplace.service.UserMarketService;

@ResponseBody
@RequestMapping(value="/usermktpl/service")
@SpringBootApplication
@ComponentScan("com.sample.usermarketplace")
public class UserMarketServiceResource 
{
	@Autowired
	UserMarketService userMarketService;
	
	@RequestMapping(method=RequestMethod.GET)
	public Object serviceList()
	{
		return userMarketService.getServiceList();
	}
}
