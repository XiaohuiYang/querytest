package com.adobe.acs.imp.querytest;

import com.adobe.acs.imp.insight.service.AudienceDashboardDataRetrievalService;

public class AudienceCQDAOTest extends AbstractQueryTest {

	@Override
	void runQuery() throws Exception {
		AudienceDashboardDataRetrievalService service = (AudienceDashboardDataRetrievalService)TestUtil.getOSGIService(AudienceDashboardDataRetrievalService.class);
		for (int i=0; i< REPEATTIMES; i++) {
			service.getAudiencePopulationData();
			Thread.sleep(50);
		}
	}

}
