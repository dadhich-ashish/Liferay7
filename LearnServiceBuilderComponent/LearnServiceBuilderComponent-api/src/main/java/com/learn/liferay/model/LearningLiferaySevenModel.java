/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.learn.liferay.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the LearningLiferaySeven service. Represents a row in the &quot;FOO_LearningLiferaySeven&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.learn.liferay.model.impl.LearningLiferaySevenModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.learn.liferay.model.impl.LearningLiferaySevenImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LearningLiferaySeven
 * @see com.learn.liferay.model.impl.LearningLiferaySevenImpl
 * @see com.learn.liferay.model.impl.LearningLiferaySevenModelImpl
 * @generated
 */
@ProviderType
public interface LearningLiferaySevenModel extends BaseModel<LearningLiferaySeven>,
	GroupedModel, ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a learning liferay seven model instance should use the {@link LearningLiferaySeven} interface instead.
	 */

	/**
	 * Returns the primary key of this learning liferay seven.
	 *
	 * @return the primary key of this learning liferay seven
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this learning liferay seven.
	 *
	 * @param primaryKey the primary key of this learning liferay seven
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this learning liferay seven.
	 *
	 * @return the uuid of this learning liferay seven
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this learning liferay seven.
	 *
	 * @param uuid the uuid of this learning liferay seven
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the learning liferay seven ID of this learning liferay seven.
	 *
	 * @return the learning liferay seven ID of this learning liferay seven
	 */
	public long getLearningLiferaySevenId();

	/**
	 * Sets the learning liferay seven ID of this learning liferay seven.
	 *
	 * @param LearningLiferaySevenId the learning liferay seven ID of this learning liferay seven
	 */
	public void setLearningLiferaySevenId(long LearningLiferaySevenId);

	/**
	 * Returns the group ID of this learning liferay seven.
	 *
	 * @return the group ID of this learning liferay seven
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this learning liferay seven.
	 *
	 * @param groupId the group ID of this learning liferay seven
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this learning liferay seven.
	 *
	 * @return the company ID of this learning liferay seven
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this learning liferay seven.
	 *
	 * @param companyId the company ID of this learning liferay seven
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this learning liferay seven.
	 *
	 * @return the user ID of this learning liferay seven
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this learning liferay seven.
	 *
	 * @param userId the user ID of this learning liferay seven
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this learning liferay seven.
	 *
	 * @return the user uuid of this learning liferay seven
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this learning liferay seven.
	 *
	 * @param userUuid the user uuid of this learning liferay seven
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this learning liferay seven.
	 *
	 * @return the user name of this learning liferay seven
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this learning liferay seven.
	 *
	 * @param userName the user name of this learning liferay seven
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this learning liferay seven.
	 *
	 * @return the create date of this learning liferay seven
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this learning liferay seven.
	 *
	 * @param createDate the create date of this learning liferay seven
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this learning liferay seven.
	 *
	 * @return the modified date of this learning liferay seven
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this learning liferay seven.
	 *
	 * @param modifiedDate the modified date of this learning liferay seven
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the field1 of this learning liferay seven.
	 *
	 * @return the field1 of this learning liferay seven
	 */
	@AutoEscape
	public String getField1();

	/**
	 * Sets the field1 of this learning liferay seven.
	 *
	 * @param field1 the field1 of this learning liferay seven
	 */
	public void setField1(String field1);

	/**
	 * Returns the field2 of this learning liferay seven.
	 *
	 * @return the field2 of this learning liferay seven
	 */
	public boolean getField2();

	/**
	 * Returns <code>true</code> if this learning liferay seven is field2.
	 *
	 * @return <code>true</code> if this learning liferay seven is field2; <code>false</code> otherwise
	 */
	public boolean isField2();

	/**
	 * Sets whether this learning liferay seven is field2.
	 *
	 * @param field2 the field2 of this learning liferay seven
	 */
	public void setField2(boolean field2);

	/**
	 * Returns the field3 of this learning liferay seven.
	 *
	 * @return the field3 of this learning liferay seven
	 */
	public int getField3();

	/**
	 * Sets the field3 of this learning liferay seven.
	 *
	 * @param field3 the field3 of this learning liferay seven
	 */
	public void setField3(int field3);

	/**
	 * Returns the field4 of this learning liferay seven.
	 *
	 * @return the field4 of this learning liferay seven
	 */
	public Date getField4();

	/**
	 * Sets the field4 of this learning liferay seven.
	 *
	 * @param field4 the field4 of this learning liferay seven
	 */
	public void setField4(Date field4);

	/**
	 * Returns the field5 of this learning liferay seven.
	 *
	 * @return the field5 of this learning liferay seven
	 */
	@AutoEscape
	public String getField5();

	/**
	 * Sets the field5 of this learning liferay seven.
	 *
	 * @param field5 the field5 of this learning liferay seven
	 */
	public void setField5(String field5);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(LearningLiferaySeven learningLiferaySeven);

	@Override
	public int hashCode();

	@Override
	public CacheModel<LearningLiferaySeven> toCacheModel();

	@Override
	public LearningLiferaySeven toEscapedModel();

	@Override
	public LearningLiferaySeven toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}