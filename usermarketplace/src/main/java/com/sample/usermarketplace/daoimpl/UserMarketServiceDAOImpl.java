package com.sample.usermarketplace.daoimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sample.usermarketplace.dao.UserMarketServiceDAO;
@Repository
public class UserMarketServiceDAOImpl implements UserMarketServiceDAO
{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Map<String, Object>> getServiceList()
	{
		return (List<Map<String, Object>>) jdbcTemplate.queryForList("select * from USER_SERVICES");
	}

}
