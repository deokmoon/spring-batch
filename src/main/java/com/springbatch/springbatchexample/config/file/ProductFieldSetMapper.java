package com.springbatch.springbatchexample.config.file;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class ProductFieldSetMapper implements FieldSetMapper<Product> {
    @Override
    public Product mapFieldSet(FieldSet fieldSet) throws BindException {
        Product product = new Product();
        product.setId(fieldSet.readLong(0));
        product.setName(fieldSet.readString(1));
        product.setPrice(fieldSet.readBigDecimal(2));
        return product;
    }
}
