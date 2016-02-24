
package com.stas.mobile.testing.application.test;

import org.junit.runner.RunWith;

import com.stas.mobile.testing.framework.test.BaseAppiumTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"})
public class AcceptanceSuiteTest extends BaseAppiumTest
{
}
