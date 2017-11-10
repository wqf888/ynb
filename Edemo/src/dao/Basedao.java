package dao;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

@Component("basedao")
public class Basedao extends HibernateDaoSupport{
@Resource(name="sessionFactory")
public void setfactory(SessionFactory sessionFactory) {
	super.setSessionFactory(sessionFactory);
	
}
@Transactional
public void add(Object obj) {
	super.getHibernateTemplate().save(obj);
}@Transactional
public void delete(Object obj) {
	super.getHibernateTemplate().delete(obj);
}
@Transactional
public void update(Object obj) {
	super.getHibernateTemplate().update(obj);
}
public List find(String hql) {
	return super.getHibernateTemplate().find(hql);
}
public Object load(Class claxx,Integer id) {
	return super.getHibernateTemplate().get(claxx, id);
}
}
