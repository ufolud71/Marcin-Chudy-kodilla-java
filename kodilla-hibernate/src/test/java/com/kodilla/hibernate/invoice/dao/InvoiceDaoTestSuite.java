package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Item item1 = new Item(new BigDecimal(20), 5, new BigDecimal(100));
        Item item2 = new Item(new BigDecimal(4), 3, new BigDecimal(12));
        Item item3 = new Item(new BigDecimal(125), 2, new BigDecimal(250));

        Product product = new Product("Shop1");
        product.getItems().add(item1);
        product.getItems().add(item2);
        product.getItems().add(item3);

        Invoice invoice = new Invoice("20031");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);


        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        item1.setProduct(product);
        productDao.save(product);

        //When
        invoiceDao.save(invoice);

        int id = invoice.getId();



        //Then
        Assert.assertNotEquals(0, id);



        //CleanUp
        //invoiceDao.deleteById(id);

    }
}



