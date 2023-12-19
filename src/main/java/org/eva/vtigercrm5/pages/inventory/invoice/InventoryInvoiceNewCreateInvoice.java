package org.eva.vtigercrm5.pages.inventory.invoice;

import java.util.Map;

import org.eva.vtigercrm5.pages.inventory.invoiceOr.InventoryInvoiceNewCreateInvoiceOr;
import org.eva.vtigercrm5.utils.WebUtil;

public  class InventoryInvoiceNewCreateInvoice  extends InventoryInvoiceNewCreateInvoiceOr{

	private WebUtil webtl;
	public InventoryInvoiceNewCreateInvoice(WebUtil webtl) {
		super(webtl);
		this.webtl=webtl;
	}
	//TB--TextBox
	//BT--Button
	//RB--Radio Button
	//LK--Link
	public  String fillUpInvoiceInformation(Map<String, String> testcaseDataMap, String expSubjectName) {
		webtl.sendKeys(getExpSubjectNameTB(),expSubjectName);
		webtl.sendKeys(getCustomerNumberTB(), ""+expSubjectName+".er@gmail.com");
		InventoryInvoiceNewCreateInvoiceCommonAdd commonAdd= new InventoryInvoiceNewCreateInvoiceCommonAdd(webtl);
		webtl.click(getSelectContactBT());
	
		commonAdd.addElementName(testcaseDataMap.get("FirstName"), "firstname");
		webtl.sendKeys(getPurchaseOrderTB(), "Contact list");
		webtl.click(getAccountNameTB());
		webtl.thread(2000);
		commonAdd.addElementName("Dhirendra","accountname");
		webtl.clear(getBillingAddressTB());
		webtl.sendKeys(getBillingAddressTB(),testcaseDataMap.get("Address"));
		webtl.clear(getBillPoBoxTB());
		webtl.sendKeys(getBillPoBoxTB(),testcaseDataMap.get("city"));
		webtl.clear(getBillCityTB());
		webtl.sendKeys(getBillCityTB(), "kaushambi");
		webtl.clear(getBillStateTB());
		webtl.sendKeys(getBillStateTB(),"utter pradesh");
		webtl.clear(getBillCodeTB());
		webtl.sendKeys(getBillCodeTB(), "9856");
		webtl.clear(getBillCountryTB());
		webtl.sendKeys(getBillCountryTB(), "indian");
		webtl.click(getCopyBillingAddressRB());
		webtl.click(getProductLNK());
		return expSubjectName;
	}


}
