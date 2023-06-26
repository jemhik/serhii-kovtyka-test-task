package com.company.entity.factory;

import java.time.LocalDate;

public class ProductVirtual extends Product {

  private String code;

  private LocalDate expirationDate;

  public ProductVirtual(String name, double price, String code, LocalDate expirationDate) {
    super(name, price);
    this.code = code;
    this.expirationDate = expirationDate;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public LocalDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }
}
