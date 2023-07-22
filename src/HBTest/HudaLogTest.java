package HBTest;

import org.testng.annotations.Test;

import HBPages.HudaLog;
import HBPages.HudaMyAcc;

public class HudaLogTest extends HudaBaseClass
{
	@Test
	public void testing()
	{
		HudaMyAcc hb_acc = new HudaMyAcc(huda_b);
		hb_acc.myAcc();
		HudaLog hb_log = new HudaLog(huda_b);
		hb_log.logInput("hudabeautyhuda90@gmail.com", "Hudabeauty90huda#");
		hb_log.Login();
	}
}
