package com.adobe.acs.imp.querytest;

import com.adobe.acs.imp.insight.service.AggregatedDataReprocessService;

public class AggregatedDataReprocessServiceTest extends AbstractQueryTest{

	@Override
	void runQuery() throws Exception {
		AggregatedDataReprocessService service = (AggregatedDataReprocessService)TestUtil.getOSGIService(AggregatedDataReprocessService.class);
		for (int i=0; i< REPEATTIMES; i++) {
			service.reprocessAggregatedData();
			Thread.sleep(50);
		}
		
	}

}
