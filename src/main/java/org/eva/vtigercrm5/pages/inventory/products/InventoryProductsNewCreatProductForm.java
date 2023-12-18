package org.eva.vtigercrm5.pages.inventory.products;

import org.eva.vtigercrm5.pages.inventory.productsOr.InventoryProductsNewCreatProductFormOr;
import org.eva.vtigercrm5.utils.WebUtil;

public class InventoryProductsNewCreatProductForm extends InventoryProductsNewCreatProductFormOr {
	
	private WebUtil webtl;
	public InventoryProductsNewCreatProductForm(WebUtil webtl) {
		super(webtl);
		this.webtl=webtl;
	}
 
	public void fillBasicInformation() {
		webtl.sendKeys(getProductNameTB(),"Books");
		webtl.sendKeys(getPartNumberTB(),"7485");
		webtl.sendKeys(getSalesStartDate(),"2023-08-14");
		webtl.selectByValueAttribute(getManufactureDD(),"AltvetPet Inc.");
		webtl.selectByValueAttribute(getProductCategryDD(),"CRM Applications");
		webtl.sendKeys(getManufactureDD(), "MetBeat Corp");
		webtl.sendKeys(getStart_dateTB(), "2023-09-12");
		webtl.sendKeys(getStart_EndTB(), "2023-10-12");
		webtl.sendKeys( getExpiry_dateTB(), "2025-09-12");
		webtl.sendKeys(getWebsiteTB(), "www.mansingh@tester.com");
		webtl.sendKeys(getVendor_part_noTB(), "56456");
		webtl.sendKeys(getProductsheetTB(), "workshop");
		webtl.sendKeys(getSerial_noTB(), "54656");
		webtl.sendKeys(getUnit_priceTB(), "200");
		webtl.sendKeys(getCommissionrateTB(), "5%");
		webtl.click(getTax1_checkTB());
		webtl.click(getTax2_checkTB());
		webtl.click(getTax3_checkTB());
		webtl.sendKeys(getDescriptionTB(), "Dreams are goal with deadline");
	}
	
}
