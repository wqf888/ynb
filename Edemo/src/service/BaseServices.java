package service;

import java.util.List;

import javax.annotation.Resource;
import javax.smartcardio.Card;
import javax.transaction.Transactional;

import org.hibernate.type.CalendarType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import dao.Basedao;

@Component("baseservice")
public class BaseServices {
@Resource(name="basedao")
	private Basedao dao;
@Transactional
public void add(Object obj) {
	dao.add(obj);
}
public List find(String hql) {
	return dao.find(hql);
}
public Object find(Class claxx,Integer id) {
	return dao.load(claxx, id);
}

}
