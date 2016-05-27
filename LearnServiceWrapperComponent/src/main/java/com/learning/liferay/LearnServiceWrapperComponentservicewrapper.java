package com.learning.liferay;

import com.liferay.portal.kernel.service.UserLocalServiceWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceWrapper;

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
	public User addUser(User user) {

		System.out.println("Created Service Wrapper");
		return super.addUser(user);
	}
}
