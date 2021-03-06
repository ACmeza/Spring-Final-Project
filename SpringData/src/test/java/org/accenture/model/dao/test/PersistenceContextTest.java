package org.accenture.model.dao.test;

import org.accenture.repository.BookRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.PersistenceContext;

/**
 * Created by antonio on 02/03/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=PersistenceContext.class)
public class PersistenceContextTest {
    @Autowired
    protected BookRepository bookRepository;
}
