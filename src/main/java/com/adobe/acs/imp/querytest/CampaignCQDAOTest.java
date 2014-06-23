package com.adobe.acs.imp.querytest;

import com.adobe.acs.imp.core.infrastructure.dao.CampaignDAO;
import com.adobe.acs.imp.insight.service.AudienceDashboardDataRetrievalService;

public class CampaignCQDAOTest extends AbstractQueryTest {

	@Override
	void runQuery() throws Exception {
		CampaignDAO service = (CampaignDAO)TestUtil.getOSGIService(CampaignDAO.class);
		for (int i=0; i< REPEATTIMES; i++) {
			service.getAllCampaigns(getAdminResourceResolver());
			service.getAllCampaignsByNames(getAdminResourceResolver(), campaignNames);
			service.getArchivedCampaignsByTimeSpan(getAdminResourceResolver(), lowerDateStr, upperDateStr);
			service.getCampaignContentPropertyByConfigurationStates(getAdminResourceResolver(), states, propertyName);
			service.getCampaignsByConfigurationStatesAndType(getAdminResourceResolver(), states, type);
			service.getChildCampaigns(getAdminResourceResolver(), campaignPath);
			service.getCampaignNodesByRefs(getAdminResourceResolver(), offerPath);
			Thread.sleep(50);
		}
	}

}
