package service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import bean.Dept;
import bean.Emp;
import bean.Qjd;
import dao.Basedao;

@Component("service")
public class Baseservice {
@Resource(name="basedao")
private Basedao dao;
@Transactional
public void add(Object obj) {
dao.add(obj);
}
@Transactional
public void delete(Object obj) {
dao.delete(obj);
}
@Transactional
public void update(Object obj) {
dao.update(obj);
}
public Object load(Class claxx,Integer id) {
	return dao.load(claxx, id);
}

public List find(String hql) {
	return dao.find(hql);
}
public static void main(String[] args) {
	ApplicationContext ap=new ClassPathXmlApplicationContext("app-core.xml");
Baseservice ss=(Baseservice)ap.getBean("service");

Dept dp=new Dept();
//dp.setDname("咯发布");

//
//
//Emp ep=new Emp();
//ep.setDid(1);
//ep.setEname("zs");
//ep.setTitle("cc");
//ep.setDept(dp);
//
//ss.add(dp);
//ss.add(ep);


//Qjd qj=new Qjd();
//qj.setEid(3);
//qj.setStartdate(new Date());
//qj.setEnddate(new Date());
//qj.setReason("技师");
//
//ss.add(ep);
//ss.add(qj);
}

}
