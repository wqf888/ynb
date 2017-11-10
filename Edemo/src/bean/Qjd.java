package bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="qjd")
public class Qjd {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer qid;
private Integer eid;
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date startdate;
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date enddate;
private String reason;

@ManyToOne(fetch=FetchType.EAGER)
@JoinColumn(name="eid",insertable=false,updatable=false)
private Emp emp;

public Integer getQid() {
	return qid;
}

public void setQid(Integer qid) {
	this.qid = qid;
}

public Integer getEid() {
	return eid;
}

public void setEid(Integer eid) {
	this.eid = eid;
}

public Date getStartdate() {
	return startdate;
}

public void setStartdate(Date startdate) {
	this.startdate = startdate;
}

public Date getEnddate() {
	return enddate;
}

public void setEnddate(Date enddate) {
	this.enddate = enddate;
}

public String getReason() {
	return reason;
}

public void setReason(String reason) {
	this.reason = reason;
}

public Emp getEmp() {
	return emp;
}

public void setEmp(Emp emp) {
	this.emp = emp;
}

@Override
public String toString() {
	return "Qjd [qid=" + qid + ", eid=" + eid + ", startdate=" + startdate + ", enddate=" + enddate + ", reason="
			+ reason + "]";
}


}
