package com.adobe.acs.imp.querytest;

import com.adobe.acs.imp.tnt.service.TnTRequestQueueManager;

public class TnTRequestQueueManagerTest extends AbstractQueryTest{

	@Override
	void runQuery() throws Exception {
		TnTRequestQueueManager service = (TnTRequestQueueManager)TestUtil.getOSGIService(TnTRequestQueueManager.class);
		for (int i=0; i< REPEATTIMES; i++) {
			service.retrieveNextCommands(200);
			Thread.sleep(50);
		}
	}

}
