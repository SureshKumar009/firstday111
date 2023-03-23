package org.sampleprojcls;

import org.basecls.BaseCls;
import org.openqa.selenium.support.PageFactory;

public class SampleProjCls extends BaseCls{
	public SampleProjCls() {
		PageFactory.initElements(driver, this);
		
	}
}