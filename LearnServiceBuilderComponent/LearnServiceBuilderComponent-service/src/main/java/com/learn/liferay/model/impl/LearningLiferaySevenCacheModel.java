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

package com.learn.liferay.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.learn.liferay.model.LearningLiferaySeven;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LearningLiferaySeven in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see LearningLiferaySeven
 * @generated
 */
@ProviderType
public class LearningLiferaySevenCacheModel implements CacheModel<LearningLiferaySeven>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LearningLiferaySevenCacheModel)) {
			return false;
		}

		LearningLiferaySevenCacheModel learningLiferaySevenCacheModel = (LearningLiferaySevenCacheModel)obj;

		if (LearningLiferaySevenId == learningLiferaySevenCacheModel.LearningLiferaySevenId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, LearningLiferaySevenId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", LearningLiferaySevenId=");
		sb.append(LearningLiferaySevenId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", field1=");
		sb.append(field1);
		sb.append(", field2=");
		sb.append(field2);
		sb.append(", field3=");
		sb.append(field3);
		sb.append(", field4=");
		sb.append(field4);
		sb.append(", field5=");
		sb.append(field5);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LearningLiferaySeven toEntityModel() {
		LearningLiferaySevenImpl learningLiferaySevenImpl = new LearningLiferaySevenImpl();

		if (uuid == null) {
			learningLiferaySevenImpl.setUuid(StringPool.BLANK);
		}
		else {
			learningLiferaySevenImpl.setUuid(uuid);
		}

		learningLiferaySevenImpl.setLearningLiferaySevenId(LearningLiferaySevenId);
		learningLiferaySevenImpl.setGroupId(groupId);
		learningLiferaySevenImpl.setCompanyId(companyId);
		learningLiferaySevenImpl.setUserId(userId);

		if (userName == null) {
			learningLiferaySevenImpl.setUserName(StringPool.BLANK);
		}
		else {
			learningLiferaySevenImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			learningLiferaySevenImpl.setCreateDate(null);
		}
		else {
			learningLiferaySevenImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			learningLiferaySevenImpl.setModifiedDate(null);
		}
		else {
			learningLiferaySevenImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (field1 == null) {
			learningLiferaySevenImpl.setField1(StringPool.BLANK);
		}
		else {
			learningLiferaySevenImpl.setField1(field1);
		}

		learningLiferaySevenImpl.setField2(field2);
		learningLiferaySevenImpl.setField3(field3);

		if (field4 == Long.MIN_VALUE) {
			learningLiferaySevenImpl.setField4(null);
		}
		else {
			learningLiferaySevenImpl.setField4(new Date(field4));
		}

		if (field5 == null) {
			learningLiferaySevenImpl.setField5(StringPool.BLANK);
		}
		else {
			learningLiferaySevenImpl.setField5(field5);
		}

		learningLiferaySevenImpl.resetOriginalValues();

		return learningLiferaySevenImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		LearningLiferaySevenId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		field1 = objectInput.readUTF();

		field2 = objectInput.readBoolean();

		field3 = objectInput.readInt();
		field4 = objectInput.readLong();
		field5 = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(LearningLiferaySevenId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (field1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(field1);
		}

		objectOutput.writeBoolean(field2);

		objectOutput.writeInt(field3);
		objectOutput.writeLong(field4);

		if (field5 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(field5);
		}
	}

	public String uuid;
	public long LearningLiferaySevenId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String field1;
	public boolean field2;
	public int field3;
	public long field4;
	public String field5;
}