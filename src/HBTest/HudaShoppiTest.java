package HBTest;

import org.testng.annotations.Test;
import HBPages.HudaShoppi;

public class HudaShoppiTest extends HudaBaseClass
{
	@Test
	public void testing()
	{
		HudaShoppi hb_sh = new HudaShoppi(huda_b);
		hb_sh.purchase();
	}
}    