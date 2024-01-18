package org.eva.vtigercrm5.pages.common;

import org.eva.vtigercrm5.pages.commonOr.CommonOR;
import org.eva.vtigercrm5.utils.WebUtil;

public class CommonCodes extends CommonOR{

private WebUtil webtl;

	public CommonCodes(WebUtil webtl) {
		super(webtl);
		this.webtl=webtl;
		System.out.println("hi");
		System.out.println("bi");
	}

	public void login(String userName,String password) {
		webtl.windowMaximize();
		webtl.implicitilyOfSeconds(60);
		webtl.clear(getUserNameTB());
		webtl.sendKeys(getUserNameTB(),userName);
		webtl.clear(getPasswordTB());
		webtl.sendKeys(getPasswordTB(),password);
		webtl.click(getLoginBT());
	}

	public void logOut() {
		webtl.click(getSignOutBT());
		webtl.thread(1000);
	}

	public  void creatNewPluseButton() { 
		webtl.click(getCreatNewPluseBT());
	}

	public void saveButton() {
		webtl.click(getSaveBT());

	}
	public void searchForElement(String expName,String searchTypeAttributeValue) {
		webtl.sendKeys(getSearchforTB(), expName);
		webtl.selectByValueAttribute(getSelectTypeDD(), searchTypeAttributeValue);
		webtl.click(getSearchButtonBT());
		webtl.thread(3000);
	}

	public int getTableColumnHeaderCount() {
		int countColumn=getListColumns().size();
		return  countColumn;
	}  
 
	//     _______________ Marketing Methods ___________________

	public void goToMarketing() {
		webtl.mouseMoveToElement(getMarketingLK());
		webtl.click(getMarketingLK());
	}

	public void goToMarketingCampaignsLink() {
		webtl.mouseMoveToElement(getMarketingLK());
		webtl.click(getMarketingCampaignsLK());
	}

	public void goToMarketingAccountsLink() {
		webtl.mouseMoveToElement(getMarketingLK());
		webtl.click(getMarketingAccountsLK());
	}

	public void goToMarketingContactsLink() {
		webtl.mouseMoveToElement(getMarketingLK());
		webtl.click(getMarketingContactsLK());
	}
	public void goToMarketingWebmailLink() {
		webtl.mouseMoveToElement(getMarketingLK());
		webtl.click(getMarketingWebmailLK());
	}
	public void goToMarketingLeadsLink() {
		webtl.mouseMoveToElement(getMarketingLK());
		webtl.click(getMarketingLeadsLK());
	}
	public void goToMarketingCalendarLink() {
		webtl.mouseMoveToElement(getMarketingLK());
		webtl.click(getMarketingCalendarLK());
	}
	public void goToMarketingDocumentsLink() {
		webtl.mouseMoveToElement(getMarketingLK());
		webtl.click(getMarketingDocumentsLK());
	}

	//     _______________ Sales Methods ___________________

	public void goToSalesLink() {
		webtl.mouseMoveToElement(getSalesLK());
		webtl.click(getSalesLK());
	}
	public void goToSalesLeadsLink() {
		webtl.mouseMoveToElement(getSalesLK());
		webtl.click(getSalesLeadsLK());
	}
	public void goToSalesContactsLink() {
		webtl.mouseMoveToElement(getSalesLK());
		webtl.click(getSalesContactsLK());
	}
	public void goToSalesPotentialsLink() {
		webtl.mouseMoveToElement(getSalesLK());
		webtl.click(getSalesPotentialsLK());
	}
	public void goToSalesQuotesLink() {
		webtl.mouseMoveToElement(getSalesLK());
		webtl.click(getSalesQuotesLK());
	}
	public void goToSalesSalesOrderLink() {
		webtl.mouseMoveToElement(getSalesLK());
		webtl.click(getSalesSalesOrderLK());
	}
	public void goToSalesInvoiceLink() {
		webtl.mouseMoveToElement(getSalesLK());
		webtl.click(getSalesInvoiceLK());
	}
	public void goToSalesPriceBooksLink() {
		webtl.mouseMoveToElement(getSalesLK());
		webtl.click(getSalesPriceBooksLK());
	}
	public void goToSalesDocumentsLink() {
		webtl.mouseMoveToElement(getSalesLK());
		webtl.click(getSalesDocumentsLK());
	}
	public void goToSalesCalendarLink() {
		webtl.mouseMoveToElement(getSalesLK());
		webtl.click(getSalesCalendarLK());
	}

	//  _______________ Inventory Methods ___________________

	public void goToInventoryLink() {
		webtl.mouseMoveToElement(getInventoryLK());
		webtl.click(getInventoryLK());
	}
	public void goToInventoryProductsLink() {
		webtl.mouseMoveToElement(getInventoryLK());
		webtl.click(getInventoryProductsLK());
	}
	public void goToInventoryVendorsLink() {
		webtl.mouseMoveToElement(getInventoryLK());
		webtl.click(getInventoryVendorsLK());
	}
	public void goToInventoryPriceBooksLink() {
		webtl.mouseMoveToElement(getInventoryLK());
		webtl.click(getInventoryPriceBooksLK());
	}
	public void goToInventoryPurchaseOrderLink() {
		webtl.mouseMoveToElement(getInventoryLK());
		webtl.click(getInventoryPurchaseOrderLK());
	}
	public void goToInventorySalesOrderLink() {
		webtl.mouseMoveToElement(getInventoryLK());
		webtl.click(getInventorySalesOrderLK());
	}
	public void goToInventoryQuotesLink() {
		webtl.mouseMoveToElement(getInventoryLK());
		webtl.click(getInventoryQuotesLK());
	}
	public void goToInventoryInvoiceLink() {
		webtl.mouseMoveToElement(getInventoryLK());
		webtl.click(getInventoryInvoiceLK());
	}
	public void goToInventoryServicesLink() {
		webtl.mouseMoveToElement(getInventoryLK());
		webtl.click(getInventoryServicesLK());
	}
	public void goToInventoryAssetsLink() {
		webtl.mouseMoveToElement(getInventoryLK());
		webtl.click(getInventoryAssetsLK());
	}
}
