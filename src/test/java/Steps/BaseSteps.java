package Steps;

import Pages.InventoryPage;
import Pages.LoginPage;
import Pages.SideBar;
import Pages.StorePage;

public class BaseSteps {
    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();
    SideBar sideBar = new SideBar();

    StorePage storePage= new StorePage();


}
