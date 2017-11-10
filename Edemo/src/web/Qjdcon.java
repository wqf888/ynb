package web;


import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;


import bean.Emp;
import bean.Qjd;
import service.Baseservice;

@Controller
public class Qjdcon {
	@Resource(name="service")
	private Baseservice ba;
	
@RequestMapping(value="/load")
	public String load(Model mv,@PathParam(value="ename") String ename,@PathParam(value="did") Integer did) {
   System.out.println("ÐÕÃû£º"+ename+"id"+did);
   //String did=request.getParameter("did");
String hql="select q  from Qjd q where 1=1";
	System.out.println(ename+"00");
if (ename!=null&&!"".equals(ename)) {
		hql+=" and q.emp.ename like '%"+ename+"%'";
}if (did!=null&&!"".equals(did)&&did!=0) {
		hql+=" and q.emp.dept.did ="+did;
	}
System.out.println(hql);
	mv.addAttribute("qjlist",ba.find(hql));
	mv.addAttribute("deptlist",ba.find(" from Dept"));
		return "list";
	}

@RequestMapping(value="/toadd")
public String toadd(Model mv) {
mv.addAttribute("emplist",ba.find(" from Emp"));
	return "add";
}
@RequestMapping(value="/add")
public String add(Model mv,Qjd qj) {
	
	System.out.println(qj.getEid());
qj.setStartdate(new Date());
qj.setEnddate(new Date());
	ba.add(qj);
	return "redirect:/load.action";
}

@RequestMapping(value="/toupdate")
public String toupdate(Model mv,@RequestParam(name="qid") Integer qid) {
	System.err.println("6666");
	Qjd qj=(Qjd)ba.load(Qjd.class,qid);
	mv.addAttribute("qjlist",ba.load(Qjd.class, qid));
	
	System.err.println("99996");
	return "update";
	
}
@RequestMapping(value="/update")
public String update(Model mv,@RequestParam(name="qid") Integer qid,Qjd qj) {
System.err.println("4444");
System.err.println(qid);
System.err.println(qj);
	Qjd qjs=(Qjd)ba.load(Qjd.class, qj.getQid());
	qjs.setEid(qj.getEid());
	qjs.setEnddate(qj.getEnddate());
	System.out.println(qj.getEnddate());
	qjs.setStartdate(qj.getStartdate());
	System.err.println(qj.getEnddate());
	qjs.setReason(qj.getReason());
	Emp ep=(Emp)ba.load(Emp.class, qj.getEid());
   qjs.setEmp(ep);
   ba.update(qjs);
	return "redirect:load.action";
	
}
@RequestMapping(value="/delete")
public String delete(@RequestParam(name="qid") Integer qid,Model mv) {
	
	Qjd qj=(Qjd)ba.load(Qjd.class,qid);
	ba.delete(qj);
	
	return "redirect:/load.action";
}
}
