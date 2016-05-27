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

package com.learn.liferay.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.learn.liferay.exception.NoSuchLearningLiferaySevenException;
import com.learn.liferay.model.LearningLiferaySeven;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the learning liferay seven service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.learn.liferay.service.persistence.impl.LearningLiferaySevenPersistenceImpl
 * @see LearningLiferaySevenUtil
 * @generated
 */
@ProviderType
public interface LearningLiferaySevenPersistence extends BasePersistence<LearningLiferaySeven> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LearningLiferaySevenUtil} to access the learning liferay seven persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the learning liferay sevens where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching learning liferay sevens
	*/
	public java.util.List<LearningLiferaySeven> findByUuid(
		java.lang.String uuid);

	/**
	* Returns a range of all the learning liferay sevens where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LearningLiferaySevenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of learning liferay sevens
	* @param end the upper bound of the range of learning liferay sevens (not inclusive)
	* @return the range of matching learning liferay sevens
	*/
	public java.util.List<LearningLiferaySeven> findByUuid(
		java.lang.String uuid, int start, int end);

	/**
	* Returns an ordered range of all the learning liferay sevens where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LearningLiferaySevenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of learning liferay sevens
	* @param end the upper bound of the range of learning liferay sevens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching learning liferay sevens
	*/
	public java.util.List<LearningLiferaySeven> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LearningLiferaySeven> orderByComparator);

	/**
	* Returns an ordered range of all the learning liferay sevens where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LearningLiferaySevenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of learning liferay sevens
	* @param end the upper bound of the range of learning liferay sevens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching learning liferay sevens
	*/
	public java.util.List<LearningLiferaySeven> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LearningLiferaySeven> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first learning liferay seven in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching learning liferay seven
	* @throws NoSuchLearningLiferaySevenException if a matching learning liferay seven could not be found
	*/
	public LearningLiferaySeven findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws NoSuchLearningLiferaySevenException;

	/**
	* Returns the first learning liferay seven in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	*/
	public LearningLiferaySeven fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<LearningLiferaySeven> orderByComparator);

	/**
	* Returns the last learning liferay seven in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching learning liferay seven
	* @throws NoSuchLearningLiferaySevenException if a matching learning liferay seven could not be found
	*/
	public LearningLiferaySeven findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws NoSuchLearningLiferaySevenException;

	/**
	* Returns the last learning liferay seven in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	*/
	public LearningLiferaySeven fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<LearningLiferaySeven> orderByComparator);

	/**
	* Returns the learning liferay sevens before and after the current learning liferay seven in the ordered set where uuid = &#63;.
	*
	* @param LearningLiferaySevenId the primary key of the current learning liferay seven
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next learning liferay seven
	* @throws NoSuchLearningLiferaySevenException if a learning liferay seven with the primary key could not be found
	*/
	public LearningLiferaySeven[] findByUuid_PrevAndNext(
		long LearningLiferaySevenId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws NoSuchLearningLiferaySevenException;

	/**
	* Removes all the learning liferay sevens where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of learning liferay sevens where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching learning liferay sevens
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the learning liferay seven where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchLearningLiferaySevenException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching learning liferay seven
	* @throws NoSuchLearningLiferaySevenException if a matching learning liferay seven could not be found
	*/
	public LearningLiferaySeven findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchLearningLiferaySevenException;

	/**
	* Returns the learning liferay seven where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	*/
	public LearningLiferaySeven fetchByUUID_G(java.lang.String uuid,
		long groupId);

	/**
	* Returns the learning liferay seven where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	*/
	public LearningLiferaySeven fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache);

	/**
	* Removes the learning liferay seven where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the learning liferay seven that was removed
	*/
	public LearningLiferaySeven removeByUUID_G(java.lang.String uuid,
		long groupId) throws NoSuchLearningLiferaySevenException;

	/**
	* Returns the number of learning liferay sevens where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching learning liferay sevens
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the learning liferay sevens where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching learning liferay sevens
	*/
	public java.util.List<LearningLiferaySeven> findByUuid_C(
		java.lang.String uuid, long companyId);

	/**
	* Returns a range of all the learning liferay sevens where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LearningLiferaySevenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of learning liferay sevens
	* @param end the upper bound of the range of learning liferay sevens (not inclusive)
	* @return the range of matching learning liferay sevens
	*/
	public java.util.List<LearningLiferaySeven> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end);

	/**
	* Returns an ordered range of all the learning liferay sevens where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LearningLiferaySevenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of learning liferay sevens
	* @param end the upper bound of the range of learning liferay sevens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching learning liferay sevens
	*/
	public java.util.List<LearningLiferaySeven> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LearningLiferaySeven> orderByComparator);

	/**
	* Returns an ordered range of all the learning liferay sevens where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LearningLiferaySevenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of learning liferay sevens
	* @param end the upper bound of the range of learning liferay sevens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching learning liferay sevens
	*/
	public java.util.List<LearningLiferaySeven> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LearningLiferaySeven> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first learning liferay seven in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching learning liferay seven
	* @throws NoSuchLearningLiferaySevenException if a matching learning liferay seven could not be found
	*/
	public LearningLiferaySeven findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws NoSuchLearningLiferaySevenException;

	/**
	* Returns the first learning liferay seven in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	*/
	public LearningLiferaySeven fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<LearningLiferaySeven> orderByComparator);

	/**
	* Returns the last learning liferay seven in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching learning liferay seven
	* @throws NoSuchLearningLiferaySevenException if a matching learning liferay seven could not be found
	*/
	public LearningLiferaySeven findByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws NoSuchLearningLiferaySevenException;

	/**
	* Returns the last learning liferay seven in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	*/
	public LearningLiferaySeven fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<LearningLiferaySeven> orderByComparator);

	/**
	* Returns the learning liferay sevens before and after the current learning liferay seven in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param LearningLiferaySevenId the primary key of the current learning liferay seven
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next learning liferay seven
	* @throws NoSuchLearningLiferaySevenException if a learning liferay seven with the primary key could not be found
	*/
	public LearningLiferaySeven[] findByUuid_C_PrevAndNext(
		long LearningLiferaySevenId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws NoSuchLearningLiferaySevenException;

	/**
	* Removes all the learning liferay sevens where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of learning liferay sevens where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching learning liferay sevens
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the learning liferay sevens where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the matching learning liferay sevens
	*/
	public java.util.List<LearningLiferaySeven> findByField2(boolean field2);

	/**
	* Returns a range of all the learning liferay sevens where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LearningLiferaySevenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of learning liferay sevens
	* @param end the upper bound of the range of learning liferay sevens (not inclusive)
	* @return the range of matching learning liferay sevens
	*/
	public java.util.List<LearningLiferaySeven> findByField2(boolean field2,
		int start, int end);

	/**
	* Returns an ordered range of all the learning liferay sevens where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LearningLiferaySevenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of learning liferay sevens
	* @param end the upper bound of the range of learning liferay sevens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching learning liferay sevens
	*/
	public java.util.List<LearningLiferaySeven> findByField2(boolean field2,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LearningLiferaySeven> orderByComparator);

	/**
	* Returns an ordered range of all the learning liferay sevens where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LearningLiferaySevenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of learning liferay sevens
	* @param end the upper bound of the range of learning liferay sevens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching learning liferay sevens
	*/
	public java.util.List<LearningLiferaySeven> findByField2(boolean field2,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LearningLiferaySeven> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first learning liferay seven in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching learning liferay seven
	* @throws NoSuchLearningLiferaySevenException if a matching learning liferay seven could not be found
	*/
	public LearningLiferaySeven findByField2_First(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws NoSuchLearningLiferaySevenException;

	/**
	* Returns the first learning liferay seven in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	*/
	public LearningLiferaySeven fetchByField2_First(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<LearningLiferaySeven> orderByComparator);

	/**
	* Returns the last learning liferay seven in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching learning liferay seven
	* @throws NoSuchLearningLiferaySevenException if a matching learning liferay seven could not be found
	*/
	public LearningLiferaySeven findByField2_Last(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws NoSuchLearningLiferaySevenException;

	/**
	* Returns the last learning liferay seven in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	*/
	public LearningLiferaySeven fetchByField2_Last(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<LearningLiferaySeven> orderByComparator);

	/**
	* Returns the learning liferay sevens before and after the current learning liferay seven in the ordered set where field2 = &#63;.
	*
	* @param LearningLiferaySevenId the primary key of the current learning liferay seven
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next learning liferay seven
	* @throws NoSuchLearningLiferaySevenException if a learning liferay seven with the primary key could not be found
	*/
	public LearningLiferaySeven[] findByField2_PrevAndNext(
		long LearningLiferaySevenId, boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws NoSuchLearningLiferaySevenException;

	/**
	* Removes all the learning liferay sevens where field2 = &#63; from the database.
	*
	* @param field2 the field2
	*/
	public void removeByField2(boolean field2);

	/**
	* Returns the number of learning liferay sevens where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the number of matching learning liferay sevens
	*/
	public int countByField2(boolean field2);

	/**
	* Caches the learning liferay seven in the entity cache if it is enabled.
	*
	* @param learningLiferaySeven the learning liferay seven
	*/
	public void cacheResult(LearningLiferaySeven learningLiferaySeven);

	/**
	* Caches the learning liferay sevens in the entity cache if it is enabled.
	*
	* @param learningLiferaySevens the learning liferay sevens
	*/
	public void cacheResult(
		java.util.List<LearningLiferaySeven> learningLiferaySevens);

	/**
	* Creates a new learning liferay seven with the primary key. Does not add the learning liferay seven to the database.
	*
	* @param LearningLiferaySevenId the primary key for the new learning liferay seven
	* @return the new learning liferay seven
	*/
	public LearningLiferaySeven create(long LearningLiferaySevenId);

	/**
	* Removes the learning liferay seven with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param LearningLiferaySevenId the primary key of the learning liferay seven
	* @return the learning liferay seven that was removed
	* @throws NoSuchLearningLiferaySevenException if a learning liferay seven with the primary key could not be found
	*/
	public LearningLiferaySeven remove(long LearningLiferaySevenId)
		throws NoSuchLearningLiferaySevenException;

	public LearningLiferaySeven updateImpl(
		LearningLiferaySeven learningLiferaySeven);

	/**
	* Returns the learning liferay seven with the primary key or throws a {@link NoSuchLearningLiferaySevenException} if it could not be found.
	*
	* @param LearningLiferaySevenId the primary key of the learning liferay seven
	* @return the learning liferay seven
	* @throws NoSuchLearningLiferaySevenException if a learning liferay seven with the primary key could not be found
	*/
	public LearningLiferaySeven findByPrimaryKey(long LearningLiferaySevenId)
		throws NoSuchLearningLiferaySevenException;

	/**
	* Returns the learning liferay seven with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param LearningLiferaySevenId the primary key of the learning liferay seven
	* @return the learning liferay seven, or <code>null</code> if a learning liferay seven with the primary key could not be found
	*/
	public LearningLiferaySeven fetchByPrimaryKey(long LearningLiferaySevenId);

	@Override
	public java.util.Map<java.io.Serializable, LearningLiferaySeven> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the learning liferay sevens.
	*
	* @return the learning liferay sevens
	*/
	public java.util.List<LearningLiferaySeven> findAll();

	/**
	* Returns a range of all the learning liferay sevens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LearningLiferaySevenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of learning liferay sevens
	* @param end the upper bound of the range of learning liferay sevens (not inclusive)
	* @return the range of learning liferay sevens
	*/
	public java.util.List<LearningLiferaySeven> findAll(int start, int end);

	/**
	* Returns an ordered range of all the learning liferay sevens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LearningLiferaySevenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of learning liferay sevens
	* @param end the upper bound of the range of learning liferay sevens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of learning liferay sevens
	*/
	public java.util.List<LearningLiferaySeven> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LearningLiferaySeven> orderByComparator);

	/**
	* Returns an ordered range of all the learning liferay sevens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LearningLiferaySevenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of learning liferay sevens
	* @param end the upper bound of the range of learning liferay sevens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of learning liferay sevens
	*/
	public java.util.List<LearningLiferaySeven> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LearningLiferaySeven> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the learning liferay sevens from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of learning liferay sevens.
	*
	* @return the number of learning liferay sevens
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}