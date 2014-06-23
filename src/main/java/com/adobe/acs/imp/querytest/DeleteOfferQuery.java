package com.adobe.acs.imp.querytest;

import com.adobe.acs.imp.deleteoffer.validation.DeletableOfferValidator;

public class DeleteOfferQuery extends AbstractQueryTest {

	private static final String offerPath = null;

	@Override
	void runQuery() throws Exception {
		DeletableOfferValidator validator = (DeletableOfferValidator)TestUtil.getOSGIService(DeletableOfferValidator.class);
		for (int i=0; i< REPEATTIMES; i++) {
			validator.validateDeletableOffer(offerPath);
			Thread.sleep(50);
		}
	}
}
