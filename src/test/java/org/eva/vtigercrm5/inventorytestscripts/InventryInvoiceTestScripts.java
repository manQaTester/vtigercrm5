package org.eva.vtigercrm5.inventorytestscripts;

import java.util.List;
import java.util.Map;

import org.eva.vtigercrm5.core.BaseTest;
import org.eva.vtigercrm5.pages.inventory.invoice.InventoryInvoiceNewCreateInvoice;
import org.eva.vtigercrm5.utils.DataUtilByRahulSir;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InventryInvoiceTestScripts extends BaseTest {
 
	
 
	@Test( dataProvider = "getData")
	public void verifyVT0010AccountAndContactAddOnInvoiceForm(  Object data ) {
		Map<String, String>  testcaseDataMap=(Map<String, String>)data;
		System.out.println(testcaseDataMap);
//			webUtil.printMessage("====  verifyVT0012AccountAndContactAddOnInvoiceForm starts from here====");
//			commnCode.goToInventoryInvoiceLink();
//			commnCode.creatNewPluseButton();
//			InventoryInvoiceNewCreateInvoice creatInvoice= new InventoryInvoiceNewCreateInvoice(webUtil);
//			creatInvoice.fillUpInvoiceInformation(testcaseDataMap, "Test Account Name And Contact Name Addition");
//			webUtil.printMessage("====  verifyVT0012AccountAndContactAddOnInvoiceForm ends from here====");

		
	}

	
	 
}
