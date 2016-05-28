package com.learn.liferay.hook.listener;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.model.User;


@Component(
	immediate = true,
	property = {
	},
	service = ModelListener.class
)
public class LearnModelListenerHookComponent extends BaseModelListener<User> {
	@Override
	public void onAfterUpdate(User model) throws ModelListenerException {
		System.out.println("LearnModelListenerHookComponent Called !!!");
		super.onAfterUpdate(model);
	}
}
