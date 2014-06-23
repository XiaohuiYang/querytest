package com.adobe.acs.imp.querytest;

import com.adobe.acs.imp.identifiers.service.UniqueIdService;

public class UniqueIdServiceTest extends AbstractQueryTest{

	@Override
	void runQuery() throws Exception {
		UniqueIdService service = (UniqueIdService)TestUtil.getOSGIService(UniqueIdService.class);
		for (int i=0; i< REPEATTIMES; i++) {
			service.getNextCampaignId();
			service.getNextOfferId();
			Thread.sleep(50);
		}
	}
}
