package ru.qa.addressbook;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {

    @Test
    public void testGroupDeletion() throws Exception {
        gotoGroupPage();
        selectGroup("selected[]");
        selectGroup("delete");
        returnToGroupPage();
    }

}