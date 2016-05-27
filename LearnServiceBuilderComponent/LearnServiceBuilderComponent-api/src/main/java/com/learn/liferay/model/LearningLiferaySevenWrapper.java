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

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link LearningLiferaySeven}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LearningLiferaySeven
 * @generated
 */
@ProviderType
public class LearningLiferaySevenWrapper implements LearningLiferaySeven,
	ModelWrapper<LearningLiferaySeven> {
	public LearningLiferaySevenWrapper(
		LearningLiferaySeven learningLiferaySeven) {
		_learningLiferaySeven = learningLiferaySeven;
	}

	@Override
	public Class<?> getModelClass() {
		return LearningLiferaySeven.class;
	}

	@Override
	public String getModelClassName() {
		return LearningLiferaySeven.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("LearningLiferaySevenId", getLearningLiferaySevenId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("field1", getField1());
		attributes.put("field2", getField2());
		attributes.put("field3", getField3());
		attributes.put("field4", getField4());
		attributes.put("field5", getField5());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long LearningLiferaySevenId = (Long)attributes.get(
				"LearningLiferaySevenId");

		if (LearningLiferaySevenId != null) {
			setLearningLiferaySevenId(LearningLiferaySevenId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String field1 = (String)attributes.get("field1");

		if (field1 != null) {
			setField1(field1);
		}

		Boolean field2 = (Boolean)attributes.get("field2");

		if (field2 != null) {
			setField2(field2);
		}

		Integer field3 = (Integer)attributes.get("field3");

		if (field3 != null) {
			setField3(field3);
		}

		Date field4 = (Date)attributes.get("field4");

		if (field4 != null) {
			setField4(field4);
		}

		String field5 = (String)attributes.get("field5");

		if (field5 != null) {
			setField5(field5);
		}
	}

	@Override
	public LearningLiferaySeven toEscapedModel() {
		return new LearningLiferaySevenWrapper(_learningLiferaySeven.toEscapedModel());
	}

	@Override
	public LearningLiferaySeven toUnescapedModel() {
		return new LearningLiferaySevenWrapper(_learningLiferaySeven.toUnescapedModel());
	}

	/**
	* Returns the field2 of this learning liferay seven.
	*
	* @return the field2 of this learning liferay seven
	*/
	@Override
	public boolean getField2() {
		return _learningLiferaySeven.getField2();
	}

	@Override
	public boolean isCachedModel() {
		return _learningLiferaySeven.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _learningLiferaySeven.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this learning liferay seven is field2.
	*
	* @return <code>true</code> if this learning liferay seven is field2; <code>false</code> otherwise
	*/
	@Override
	public boolean isField2() {
		return _learningLiferaySeven.isField2();
	}

	@Override
	public boolean isNew() {
		return _learningLiferaySeven.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _learningLiferaySeven.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<LearningLiferaySeven> toCacheModel() {
		return _learningLiferaySeven.toCacheModel();
	}

	@Override
	public int compareTo(LearningLiferaySeven learningLiferaySeven) {
		return _learningLiferaySeven.compareTo(learningLiferaySeven);
	}

	/**
	* Returns the field3 of this learning liferay seven.
	*
	* @return the field3 of this learning liferay seven
	*/
	@Override
	public int getField3() {
		return _learningLiferaySeven.getField3();
	}

	@Override
	public int hashCode() {
		return _learningLiferaySeven.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _learningLiferaySeven.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new LearningLiferaySevenWrapper((LearningLiferaySeven)_learningLiferaySeven.clone());
	}

	/**
	* Returns the field1 of this learning liferay seven.
	*
	* @return the field1 of this learning liferay seven
	*/
	@Override
	public java.lang.String getField1() {
		return _learningLiferaySeven.getField1();
	}

	/**
	* Returns the field5 of this learning liferay seven.
	*
	* @return the field5 of this learning liferay seven
	*/
	@Override
	public java.lang.String getField5() {
		return _learningLiferaySeven.getField5();
	}

	/**
	* Returns the user name of this learning liferay seven.
	*
	* @return the user name of this learning liferay seven
	*/
	@Override
	public java.lang.String getUserName() {
		return _learningLiferaySeven.getUserName();
	}

	/**
	* Returns the user uuid of this learning liferay seven.
	*
	* @return the user uuid of this learning liferay seven
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _learningLiferaySeven.getUserUuid();
	}

	/**
	* Returns the uuid of this learning liferay seven.
	*
	* @return the uuid of this learning liferay seven
	*/
	@Override
	public java.lang.String getUuid() {
		return _learningLiferaySeven.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _learningLiferaySeven.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _learningLiferaySeven.toXmlString();
	}

	/**
	* Returns the create date of this learning liferay seven.
	*
	* @return the create date of this learning liferay seven
	*/
	@Override
	public Date getCreateDate() {
		return _learningLiferaySeven.getCreateDate();
	}

	/**
	* Returns the field4 of this learning liferay seven.
	*
	* @return the field4 of this learning liferay seven
	*/
	@Override
	public Date getField4() {
		return _learningLiferaySeven.getField4();
	}

	/**
	* Returns the modified date of this learning liferay seven.
	*
	* @return the modified date of this learning liferay seven
	*/
	@Override
	public Date getModifiedDate() {
		return _learningLiferaySeven.getModifiedDate();
	}

	/**
	* Returns the company ID of this learning liferay seven.
	*
	* @return the company ID of this learning liferay seven
	*/
	@Override
	public long getCompanyId() {
		return _learningLiferaySeven.getCompanyId();
	}

	/**
	* Returns the group ID of this learning liferay seven.
	*
	* @return the group ID of this learning liferay seven
	*/
	@Override
	public long getGroupId() {
		return _learningLiferaySeven.getGroupId();
	}

	/**
	* Returns the learning liferay seven ID of this learning liferay seven.
	*
	* @return the learning liferay seven ID of this learning liferay seven
	*/
	@Override
	public long getLearningLiferaySevenId() {
		return _learningLiferaySeven.getLearningLiferaySevenId();
	}

	/**
	* Returns the primary key of this learning liferay seven.
	*
	* @return the primary key of this learning liferay seven
	*/
	@Override
	public long getPrimaryKey() {
		return _learningLiferaySeven.getPrimaryKey();
	}

	/**
	* Returns the user ID of this learning liferay seven.
	*
	* @return the user ID of this learning liferay seven
	*/
	@Override
	public long getUserId() {
		return _learningLiferaySeven.getUserId();
	}

	@Override
	public void persist() {
		_learningLiferaySeven.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_learningLiferaySeven.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this learning liferay seven.
	*
	* @param companyId the company ID of this learning liferay seven
	*/
	@Override
	public void setCompanyId(long companyId) {
		_learningLiferaySeven.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this learning liferay seven.
	*
	* @param createDate the create date of this learning liferay seven
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_learningLiferaySeven.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_learningLiferaySeven.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_learningLiferaySeven.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_learningLiferaySeven.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the field1 of this learning liferay seven.
	*
	* @param field1 the field1 of this learning liferay seven
	*/
	@Override
	public void setField1(java.lang.String field1) {
		_learningLiferaySeven.setField1(field1);
	}

	/**
	* Sets whether this learning liferay seven is field2.
	*
	* @param field2 the field2 of this learning liferay seven
	*/
	@Override
	public void setField2(boolean field2) {
		_learningLiferaySeven.setField2(field2);
	}

	/**
	* Sets the field3 of this learning liferay seven.
	*
	* @param field3 the field3 of this learning liferay seven
	*/
	@Override
	public void setField3(int field3) {
		_learningLiferaySeven.setField3(field3);
	}

	/**
	* Sets the field4 of this learning liferay seven.
	*
	* @param field4 the field4 of this learning liferay seven
	*/
	@Override
	public void setField4(Date field4) {
		_learningLiferaySeven.setField4(field4);
	}

	/**
	* Sets the field5 of this learning liferay seven.
	*
	* @param field5 the field5 of this learning liferay seven
	*/
	@Override
	public void setField5(java.lang.String field5) {
		_learningLiferaySeven.setField5(field5);
	}

	/**
	* Sets the group ID of this learning liferay seven.
	*
	* @param groupId the group ID of this learning liferay seven
	*/
	@Override
	public void setGroupId(long groupId) {
		_learningLiferaySeven.setGroupId(groupId);
	}

	/**
	* Sets the learning liferay seven ID of this learning liferay seven.
	*
	* @param LearningLiferaySevenId the learning liferay seven ID of this learning liferay seven
	*/
	@Override
	public void setLearningLiferaySevenId(long LearningLiferaySevenId) {
		_learningLiferaySeven.setLearningLiferaySevenId(LearningLiferaySevenId);
	}

	/**
	* Sets the modified date of this learning liferay seven.
	*
	* @param modifiedDate the modified date of this learning liferay seven
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_learningLiferaySeven.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_learningLiferaySeven.setNew(n);
	}

	/**
	* Sets the primary key of this learning liferay seven.
	*
	* @param primaryKey the primary key of this learning liferay seven
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_learningLiferaySeven.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_learningLiferaySeven.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this learning liferay seven.
	*
	* @param userId the user ID of this learning liferay seven
	*/
	@Override
	public void setUserId(long userId) {
		_learningLiferaySeven.setUserId(userId);
	}

	/**
	* Sets the user name of this learning liferay seven.
	*
	* @param userName the user name of this learning liferay seven
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_learningLiferaySeven.setUserName(userName);
	}

	/**
	* Sets the user uuid of this learning liferay seven.
	*
	* @param userUuid the user uuid of this learning liferay seven
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_learningLiferaySeven.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this learning liferay seven.
	*
	* @param uuid the uuid of this learning liferay seven
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_learningLiferaySeven.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LearningLiferaySevenWrapper)) {
			return false;
		}

		LearningLiferaySevenWrapper learningLiferaySevenWrapper = (LearningLiferaySevenWrapper)obj;

		if (Objects.equals(_learningLiferaySeven,
					learningLiferaySevenWrapper._learningLiferaySeven)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _learningLiferaySeven.getStagedModelType();
	}

	@Override
	public LearningLiferaySeven getWrappedModel() {
		return _learningLiferaySeven;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _learningLiferaySeven.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _learningLiferaySeven.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_learningLiferaySeven.resetOriginalValues();
	}

	private final LearningLiferaySeven _learningLiferaySeven;
}