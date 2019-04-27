package ru.alfa.demo;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Deprecated
    public void doSth() {
        System.out.println("----- i am deprecated ----");
    }

}
