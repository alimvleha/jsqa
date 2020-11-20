package ru.qa.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("Alimov3", "Test3", "Test3"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
