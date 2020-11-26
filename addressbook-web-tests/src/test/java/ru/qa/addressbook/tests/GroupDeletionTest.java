package ru.qa.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {

    @Test
    public void testGroupDeletion() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup("selected[]");
        app.getGroupHelper().selectGroup("delete");
        app.getGroupHelper().returnToGroupPage();
    }

}