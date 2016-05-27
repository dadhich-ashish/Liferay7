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

package com.learn.liferay.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.learn.liferay.exception.NoSuchLearningLiferaySevenException;
import com.learn.liferay.model.LearningLiferaySeven;
import com.learn.liferay.model.impl.LearningLiferaySevenImpl;
import com.learn.liferay.model.impl.LearningLiferaySevenModelImpl;
import com.learn.liferay.service.persistence.LearningLiferaySevenPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the learning liferay seven service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LearningLiferaySevenPersistence
 * @see com.learn.liferay.service.persistence.LearningLiferaySevenUtil
 * @generated
 */
@ProviderType
public class LearningLiferaySevenPersistenceImpl extends BasePersistenceImpl<LearningLiferaySeven>
	implements LearningLiferaySevenPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LearningLiferaySevenUtil} to access the learning liferay seven persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LearningLiferaySevenImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
			LearningLiferaySevenModelImpl.FINDER_CACHE_ENABLED,
			LearningLiferaySevenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
			LearningLiferaySevenModelImpl.FINDER_CACHE_ENABLED,
			LearningLiferaySevenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
			LearningLiferaySevenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
			LearningLiferaySevenModelImpl.FINDER_CACHE_ENABLED,
			LearningLiferaySevenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
			LearningLiferaySevenModelImpl.FINDER_CACHE_ENABLED,
			LearningLiferaySevenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			LearningLiferaySevenModelImpl.UUID_COLUMN_BITMASK |
			LearningLiferaySevenModelImpl.FIELD1_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
			LearningLiferaySevenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the learning liferay sevens where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching learning liferay sevens
	 */
	@Override
	public List<LearningLiferaySeven> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LearningLiferaySeven> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<LearningLiferaySeven> findByUuid(String uuid, int start,
		int end, OrderByComparator<LearningLiferaySeven> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<LearningLiferaySeven> findByUuid(String uuid, int start,
		int end, OrderByComparator<LearningLiferaySeven> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<LearningLiferaySeven> list = null;

		if (retrieveFromCache) {
			list = (List<LearningLiferaySeven>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LearningLiferaySeven learningLiferaySeven : list) {
					if (!Objects.equals(uuid, learningLiferaySeven.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_LEARNINGLIFERAYSEVEN_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LearningLiferaySevenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<LearningLiferaySeven>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LearningLiferaySeven>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first learning liferay seven in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching learning liferay seven
	 * @throws NoSuchLearningLiferaySevenException if a matching learning liferay seven could not be found
	 */
	@Override
	public LearningLiferaySeven findByUuid_First(String uuid,
		OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws NoSuchLearningLiferaySevenException {
		LearningLiferaySeven learningLiferaySeven = fetchByUuid_First(uuid,
				orderByComparator);

		if (learningLiferaySeven != null) {
			return learningLiferaySeven;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLearningLiferaySevenException(msg.toString());
	}

	/**
	 * Returns the first learning liferay seven in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	 */
	@Override
	public LearningLiferaySeven fetchByUuid_First(String uuid,
		OrderByComparator<LearningLiferaySeven> orderByComparator) {
		List<LearningLiferaySeven> list = findByUuid(uuid, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last learning liferay seven in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching learning liferay seven
	 * @throws NoSuchLearningLiferaySevenException if a matching learning liferay seven could not be found
	 */
	@Override
	public LearningLiferaySeven findByUuid_Last(String uuid,
		OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws NoSuchLearningLiferaySevenException {
		LearningLiferaySeven learningLiferaySeven = fetchByUuid_Last(uuid,
				orderByComparator);

		if (learningLiferaySeven != null) {
			return learningLiferaySeven;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLearningLiferaySevenException(msg.toString());
	}

	/**
	 * Returns the last learning liferay seven in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	 */
	@Override
	public LearningLiferaySeven fetchByUuid_Last(String uuid,
		OrderByComparator<LearningLiferaySeven> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<LearningLiferaySeven> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LearningLiferaySeven[] findByUuid_PrevAndNext(
		long LearningLiferaySevenId, String uuid,
		OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws NoSuchLearningLiferaySevenException {
		LearningLiferaySeven learningLiferaySeven = findByPrimaryKey(LearningLiferaySevenId);

		Session session = null;

		try {
			session = openSession();

			LearningLiferaySeven[] array = new LearningLiferaySevenImpl[3];

			array[0] = getByUuid_PrevAndNext(session, learningLiferaySeven,
					uuid, orderByComparator, true);

			array[1] = learningLiferaySeven;

			array[2] = getByUuid_PrevAndNext(session, learningLiferaySeven,
					uuid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected LearningLiferaySeven getByUuid_PrevAndNext(Session session,
		LearningLiferaySeven learningLiferaySeven, String uuid,
		OrderByComparator<LearningLiferaySeven> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LEARNINGLIFERAYSEVEN_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(LearningLiferaySevenModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(learningLiferaySeven);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LearningLiferaySeven> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the learning liferay sevens where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (LearningLiferaySeven learningLiferaySeven : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(learningLiferaySeven);
		}
	}

	/**
	 * Returns the number of learning liferay sevens where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching learning liferay sevens
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LEARNINGLIFERAYSEVEN_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "learningLiferaySeven.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "learningLiferaySeven.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(learningLiferaySeven.uuid IS NULL OR learningLiferaySeven.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
			LearningLiferaySevenModelImpl.FINDER_CACHE_ENABLED,
			LearningLiferaySevenImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			LearningLiferaySevenModelImpl.UUID_COLUMN_BITMASK |
			LearningLiferaySevenModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
			LearningLiferaySevenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the learning liferay seven where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchLearningLiferaySevenException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching learning liferay seven
	 * @throws NoSuchLearningLiferaySevenException if a matching learning liferay seven could not be found
	 */
	@Override
	public LearningLiferaySeven findByUUID_G(String uuid, long groupId)
		throws NoSuchLearningLiferaySevenException {
		LearningLiferaySeven learningLiferaySeven = fetchByUUID_G(uuid, groupId);

		if (learningLiferaySeven == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchLearningLiferaySevenException(msg.toString());
		}

		return learningLiferaySeven;
	}

	/**
	 * Returns the learning liferay seven where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	 */
	@Override
	public LearningLiferaySeven fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the learning liferay seven where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	 */
	@Override
	public LearningLiferaySeven fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof LearningLiferaySeven) {
			LearningLiferaySeven learningLiferaySeven = (LearningLiferaySeven)result;

			if (!Objects.equals(uuid, learningLiferaySeven.getUuid()) ||
					(groupId != learningLiferaySeven.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_LEARNINGLIFERAYSEVEN_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<LearningLiferaySeven> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					LearningLiferaySeven learningLiferaySeven = list.get(0);

					result = learningLiferaySeven;

					cacheResult(learningLiferaySeven);

					if ((learningLiferaySeven.getUuid() == null) ||
							!learningLiferaySeven.getUuid().equals(uuid) ||
							(learningLiferaySeven.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, learningLiferaySeven);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (LearningLiferaySeven)result;
		}
	}

	/**
	 * Removes the learning liferay seven where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the learning liferay seven that was removed
	 */
	@Override
	public LearningLiferaySeven removeByUUID_G(String uuid, long groupId)
		throws NoSuchLearningLiferaySevenException {
		LearningLiferaySeven learningLiferaySeven = findByUUID_G(uuid, groupId);

		return remove(learningLiferaySeven);
	}

	/**
	 * Returns the number of learning liferay sevens where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching learning liferay sevens
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LEARNINGLIFERAYSEVEN_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "learningLiferaySeven.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "learningLiferaySeven.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(learningLiferaySeven.uuid IS NULL OR learningLiferaySeven.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "learningLiferaySeven.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
			LearningLiferaySevenModelImpl.FINDER_CACHE_ENABLED,
			LearningLiferaySevenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
			LearningLiferaySevenModelImpl.FINDER_CACHE_ENABLED,
			LearningLiferaySevenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			LearningLiferaySevenModelImpl.UUID_COLUMN_BITMASK |
			LearningLiferaySevenModelImpl.COMPANYID_COLUMN_BITMASK |
			LearningLiferaySevenModelImpl.FIELD1_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
			LearningLiferaySevenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the learning liferay sevens where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching learning liferay sevens
	 */
	@Override
	public List<LearningLiferaySeven> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<LearningLiferaySeven> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<LearningLiferaySeven> findByUuid_C(String uuid, long companyId,
		int start, int end,
		OrderByComparator<LearningLiferaySeven> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<LearningLiferaySeven> findByUuid_C(String uuid, long companyId,
		int start, int end,
		OrderByComparator<LearningLiferaySeven> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<LearningLiferaySeven> list = null;

		if (retrieveFromCache) {
			list = (List<LearningLiferaySeven>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LearningLiferaySeven learningLiferaySeven : list) {
					if (!Objects.equals(uuid, learningLiferaySeven.getUuid()) ||
							(companyId != learningLiferaySeven.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_LEARNINGLIFERAYSEVEN_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LearningLiferaySevenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<LearningLiferaySeven>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LearningLiferaySeven>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public LearningLiferaySeven findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws NoSuchLearningLiferaySevenException {
		LearningLiferaySeven learningLiferaySeven = fetchByUuid_C_First(uuid,
				companyId, orderByComparator);

		if (learningLiferaySeven != null) {
			return learningLiferaySeven;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLearningLiferaySevenException(msg.toString());
	}

	/**
	 * Returns the first learning liferay seven in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	 */
	@Override
	public LearningLiferaySeven fetchByUuid_C_First(String uuid,
		long companyId,
		OrderByComparator<LearningLiferaySeven> orderByComparator) {
		List<LearningLiferaySeven> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LearningLiferaySeven findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws NoSuchLearningLiferaySevenException {
		LearningLiferaySeven learningLiferaySeven = fetchByUuid_C_Last(uuid,
				companyId, orderByComparator);

		if (learningLiferaySeven != null) {
			return learningLiferaySeven;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLearningLiferaySevenException(msg.toString());
	}

	/**
	 * Returns the last learning liferay seven in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	 */
	@Override
	public LearningLiferaySeven fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<LearningLiferaySeven> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<LearningLiferaySeven> list = findByUuid_C(uuid, companyId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LearningLiferaySeven[] findByUuid_C_PrevAndNext(
		long LearningLiferaySevenId, String uuid, long companyId,
		OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws NoSuchLearningLiferaySevenException {
		LearningLiferaySeven learningLiferaySeven = findByPrimaryKey(LearningLiferaySevenId);

		Session session = null;

		try {
			session = openSession();

			LearningLiferaySeven[] array = new LearningLiferaySevenImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, learningLiferaySeven,
					uuid, companyId, orderByComparator, true);

			array[1] = learningLiferaySeven;

			array[2] = getByUuid_C_PrevAndNext(session, learningLiferaySeven,
					uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected LearningLiferaySeven getByUuid_C_PrevAndNext(Session session,
		LearningLiferaySeven learningLiferaySeven, String uuid, long companyId,
		OrderByComparator<LearningLiferaySeven> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_LEARNINGLIFERAYSEVEN_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(LearningLiferaySevenModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(learningLiferaySeven);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LearningLiferaySeven> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the learning liferay sevens where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (LearningLiferaySeven learningLiferaySeven : findByUuid_C(uuid,
				companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(learningLiferaySeven);
		}
	}

	/**
	 * Returns the number of learning liferay sevens where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching learning liferay sevens
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LEARNINGLIFERAYSEVEN_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "learningLiferaySeven.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "learningLiferaySeven.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(learningLiferaySeven.uuid IS NULL OR learningLiferaySeven.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "learningLiferaySeven.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FIELD2 = new FinderPath(LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
			LearningLiferaySevenModelImpl.FINDER_CACHE_ENABLED,
			LearningLiferaySevenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByField2",
			new String[] {
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD2 =
		new FinderPath(LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
			LearningLiferaySevenModelImpl.FINDER_CACHE_ENABLED,
			LearningLiferaySevenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByField2",
			new String[] { Boolean.class.getName() },
			LearningLiferaySevenModelImpl.FIELD2_COLUMN_BITMASK |
			LearningLiferaySevenModelImpl.FIELD1_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FIELD2 = new FinderPath(LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
			LearningLiferaySevenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByField2",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns all the learning liferay sevens where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the matching learning liferay sevens
	 */
	@Override
	public List<LearningLiferaySeven> findByField2(boolean field2) {
		return findByField2(field2, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LearningLiferaySeven> findByField2(boolean field2, int start,
		int end) {
		return findByField2(field2, start, end, null);
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
	@Override
	public List<LearningLiferaySeven> findByField2(boolean field2, int start,
		int end, OrderByComparator<LearningLiferaySeven> orderByComparator) {
		return findByField2(field2, start, end, orderByComparator, true);
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
	@Override
	public List<LearningLiferaySeven> findByField2(boolean field2, int start,
		int end, OrderByComparator<LearningLiferaySeven> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD2;
			finderArgs = new Object[] { field2 };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FIELD2;
			finderArgs = new Object[] { field2, start, end, orderByComparator };
		}

		List<LearningLiferaySeven> list = null;

		if (retrieveFromCache) {
			list = (List<LearningLiferaySeven>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LearningLiferaySeven learningLiferaySeven : list) {
					if ((field2 != learningLiferaySeven.getField2())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_LEARNINGLIFERAYSEVEN_WHERE);

			query.append(_FINDER_COLUMN_FIELD2_FIELD2_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LearningLiferaySevenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(field2);

				if (!pagination) {
					list = (List<LearningLiferaySeven>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LearningLiferaySeven>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first learning liferay seven in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching learning liferay seven
	 * @throws NoSuchLearningLiferaySevenException if a matching learning liferay seven could not be found
	 */
	@Override
	public LearningLiferaySeven findByField2_First(boolean field2,
		OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws NoSuchLearningLiferaySevenException {
		LearningLiferaySeven learningLiferaySeven = fetchByField2_First(field2,
				orderByComparator);

		if (learningLiferaySeven != null) {
			return learningLiferaySeven;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("field2=");
		msg.append(field2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLearningLiferaySevenException(msg.toString());
	}

	/**
	 * Returns the first learning liferay seven in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	 */
	@Override
	public LearningLiferaySeven fetchByField2_First(boolean field2,
		OrderByComparator<LearningLiferaySeven> orderByComparator) {
		List<LearningLiferaySeven> list = findByField2(field2, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last learning liferay seven in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching learning liferay seven
	 * @throws NoSuchLearningLiferaySevenException if a matching learning liferay seven could not be found
	 */
	@Override
	public LearningLiferaySeven findByField2_Last(boolean field2,
		OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws NoSuchLearningLiferaySevenException {
		LearningLiferaySeven learningLiferaySeven = fetchByField2_Last(field2,
				orderByComparator);

		if (learningLiferaySeven != null) {
			return learningLiferaySeven;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("field2=");
		msg.append(field2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLearningLiferaySevenException(msg.toString());
	}

	/**
	 * Returns the last learning liferay seven in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	 */
	@Override
	public LearningLiferaySeven fetchByField2_Last(boolean field2,
		OrderByComparator<LearningLiferaySeven> orderByComparator) {
		int count = countByField2(field2);

		if (count == 0) {
			return null;
		}

		List<LearningLiferaySeven> list = findByField2(field2, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LearningLiferaySeven[] findByField2_PrevAndNext(
		long LearningLiferaySevenId, boolean field2,
		OrderByComparator<LearningLiferaySeven> orderByComparator)
		throws NoSuchLearningLiferaySevenException {
		LearningLiferaySeven learningLiferaySeven = findByPrimaryKey(LearningLiferaySevenId);

		Session session = null;

		try {
			session = openSession();

			LearningLiferaySeven[] array = new LearningLiferaySevenImpl[3];

			array[0] = getByField2_PrevAndNext(session, learningLiferaySeven,
					field2, orderByComparator, true);

			array[1] = learningLiferaySeven;

			array[2] = getByField2_PrevAndNext(session, learningLiferaySeven,
					field2, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected LearningLiferaySeven getByField2_PrevAndNext(Session session,
		LearningLiferaySeven learningLiferaySeven, boolean field2,
		OrderByComparator<LearningLiferaySeven> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LEARNINGLIFERAYSEVEN_WHERE);

		query.append(_FINDER_COLUMN_FIELD2_FIELD2_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(LearningLiferaySevenModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(field2);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(learningLiferaySeven);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LearningLiferaySeven> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the learning liferay sevens where field2 = &#63; from the database.
	 *
	 * @param field2 the field2
	 */
	@Override
	public void removeByField2(boolean field2) {
		for (LearningLiferaySeven learningLiferaySeven : findByField2(field2,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(learningLiferaySeven);
		}
	}

	/**
	 * Returns the number of learning liferay sevens where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the number of matching learning liferay sevens
	 */
	@Override
	public int countByField2(boolean field2) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FIELD2;

		Object[] finderArgs = new Object[] { field2 };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LEARNINGLIFERAYSEVEN_WHERE);

			query.append(_FINDER_COLUMN_FIELD2_FIELD2_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(field2);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_FIELD2_FIELD2_2 = "learningLiferaySeven.field2 = ?";

	public LearningLiferaySevenPersistenceImpl() {
		setModelClass(LearningLiferaySeven.class);
	}

	/**
	 * Caches the learning liferay seven in the entity cache if it is enabled.
	 *
	 * @param learningLiferaySeven the learning liferay seven
	 */
	@Override
	public void cacheResult(LearningLiferaySeven learningLiferaySeven) {
		entityCache.putResult(LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
			LearningLiferaySevenImpl.class,
			learningLiferaySeven.getPrimaryKey(), learningLiferaySeven);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] {
				learningLiferaySeven.getUuid(),
				learningLiferaySeven.getGroupId()
			}, learningLiferaySeven);

		learningLiferaySeven.resetOriginalValues();
	}

	/**
	 * Caches the learning liferay sevens in the entity cache if it is enabled.
	 *
	 * @param learningLiferaySevens the learning liferay sevens
	 */
	@Override
	public void cacheResult(List<LearningLiferaySeven> learningLiferaySevens) {
		for (LearningLiferaySeven learningLiferaySeven : learningLiferaySevens) {
			if (entityCache.getResult(
						LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
						LearningLiferaySevenImpl.class,
						learningLiferaySeven.getPrimaryKey()) == null) {
				cacheResult(learningLiferaySeven);
			}
			else {
				learningLiferaySeven.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all learning liferay sevens.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(LearningLiferaySevenImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the learning liferay seven.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LearningLiferaySeven learningLiferaySeven) {
		entityCache.removeResult(LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
			LearningLiferaySevenImpl.class, learningLiferaySeven.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((LearningLiferaySevenModelImpl)learningLiferaySeven);
	}

	@Override
	public void clearCache(List<LearningLiferaySeven> learningLiferaySevens) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LearningLiferaySeven learningLiferaySeven : learningLiferaySevens) {
			entityCache.removeResult(LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
				LearningLiferaySevenImpl.class,
				learningLiferaySeven.getPrimaryKey());

			clearUniqueFindersCache((LearningLiferaySevenModelImpl)learningLiferaySeven);
		}
	}

	protected void cacheUniqueFindersCache(
		LearningLiferaySevenModelImpl learningLiferaySevenModelImpl,
		boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					learningLiferaySevenModelImpl.getUuid(),
					learningLiferaySevenModelImpl.getGroupId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				learningLiferaySevenModelImpl);
		}
		else {
			if ((learningLiferaySevenModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						learningLiferaySevenModelImpl.getUuid(),
						learningLiferaySevenModelImpl.getGroupId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					learningLiferaySevenModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		LearningLiferaySevenModelImpl learningLiferaySevenModelImpl) {
		Object[] args = new Object[] {
				learningLiferaySevenModelImpl.getUuid(),
				learningLiferaySevenModelImpl.getGroupId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((learningLiferaySevenModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					learningLiferaySevenModelImpl.getOriginalUuid(),
					learningLiferaySevenModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new learning liferay seven with the primary key. Does not add the learning liferay seven to the database.
	 *
	 * @param LearningLiferaySevenId the primary key for the new learning liferay seven
	 * @return the new learning liferay seven
	 */
	@Override
	public LearningLiferaySeven create(long LearningLiferaySevenId) {
		LearningLiferaySeven learningLiferaySeven = new LearningLiferaySevenImpl();

		learningLiferaySeven.setNew(true);
		learningLiferaySeven.setPrimaryKey(LearningLiferaySevenId);

		String uuid = PortalUUIDUtil.generate();

		learningLiferaySeven.setUuid(uuid);

		learningLiferaySeven.setCompanyId(companyProvider.getCompanyId());

		return learningLiferaySeven;
	}

	/**
	 * Removes the learning liferay seven with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param LearningLiferaySevenId the primary key of the learning liferay seven
	 * @return the learning liferay seven that was removed
	 * @throws NoSuchLearningLiferaySevenException if a learning liferay seven with the primary key could not be found
	 */
	@Override
	public LearningLiferaySeven remove(long LearningLiferaySevenId)
		throws NoSuchLearningLiferaySevenException {
		return remove((Serializable)LearningLiferaySevenId);
	}

	/**
	 * Removes the learning liferay seven with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the learning liferay seven
	 * @return the learning liferay seven that was removed
	 * @throws NoSuchLearningLiferaySevenException if a learning liferay seven with the primary key could not be found
	 */
	@Override
	public LearningLiferaySeven remove(Serializable primaryKey)
		throws NoSuchLearningLiferaySevenException {
		Session session = null;

		try {
			session = openSession();

			LearningLiferaySeven learningLiferaySeven = (LearningLiferaySeven)session.get(LearningLiferaySevenImpl.class,
					primaryKey);

			if (learningLiferaySeven == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLearningLiferaySevenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(learningLiferaySeven);
		}
		catch (NoSuchLearningLiferaySevenException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected LearningLiferaySeven removeImpl(
		LearningLiferaySeven learningLiferaySeven) {
		learningLiferaySeven = toUnwrappedModel(learningLiferaySeven);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(learningLiferaySeven)) {
				learningLiferaySeven = (LearningLiferaySeven)session.get(LearningLiferaySevenImpl.class,
						learningLiferaySeven.getPrimaryKeyObj());
			}

			if (learningLiferaySeven != null) {
				session.delete(learningLiferaySeven);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (learningLiferaySeven != null) {
			clearCache(learningLiferaySeven);
		}

		return learningLiferaySeven;
	}

	@Override
	public LearningLiferaySeven updateImpl(
		LearningLiferaySeven learningLiferaySeven) {
		learningLiferaySeven = toUnwrappedModel(learningLiferaySeven);

		boolean isNew = learningLiferaySeven.isNew();

		LearningLiferaySevenModelImpl learningLiferaySevenModelImpl = (LearningLiferaySevenModelImpl)learningLiferaySeven;

		if (Validator.isNull(learningLiferaySeven.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			learningLiferaySeven.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (learningLiferaySeven.getCreateDate() == null)) {
			if (serviceContext == null) {
				learningLiferaySeven.setCreateDate(now);
			}
			else {
				learningLiferaySeven.setCreateDate(serviceContext.getCreateDate(
						now));
			}
		}

		if (!learningLiferaySevenModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				learningLiferaySeven.setModifiedDate(now);
			}
			else {
				learningLiferaySeven.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (learningLiferaySeven.isNew()) {
				session.save(learningLiferaySeven);

				learningLiferaySeven.setNew(false);
			}
			else {
				learningLiferaySeven = (LearningLiferaySeven)session.merge(learningLiferaySeven);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !LearningLiferaySevenModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((learningLiferaySevenModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						learningLiferaySevenModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { learningLiferaySevenModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((learningLiferaySevenModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						learningLiferaySevenModelImpl.getOriginalUuid(),
						learningLiferaySevenModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						learningLiferaySevenModelImpl.getUuid(),
						learningLiferaySevenModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((learningLiferaySevenModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD2.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						learningLiferaySevenModelImpl.getOriginalField2()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FIELD2, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD2,
					args);

				args = new Object[] { learningLiferaySevenModelImpl.getField2() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FIELD2, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD2,
					args);
			}
		}

		entityCache.putResult(LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
			LearningLiferaySevenImpl.class,
			learningLiferaySeven.getPrimaryKey(), learningLiferaySeven, false);

		clearUniqueFindersCache(learningLiferaySevenModelImpl);
		cacheUniqueFindersCache(learningLiferaySevenModelImpl, isNew);

		learningLiferaySeven.resetOriginalValues();

		return learningLiferaySeven;
	}

	protected LearningLiferaySeven toUnwrappedModel(
		LearningLiferaySeven learningLiferaySeven) {
		if (learningLiferaySeven instanceof LearningLiferaySevenImpl) {
			return learningLiferaySeven;
		}

		LearningLiferaySevenImpl learningLiferaySevenImpl = new LearningLiferaySevenImpl();

		learningLiferaySevenImpl.setNew(learningLiferaySeven.isNew());
		learningLiferaySevenImpl.setPrimaryKey(learningLiferaySeven.getPrimaryKey());

		learningLiferaySevenImpl.setUuid(learningLiferaySeven.getUuid());
		learningLiferaySevenImpl.setLearningLiferaySevenId(learningLiferaySeven.getLearningLiferaySevenId());
		learningLiferaySevenImpl.setGroupId(learningLiferaySeven.getGroupId());
		learningLiferaySevenImpl.setCompanyId(learningLiferaySeven.getCompanyId());
		learningLiferaySevenImpl.setUserId(learningLiferaySeven.getUserId());
		learningLiferaySevenImpl.setUserName(learningLiferaySeven.getUserName());
		learningLiferaySevenImpl.setCreateDate(learningLiferaySeven.getCreateDate());
		learningLiferaySevenImpl.setModifiedDate(learningLiferaySeven.getModifiedDate());
		learningLiferaySevenImpl.setField1(learningLiferaySeven.getField1());
		learningLiferaySevenImpl.setField2(learningLiferaySeven.isField2());
		learningLiferaySevenImpl.setField3(learningLiferaySeven.getField3());
		learningLiferaySevenImpl.setField4(learningLiferaySeven.getField4());
		learningLiferaySevenImpl.setField5(learningLiferaySeven.getField5());

		return learningLiferaySevenImpl;
	}

	/**
	 * Returns the learning liferay seven with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the learning liferay seven
	 * @return the learning liferay seven
	 * @throws NoSuchLearningLiferaySevenException if a learning liferay seven with the primary key could not be found
	 */
	@Override
	public LearningLiferaySeven findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLearningLiferaySevenException {
		LearningLiferaySeven learningLiferaySeven = fetchByPrimaryKey(primaryKey);

		if (learningLiferaySeven == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLearningLiferaySevenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return learningLiferaySeven;
	}

	/**
	 * Returns the learning liferay seven with the primary key or throws a {@link NoSuchLearningLiferaySevenException} if it could not be found.
	 *
	 * @param LearningLiferaySevenId the primary key of the learning liferay seven
	 * @return the learning liferay seven
	 * @throws NoSuchLearningLiferaySevenException if a learning liferay seven with the primary key could not be found
	 */
	@Override
	public LearningLiferaySeven findByPrimaryKey(long LearningLiferaySevenId)
		throws NoSuchLearningLiferaySevenException {
		return findByPrimaryKey((Serializable)LearningLiferaySevenId);
	}

	/**
	 * Returns the learning liferay seven with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the learning liferay seven
	 * @return the learning liferay seven, or <code>null</code> if a learning liferay seven with the primary key could not be found
	 */
	@Override
	public LearningLiferaySeven fetchByPrimaryKey(Serializable primaryKey) {
		LearningLiferaySeven learningLiferaySeven = (LearningLiferaySeven)entityCache.getResult(LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
				LearningLiferaySevenImpl.class, primaryKey);

		if (learningLiferaySeven == _nullLearningLiferaySeven) {
			return null;
		}

		if (learningLiferaySeven == null) {
			Session session = null;

			try {
				session = openSession();

				learningLiferaySeven = (LearningLiferaySeven)session.get(LearningLiferaySevenImpl.class,
						primaryKey);

				if (learningLiferaySeven != null) {
					cacheResult(learningLiferaySeven);
				}
				else {
					entityCache.putResult(LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
						LearningLiferaySevenImpl.class, primaryKey,
						_nullLearningLiferaySeven);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
					LearningLiferaySevenImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return learningLiferaySeven;
	}

	/**
	 * Returns the learning liferay seven with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param LearningLiferaySevenId the primary key of the learning liferay seven
	 * @return the learning liferay seven, or <code>null</code> if a learning liferay seven with the primary key could not be found
	 */
	@Override
	public LearningLiferaySeven fetchByPrimaryKey(long LearningLiferaySevenId) {
		return fetchByPrimaryKey((Serializable)LearningLiferaySevenId);
	}

	@Override
	public Map<Serializable, LearningLiferaySeven> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, LearningLiferaySeven> map = new HashMap<Serializable, LearningLiferaySeven>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			LearningLiferaySeven learningLiferaySeven = fetchByPrimaryKey(primaryKey);

			if (learningLiferaySeven != null) {
				map.put(primaryKey, learningLiferaySeven);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			LearningLiferaySeven learningLiferaySeven = (LearningLiferaySeven)entityCache.getResult(LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
					LearningLiferaySevenImpl.class, primaryKey);

			if (learningLiferaySeven == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, learningLiferaySeven);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_LEARNINGLIFERAYSEVEN_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (LearningLiferaySeven learningLiferaySeven : (List<LearningLiferaySeven>)q.list()) {
				map.put(learningLiferaySeven.getPrimaryKeyObj(),
					learningLiferaySeven);

				cacheResult(learningLiferaySeven);

				uncachedPrimaryKeys.remove(learningLiferaySeven.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(LearningLiferaySevenModelImpl.ENTITY_CACHE_ENABLED,
					LearningLiferaySevenImpl.class, primaryKey,
					_nullLearningLiferaySeven);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the learning liferay sevens.
	 *
	 * @return the learning liferay sevens
	 */
	@Override
	public List<LearningLiferaySeven> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LearningLiferaySeven> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<LearningLiferaySeven> findAll(int start, int end,
		OrderByComparator<LearningLiferaySeven> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<LearningLiferaySeven> findAll(int start, int end,
		OrderByComparator<LearningLiferaySeven> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<LearningLiferaySeven> list = null;

		if (retrieveFromCache) {
			list = (List<LearningLiferaySeven>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_LEARNINGLIFERAYSEVEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LEARNINGLIFERAYSEVEN;

				if (pagination) {
					sql = sql.concat(LearningLiferaySevenModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LearningLiferaySeven>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LearningLiferaySeven>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the learning liferay sevens from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (LearningLiferaySeven learningLiferaySeven : findAll()) {
			remove(learningLiferaySeven);
		}
	}

	/**
	 * Returns the number of learning liferay sevens.
	 *
	 * @return the number of learning liferay sevens
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LEARNINGLIFERAYSEVEN);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return LearningLiferaySevenModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the learning liferay seven persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(LearningLiferaySevenImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_LEARNINGLIFERAYSEVEN = "SELECT learningLiferaySeven FROM LearningLiferaySeven learningLiferaySeven";
	private static final String _SQL_SELECT_LEARNINGLIFERAYSEVEN_WHERE_PKS_IN = "SELECT learningLiferaySeven FROM LearningLiferaySeven learningLiferaySeven WHERE LearningLiferaySevenId IN (";
	private static final String _SQL_SELECT_LEARNINGLIFERAYSEVEN_WHERE = "SELECT learningLiferaySeven FROM LearningLiferaySeven learningLiferaySeven WHERE ";
	private static final String _SQL_COUNT_LEARNINGLIFERAYSEVEN = "SELECT COUNT(learningLiferaySeven) FROM LearningLiferaySeven learningLiferaySeven";
	private static final String _SQL_COUNT_LEARNINGLIFERAYSEVEN_WHERE = "SELECT COUNT(learningLiferaySeven) FROM LearningLiferaySeven learningLiferaySeven WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "learningLiferaySeven.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LearningLiferaySeven exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LearningLiferaySeven exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(LearningLiferaySevenPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
	private static final LearningLiferaySeven _nullLearningLiferaySeven = new LearningLiferaySevenImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LearningLiferaySeven> toCacheModel() {
				return _nullLearningLiferaySevenCacheModel;
			}
		};

	private static final CacheModel<LearningLiferaySeven> _nullLearningLiferaySevenCacheModel =
		new CacheModel<LearningLiferaySeven>() {
			@Override
			public LearningLiferaySeven toEntityModel() {
				return _nullLearningLiferaySeven;
			}
		};
}