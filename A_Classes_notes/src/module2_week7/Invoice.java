package module2_week7;

import java.util.Date;
import java.util.List;

public class Invoice {
	private int billno;
	private Date billDate;
	private List<Items>itemList;
	private int gst;
	
	
	
	public Invoice(int billno, Date billDate, List<Items> itemList, int gst) {
		
		this.billno = billno;
		this.billDate = billDate;
		this.itemList = itemList;
		this.gst = gst;
	}
	public int getBillno() {
		return billno;
	}
	public void setBillno(int billno) {
		this.billno = billno;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public List<Items> getItemList() {
		return itemList;
	}
	public void setItemList(List<Items> itemList) {
		this.itemList = itemList;
	}
	public int getGst() {
		return gst;
	}
	public void setGst(int gst) {
		this.gst = gst;
	}
	@Override
	public String toString() {
		return "Invoice [billno=" + billno + ", billDate=" + billDate + ", itemList=" + itemList + ", gst=" + gst + "]";
	}
	
	
	

}
class Items{
	private int itemno;
	private String itemname;
	private int qty;
	private int price;
	
	
	public Items(int itemno, String itemname, int qty, int price) {
		
		this.itemno = itemno;
		this.itemname = itemname;
		this.qty = qty;
		this.price = price;
	}
	
	public int getItemno() {
		return itemno;
	}
	public void setItemno(int itemno) {
		this.itemno = itemno;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Items [itemno=" + itemno + ", itemname=" + itemname + ", qty=" + qty + ", price=" + price + "]";
	}
	
	
	
}