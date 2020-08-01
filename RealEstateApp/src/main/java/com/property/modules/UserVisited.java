package com.property.modules;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_visited")
public class UserVisited {

	public UserVisited(String vname, Date date, String whichSideVisited) {
		super();

		this.vname = vname;
		this.date = date;
		this.whichSideVisited = whichSideVisited;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer slno;
	@Column(name = "vname")
	private String vname;

	@Column(name = "date")
	private Date date;
	@Column(name = "which_side_visited")
	private String whichSideVisited;

	public Integer getSlno() {
		return slno;
	}

	public void setSlno(Integer slno) {
		this.slno = slno;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getWhichSideVisited() {
		return whichSideVisited;
	}

	public void setWhichSideVisited(String whichSideVisited) {
		this.whichSideVisited = whichSideVisited;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "UserVisited [slno=" + slno + ", vname=" + vname + ", date=" + date + ", whichSideVisited="
				+ whichSideVisited + "]";
	}

}
