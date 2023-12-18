package org.eva.vtigercrm5.pages.inventory.invoice;

import org.eva.vtigercrm5.pages.inventory.invoiceOr.InventoryInvoiceNewCreateInvoiceCommonAddOr;
import org.eva.vtigercrm5.utils.WebUtil;

public class InventoryInvoiceNewCreateInvoiceCommonAdd extends InventoryInvoiceNewCreateInvoiceCommonAddOr{

	private WebUtil webtl;
	public InventoryInvoiceNewCreateInvoiceCommonAdd(WebUtil webtl) {
		super(webtl);
		this.webtl=webtl;
		
	}
	public String searchForElement(String expSearchName,String searchTypeAttributeValue) {
		webtl.sendKeys(getExpSearchNameTB(),expSearchName);
		webtl.selectByValueAttribute(getSearchTypeAttributeValueTB(), searchTypeAttributeValue);
		webtl.click(getSearchBT());
		return expSearchName;
	}	
	public void addElementName(String expSearchName,String valueAttribute) {
		webtl.switchToWindowByTitle("");
		webtl.windowMaximize();
		InventoryInvoiceNewCreateInvoiceCommonAdd commonAdd= new InventoryInvoiceNewCreateInvoiceCommonAdd(webtl);
		commonAdd.searchForElement(expSearchName,valueAttribute);
		webtl.thread(2000);
		webtl.click(getSearchNameValueClick());
		webtl.thread(2000);
		webtl.popUpAccept();
		webtl.switchToWindowByTitle(getWindowTitle());
		webtl.thread(2000);

	}
}
