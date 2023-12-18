package org.eva.vtigercrm5.pages.marketing.leads;

import org.eva.vtigercrm5.pages.common.CommonCodes;
import org.eva.vtigercrm5.pages.marketing.leadsOr.MarketingLeadsInformationPageOr;
import org.eva.vtigercrm5.utils.WebUtil;

public class MarketingLeadsInformationPage extends MarketingLeadsInformationPageOr  {

	private WebUtil webtl;
	public MarketingLeadsInformationPage(WebUtil webtl) {
		super(webtl);
		this.webtl=webtl;
	}
	public String deleteAndInnerTextOfSearchedLeadNumber() {
		String leadNumberText=webtl.myInnerText(getLeadNumber());
		String[] arrStr=leadNumberText.split("LEA");
		String leadNum=arrStr[1].trim();
		deleteButton();
		CommonCodes cc=new CommonCodes(webtl);
		cc.searchForElement(leadNum, "lead_no");
		String leadResult=webtl.myInnerText(getLeadStatus());
		return leadResult;
	}
	public void deleteButton() {
		webtl.mouseClick(getDeleteBT());
		webtl.popUpAccept();
	}
	public String firstName() {
		String actName=webtl.myInnerText(getFirstName());
		return actName;
	}

}
