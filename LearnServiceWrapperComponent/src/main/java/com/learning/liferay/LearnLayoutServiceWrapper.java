package com.learning.liferay;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.LayoutServiceWrapper;
import com.liferay.portal.kernel.service.ServiceWrapper;
@Component(
		immediate = true,
		property = {
		},
		service = ServiceWrapper.class
	)
public class LearnLayoutServiceWrapper extends LayoutServiceWrapper {

	public LearnLayoutServiceWrapper(){
		super(null);
	}
	
	@Override
	public String getLayoutName(long groupId, boolean privateLayout, long layoutId, String languageId)
			throws PortalException {
		System.out.println("Service Wrapper called Learn Layout Service");
		return super.getLayoutName(groupId, privateLayout, layoutId, languageId);
	}
}
