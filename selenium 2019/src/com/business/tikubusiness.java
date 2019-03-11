package com.business;

import com.page.basepage;
import com.page.tikupage;

public class tikubusiness {
	public void tikub() {
		basepage base=new basepage();
		tikupage tiku=new tikupage();
		base.leftmenu();
		tiku.tikumenu();
		tiku.addtiku();
		base.right();
		tiku.tikuname("ºá³åÖ±×²¶şÊ®Ëê£¡");
		tiku.submit();
	}
	
	
}
