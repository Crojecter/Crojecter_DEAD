package com.kh.board.common.model;

import java.sql.Date;

public class Board {
	private int bid; 
	private int btype;
	private String btitle;
	private String bcontent;
	private int bcount;
	private Date bdate;
	private String bstatus;
	private int bwriter;
	private int brcount;
	
	public Board() {}
	
	public Board(int bid, int btype, String btitle, String bcontent, int bcount, Date bdate, String bstatus,
			int bwriter, int brcount) {
		super();
		this.bid = bid;
		this.btype = btype;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bcount = bcount;
		this.bdate = bdate;
		this.bstatus = bstatus;
		this.bwriter = bwriter;
		this.brcount = brcount;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public int getBtype() {
		return btype;
	}

	public void setBtype(int btype) {
		this.btype = btype;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public int getBcount() {
		return bcount;
	}

	public void setBcount(int bcount) {
		this.bcount = bcount;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public String getBstatus() {
		return bstatus;
	}

	public void setBstatus(String bstatus) {
		this.bstatus = bstatus;
	}

	public int getBwriter() {
		return bwriter;
	}

	public void setBwriter(int bwriter) {
		this.bwriter = bwriter;
	}

	public int getBrcount() {
		return brcount;
	}

	public void setBrcount(int brcount) {
		this.brcount = brcount;
	}

	@Override
	public String toString() {
		return "Board [bid=" + bid + ", btype=" + btype + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bcount="
				+ bcount + ", bdate=" + bdate + ", bstatus=" + bstatus + ", bwriter=" + bwriter + ", brcount=" + brcount
				+ "]";
	}

	
}

