package com.bcp.testwebapp.cucumber.stepdefs;

import com.bcp.testwebapp.TestwebappApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = TestwebappApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
