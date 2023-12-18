package org.eva.vtigercrm5.pages.marketing.leads;

import org.eva.vtigercrm5.pages.common.CommonCodes;
import org.eva.vtigercrm5.pages.marketing.leadsOr.MarketingLeadsLandingPageOr;
import org.eva.vtigercrm5.utils.WebUtil;

public class MarketingLeadsLandingPage extends MarketingLeadsLandingPageOr {
	
	private WebUtil webtl;
	public MarketingLeadsLandingPage(WebUtil webtl) {
		super(webtl);
		this.webtl=webtl;
	}
	
	public String innerTextOfSearchedElement(String searchName,String SearchTypeAttributValue) {
		CommonCodes cc=new CommonCodes(webtl);
		cc.searchForElement(searchName,SearchTypeAttributValue );
		String actAccountName=webtl.myInnerText(getAccountNameTB());
		webtl.click(getFirstNameLNK());
		return actAccountName;
	}
}
