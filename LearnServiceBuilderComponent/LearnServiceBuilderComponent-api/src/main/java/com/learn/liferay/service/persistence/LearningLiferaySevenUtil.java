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

import com.learn.liferay.model.LearningLiferaySeven;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the learning liferay seven service. This utility wraps {@link com.learn.liferay.service.persistence.impl.LearningLiferaySevenPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LearningLiferaySevenPersistence
 * @see com.learn.liferay.service.persistence.impl.LearningLiferaySevenPersistenceImpl
 * @generated
 */
@ProviderType
public class LearningLiferaySevenUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(LearningLiferaySeven learningLiferaySeven) {
		getPersistence().clearCache(learningLiferaySeven);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LearningLiferaySeven> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LearningLiferaySeven> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LearningLiferaySeven> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<LearningLiferaySeven> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static LearningLiferaySeven update(
		LearningLiferaySeven learningLiferaySeven) {
		return getPersistence().update(learningLiferaySeven);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static LearningLiferaySeven update(
		LearningLiferaySeven learningLiferaySeven, ServiceContext serviceContext) {
		return getPersistence().update(learningLiferaySeven, serviceContext);
	}

	/**
	* Returns all the learning liferay sevens where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching learning liferay sevens
	*/
	public static List<LearningLiferaySeven> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<LearningLiferaySeven> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<LearningLiferaySeven> findByUuid(java.lang.String uuid,
		int start, int end,
		OrderByComparator<LearningLiferaySeven> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<LearningLiferaySeven> findByUuid(java.lang.String uuid,
		int start, int end,
		OrderByComparator<LearningLiferaySeven> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first learning liferay seven in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching learning liferay seven
	* @throws NoSuchLearningLiferaySevenException if a matching learning liferay seven could not be found
	*/
	public static LearningLiferaySeven findByUuid_First(java.lang.String uuid,
		OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws com.learn.liferay.exception.NoSuchLearningLiferaySevenException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first learning liferay seven in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	*/
	public static LearningLiferaySeven fetchByUuid_First(
		java.lang.String uuid,
		OrderByComparator<LearningLiferaySeven> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last learning liferay seven in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching learning liferay seven
	* @throws NoSuchLearningLiferaySevenException if a matching learning liferay seven could not be found
	*/
	public static LearningLiferaySeven findByUuid_Last(java.lang.String uuid,
		OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws com.learn.liferay.exception.NoSuchLearningLiferaySevenException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last learning liferay seven in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	*/
	public static LearningLiferaySeven fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<LearningLiferaySeven> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the learning liferay sevens before and after the current learning liferay seven in the ordered set where uuid = &#63;.
	*
	* @param LearningLiferaySevenId the primary key of the current learning liferay seven
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next learning liferay seven
	* @throws NoSuchLearningLiferaySevenException if a learning liferay seven with the primary key could not be found
	*/
	public static LearningLiferaySeven[] findByUuid_PrevAndNext(
		long LearningLiferaySevenId, java.lang.String uuid,
		OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws com.learn.liferay.exception.NoSuchLearningLiferaySevenException {
		return getPersistence()
				   .findByUuid_PrevAndNext(LearningLiferaySevenId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the learning liferay sevens where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of learning liferay sevens where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching learning liferay sevens
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the learning liferay seven where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchLearningLiferaySevenException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching learning liferay seven
	* @throws NoSuchLearningLiferaySevenException if a matching learning liferay seven could not be found
	*/
	public static LearningLiferaySeven findByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.learn.liferay.exception.NoSuchLearningLiferaySevenException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the learning liferay seven where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	*/
	public static LearningLiferaySeven fetchByUUID_G(java.lang.String uuid,
		long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the learning liferay seven where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	*/
	public static LearningLiferaySeven fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the learning liferay seven where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the learning liferay seven that was removed
	*/
	public static LearningLiferaySeven removeByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.learn.liferay.exception.NoSuchLearningLiferaySevenException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of learning liferay sevens where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching learning liferay sevens
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the learning liferay sevens where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching learning liferay sevens
	*/
	public static List<LearningLiferaySeven> findByUuid_C(
		java.lang.String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<LearningLiferaySeven> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<LearningLiferaySeven> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		OrderByComparator<LearningLiferaySeven> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<LearningLiferaySeven> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		OrderByComparator<LearningLiferaySeven> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first learning liferay seven in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching learning liferay seven
	* @throws NoSuchLearningLiferaySevenException if a matching learning liferay seven could not be found
	*/
	public static LearningLiferaySeven findByUuid_C_First(
		java.lang.String uuid, long companyId,
		OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws com.learn.liferay.exception.NoSuchLearningLiferaySevenException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first learning liferay seven in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	*/
	public static LearningLiferaySeven fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		OrderByComparator<LearningLiferaySeven> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last learning liferay seven in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching learning liferay seven
	* @throws NoSuchLearningLiferaySevenException if a matching learning liferay seven could not be found
	*/
	public static LearningLiferaySeven findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws com.learn.liferay.exception.NoSuchLearningLiferaySevenException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last learning liferay seven in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	*/
	public static LearningLiferaySeven fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		OrderByComparator<LearningLiferaySeven> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static LearningLiferaySeven[] findByUuid_C_PrevAndNext(
		long LearningLiferaySevenId, java.lang.String uuid, long companyId,
		OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws com.learn.liferay.exception.NoSuchLearningLiferaySevenException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(LearningLiferaySevenId, uuid,
			companyId, orderByComparator);
	}

	/**
	* Removes all the learning liferay sevens where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of learning liferay sevens where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching learning liferay sevens
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the learning liferay sevens where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the matching learning liferay sevens
	*/
	public static List<LearningLiferaySeven> findByField2(boolean field2) {
		return getPersistence().findByField2(field2);
	}

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
	public static List<LearningLiferaySeven> findByField2(boolean field2,
		int start, int end) {
		return getPersistence().findByField2(field2, start, end);
	}

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
	public static List<LearningLiferaySeven> findByField2(boolean field2,
		int start, int end,
		OrderByComparator<LearningLiferaySeven> orderByComparator) {
		return getPersistence()
				   .findByField2(field2, start, end, orderByComparator);
	}

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
	public static List<LearningLiferaySeven> findByField2(boolean field2,
		int start, int end,
		OrderByComparator<LearningLiferaySeven> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByField2(field2, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first learning liferay seven in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching learning liferay seven
	* @throws NoSuchLearningLiferaySevenException if a matching learning liferay seven could not be found
	*/
	public static LearningLiferaySeven findByField2_First(boolean field2,
		OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws com.learn.liferay.exception.NoSuchLearningLiferaySevenException {
		return getPersistence().findByField2_First(field2, orderByComparator);
	}

	/**
	* Returns the first learning liferay seven in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	*/
	public static LearningLiferaySeven fetchByField2_First(boolean field2,
		OrderByComparator<LearningLiferaySeven> orderByComparator) {
		return getPersistence().fetchByField2_First(field2, orderByComparator);
	}

	/**
	* Returns the last learning liferay seven in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching learning liferay seven
	* @throws NoSuchLearningLiferaySevenException if a matching learning liferay seven could not be found
	*/
	public static LearningLiferaySeven findByField2_Last(boolean field2,
		OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws com.learn.liferay.exception.NoSuchLearningLiferaySevenException {
		return getPersistence().findByField2_Last(field2, orderByComparator);
	}

	/**
	* Returns the last learning liferay seven in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	*/
	public static LearningLiferaySeven fetchByField2_Last(boolean field2,
		OrderByComparator<LearningLiferaySeven> orderByComparator) {
		return getPersistence().fetchByField2_Last(field2, orderByComparator);
	}

	/**
	* Returns the learning liferay sevens before and after the current learning liferay seven in the ordered set where field2 = &#63;.
	*
	* @param LearningLiferaySevenId the primary key of the current learning liferay seven
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next learning liferay seven
	* @throws NoSuchLearningLiferaySevenException if a learning liferay seven with the primary key could not be found
	*/
	public static LearningLiferaySeven[] findByField2_PrevAndNext(
		long LearningLiferaySevenId, boolean field2,
		OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws com.learn.liferay.exception.NoSuchLearningLiferaySevenException {
		return getPersistence()
				   .findByField2_PrevAndNext(LearningLiferaySevenId, field2,
			orderByComparator);
	}

	/**
	* Removes all the learning liferay sevens where field2 = &#63; from the database.
	*
	* @param field2 the field2
	*/
	public static void removeByField2(boolean field2) {
		getPersistence().removeByField2(field2);
	}

	/**
	* Returns the number of learning liferay sevens where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the number of matching learning liferay sevens
	*/
	public static int countByField2(boolean field2) {
		return getPersistence().countByField2(field2);
	}

	/**
	* Caches the learning liferay seven in the entity cache if it is enabled.
	*
	* @param learningLiferaySeven the learning liferay seven
	*/
	public static void cacheResult(LearningLiferaySeven learningLiferaySeven) {
		getPersistence().cacheResult(learningLiferaySeven);
	}

	/**
	* Caches the learning liferay sevens in the entity cache if it is enabled.
	*
	* @param learningLiferaySevens the learning liferay sevens
	*/
	public static void cacheResult(
		List<LearningLiferaySeven> learningLiferaySevens) {
		getPersistence().cacheResult(learningLiferaySevens);
	}

	/**
	* Creates a new learning liferay seven with the primary key. Does not add the learning liferay seven to the database.
	*
	* @param LearningLiferaySevenId the primary key for the new learning liferay seven
	* @return the new learning liferay seven
	*/
	public static LearningLiferaySeven create(long LearningLiferaySevenId) {
		return getPersistence().create(LearningLiferaySevenId);
	}

	/**
	* Removes the learning liferay seven with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param LearningLiferaySevenId the primary key of the learning liferay seven
	* @return the learning liferay seven that was removed
	* @throws NoSuchLearningLiferaySevenException if a learning liferay seven with the primary key could not be found
	*/
	public static LearningLiferaySeven remove(long LearningLiferaySevenId)
		throws com.learn.liferay.exception.NoSuchLearningLiferaySevenException {
		return getPersistence().remove(LearningLiferaySevenId);
	}

	public static LearningLiferaySeven updateImpl(
		LearningLiferaySeven learningLiferaySeven) {
		return getPersistence().updateImpl(learningLiferaySeven);
	}

	/**
	* Returns the learning liferay seven with the primary key or throws a {@link NoSuchLearningLiferaySevenException} if it could not be found.
	*
	* @param LearningLiferaySevenId the primary key of the learning liferay seven
	* @return the learning liferay seven
	* @throws NoSuchLearningLiferaySevenException if a learning liferay seven with the primary key could not be found
	*/
	public static LearningLiferaySeven findByPrimaryKey(
		long LearningLiferaySevenId)
		throws com.learn.liferay.exception.NoSuchLearningLiferaySevenException {
		return getPersistence().findByPrimaryKey(LearningLiferaySevenId);
	}

	/**
	* Returns the learning liferay seven with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param LearningLiferaySevenId the primary key of the learning liferay seven
	* @return the learning liferay seven, or <code>null</code> if a learning liferay seven with the primary key could not be found
	*/
	public static LearningLiferaySeven fetchByPrimaryKey(
		long LearningLiferaySevenId) {
		return getPersistence().fetchByPrimaryKey(LearningLiferaySevenId);
	}

	public static java.util.Map<java.io.Serializable, LearningLiferaySeven> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the learning liferay sevens.
	*
	* @return the learning liferay sevens
	*/
	public static List<LearningLiferaySeven> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<LearningLiferaySeven> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<LearningLiferaySeven> findAll(int start, int end,
		OrderByComparator<LearningLiferaySeven> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<LearningLiferaySeven> findAll(int start, int end,
		OrderByComparator<LearningLiferaySeven> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the learning liferay sevens from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of learning liferay sevens.
	*
	* @return the number of learning liferay sevens
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static LearningLiferaySevenPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LearningLiferaySevenPersistence, LearningLiferaySevenPersistence> _serviceTracker =
		ServiceTrackerFactory.open(LearningLiferaySevenPersistence.class);
}