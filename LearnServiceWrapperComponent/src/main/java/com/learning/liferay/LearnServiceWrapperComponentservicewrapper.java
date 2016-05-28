package com.learning.liferay;

import com.liferay.portal.kernel.service.UserLocalServiceWrapper;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceWrapper;

import java.util.Locale;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
	},
	service = ServiceWrapper.class
)
public class LearnServiceWrapperComponentservicewrapper extends UserLocalServiceWrapper {

	public LearnServiceWrapperComponentservicewrapper() {
		super(null);
	}
	
	@Override
	public User getUser(long userId) throws PortalException {
		System.out.println("Service Wrapper Get User Called");
		return super.getUser(userId);
	}
}
