package com.adobe.acs.imp.querytest;

import com.adobe.acs.imp.analytics.service.FindCampaignsForAggregateAnalyticsService;
import com.adobe.acs.imp.insight.service.AggregatedDataReprocessService;

public class AggregateCampaignDAOTest extends AbstractQueryTest{

	@Override
	void runQuery() throws Exception {
		FindCampaignsForAggregateAnalyticsService service = (FindCampaignsForAggregateAnalyticsService)TestUtil.getOSGIService(FindCampaignsForAggregateAnalyticsService.class);
		for (int i=0; i< REPEATTIMES; i++) {
			service.getCampaignsForTraffic(getAdminResourceResolver(), productReference, focus, targetMarketGeography, targetMarketLanguage, startDate, endDate);
			service.getCampaignsForKpi(getAdminResourceResolver(), path, kpiName, searchStartDate, searchEndDate);
			Thread.sleep(50);
		}
	}

}
