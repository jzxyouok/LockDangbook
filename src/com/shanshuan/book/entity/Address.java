package com.shanshuan.book.entity;
/**
 *Created by Zifeng Wang 2016-6-28����12:58:22
 */
public class Address {
	private int id;
	private String receiveName;
	private String full_address;
	private String postalCode;
	private String mobile;
	private String phone;
	private int is_default;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReceiveName() {
		return receiveName;
	}
	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}
	public String getFull_address() {
		return full_address;
	}
	public void setFull_address(String full_address) {
		this.full_address = full_address;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getIs_default() {
		return is_default;
	}
	public void setIs_default(int is_default) {
		this.is_default = is_default;
	}
	public Address(int id, String receiveName, String full_address,
			String postalCode, String mobile, String phone, int is_default) {
		super();
		this.id = id;
		this.receiveName = receiveName;
		this.full_address = full_address;
		this.postalCode = postalCode;
		this.mobile = mobile;
		this.phone = phone;
		this.is_default = is_default;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", receiveName=" + receiveName
				+ ", full_address=" + full_address + ", postalCode="
				+ postalCode + ", mobile=" + mobile + ", phone=" + phone
				+ ", is_default=" + is_default + "]";
	}
	
}
