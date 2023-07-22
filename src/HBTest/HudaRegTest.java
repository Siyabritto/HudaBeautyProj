package HBTest;

import org.testng.annotations.Test;

import HBPages.HudaMyAcc;
import HBPages.HudaReg;

public class HudaRegTest extends HudaBaseClass
{
	@Test
	public void testing()
	{
		HudaMyAcc hb_acc = new HudaMyAcc(huda_b);
		hb_acc.myAcc();
		HudaReg hb_reg = new HudaReg(huda_b);
		hb_reg.regInput("Beau", "Hudab", "1234567890", "hudabeautyhuda90@gmail.com", "Hudabeauty90huda#");
		hb_reg.Reg();
	}
}
