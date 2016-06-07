package com.sample.usermarketplace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sample.usermarketplace.resources.UserMarketServiceResource;

@SpringBootApplication 
public class Application 
{
    public static void main( String[] args ) throws Exception
    {
    	 Object[] sources = {UserMarketServiceResource.class};
         SpringApplication.run(sources, args);
    }
}
