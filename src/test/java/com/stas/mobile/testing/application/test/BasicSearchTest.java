
package com.stas.mobile.testing.application.test;

import org.junit.Assert;
import org.junit.Test;

import com.stas.mobile.testing.application.example.pages.ApplicationUIManager;
import com.stas.mobile.testing.application.example.pages.HomePage;
import com.stas.mobile.testing.framework.test.BaseAppiumTest;

public class BasicSearchTest extends BaseAppiumTest
{

    @Test
    public void testBasicSearch()
    {
        String expectedResultNumer = "24";
        String actualResultNumer;
        ApplicationUIManager appUIMng = new ApplicationUIManager();
        actualResultNumer = appUIMng.getHomeUI()
            .SearchForRecipes(HomePage.COFFEE)
            .getSearchResultNumberTextTextView()
            .getStringValue();

        Assert.assertEquals(actualResultNumer, expectedResultNumer);
    }

}
