package com.adobe.acs.imp.querytest;

import com.adobe.acs.imp.insight.service.AnalyticsLoggingNodeRetrievalService;

public class AnalyticsLoggingNodeRetrievalServiceTest extends AbstractQueryTest {

	@Override
	void runQuery() throws Exception {
		AnalyticsLoggingNodeRetrievalService service = (AnalyticsLoggingNodeRetrievalService)TestUtil.getOSGIService(AnalyticsLoggingNodeRetrievalService.class);
		for (int i=0; i< REPEATTIMES; i++) {
			service.getAnalyticsLoggingNodes(getAdminResourceResolver());
			Thread.sleep(50);
		}
	}

}
