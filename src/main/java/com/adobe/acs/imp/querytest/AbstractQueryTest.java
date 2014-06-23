package com.adobe.acs.imp.querytest;

import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public abstract class AbstractQueryTest {
	
	protected final int REPEATTIMES = 10000;
	
	private ResourceResolver adminResourceResolver;
	
	@Before
	public void setUp() throws Exception
	{
	
	}
	
	@After
	public void tearDown() throws Exception {
		if (adminResourceResolver != null) {
			adminResourceResolver.close();
		}
		adminResourceResolver = null;
	}
	
	protected ResourceResolver getAdminResourceResolver() throws Exception {
		if (adminResourceResolver == null)
			adminResourceResolver = ((ResourceResolverFactory)TestUtil.getOSGIService(ResourceResolverFactory.class)).getAdministrativeResourceResolver(null);
		return adminResourceResolver;
	}
	
	@Test
	abstract void runQuery() throws Exception;

}
