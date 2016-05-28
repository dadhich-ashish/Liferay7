package com.learn.liferay.hook.action;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.struts.StrutsAction;

@Component(
		immediate =  true,
		service = StrutsAction.class
)
public class LearnActionHook {
	// Not implemented yet ;)
}
