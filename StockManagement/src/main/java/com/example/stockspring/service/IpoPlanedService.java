package com.example.stockspring.service;

import java.util.List;

import com.example.stockspring.model.IpoPlaned;

public interface IpoPlanedService {
      public List<IpoPlaned> getIpoPlanedList(int companyCode) throws Exception;
}
