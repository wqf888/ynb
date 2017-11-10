package bean;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Emp {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer eid;
	private Integer did;
private String ename;
private String title;

@ManyToOne(fetch=FetchType.EAGER)
@JoinColumn(name="did",insertable=false,updatable=false)
private Dept dept;

public Integer getEid() {
	return eid;
}

public void setEid(Integer eid) {
	this.eid = eid;
}

public Integer getDid() {
	return did;
}

public void setDid(Integer did) {
	this.did = did;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public Dept getDept() {
	return dept;
}

public void setDept(Dept dept) {
	this.dept = dept;
}

@Override
public String toString() {
	return "Emp [eid=" + eid + ", did=" + did + ", ename=" + ename + ", title=" + title + "]";
}


}
