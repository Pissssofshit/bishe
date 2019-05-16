package com.bishe.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class DataControllerTest {

    @Autowired
    DataController dataController;
    @Test
    public void test1() {
        dataController.test();
    }
}