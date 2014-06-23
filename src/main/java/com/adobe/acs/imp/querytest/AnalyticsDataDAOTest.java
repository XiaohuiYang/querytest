package com.adobe.acs.imp.querytest;

import com.adobe.acs.imp.core.model.CampaignType;
import com.adobe.acs.imp.reportDownload.infrastructure.CampaignReportCreationTaskData;
import com.adobe.acs.imp.reportDownload.infrastructure.OfferReportCreationTaskData;
import com.adobe.acs.imp.reportDownload.infrastructure.ReportCreationTaskData;
import com.adobe.acs.imp.reportDownload.service.AnalyticsReportCreationAsyncService;
import com.adobe.acs.imp.reportDownload.service.AnalyticsReportCreationService;

public class AnalyticsDataDAOTest extends AbstractQueryTest {

	private String campaignPath;
	private String campaignName;
	private String userId = "admin";
	private String offerId;
	private String offerName;


	@Override
	void runQuery() throws Exception {
		AnalyticsReportCreationAsyncService service = (AnalyticsReportCreationAsyncService)TestUtil.getOSGIService(AnalyticsReportCreationAsyncService.class);
		for (int i=0; i< REPEATTIMES; i++) {
			ReportCreationTaskData taskData1 = new CampaignReportCreationTaskData(campaignPath, campaignName, "traffic", userId );
			ReportCreationTaskData taskData2 = new CampaignReportCreationTaskData(campaignPath, campaignName, "kpi", userId );
			ReportCreationTaskData taskData3 = new OfferReportCreationTaskData(userId, CampaignType.DISPLAY, offerId, offerName);
			ReportCreationTaskData taskData4 = new OfferReportCreationTaskData(userId, CampaignType.EMAIL, offerId, offerName);
			service.createCampaignTrafficReport(taskData1);
			service.createCampaignKpiReport(taskData2);
			service.createOfferAnalyticsReport(taskData3);
			service.createOfferAnalyticsReport(taskData4);
			Thread.sleep(50);
		}
	}

}
