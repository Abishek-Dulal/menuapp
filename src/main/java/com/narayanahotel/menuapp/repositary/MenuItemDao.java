package com.narayanahotel.menuapp.repositary;

import com.narayanahotel.menuapp.model.MenuItem;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class MenuItemDao {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public  void  save(MenuItem item){
      sessionFactory.getCurrentSession().save(item);
    }


}
