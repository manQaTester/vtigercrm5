package org.eva.vtigercrm5.pages.inventory.invoiceOr;

import org.eva.vtigercrm5.utils.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class InventoryInvoiceNewCreateInvoiceCommonAddOr {

	public InventoryInvoiceNewCreateInvoiceCommonAddOr(WebUtil webtl) {
		PageFactory.initElements(webtl.getDriver(),this);
	}
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement expSearchNameTB;

	@FindBy(xpath="//input[@name='search_text']/parent::td/following-sibling::td//select")
	private WebElement searchTypeAttributeValueTB;

	@FindBy(xpath="//input[@name='search_text']/parent::td/following-sibling::td[last()]//input")
	private WebElement searchBT;

	@FindBy(xpath="//*[@id='ListViewContents']//tr[2]//tr[2]//a")
	private WebElement SearchNameValueClick;

	private String windowTitle="admin - Inventory - Invoice - vtiger CRM 5 - Commercial Open Source CRM";

}
