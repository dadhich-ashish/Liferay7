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

package com.learn.liferay.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LearningLiferaySevenLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LearningLiferaySevenLocalService
 * @generated
 */
@ProviderType
public class LearningLiferaySevenLocalServiceWrapper
	implements LearningLiferaySevenLocalService,
		ServiceWrapper<LearningLiferaySevenLocalService> {
	public LearningLiferaySevenLocalServiceWrapper(
		LearningLiferaySevenLocalService learningLiferaySevenLocalService) {
		_learningLiferaySevenLocalService = learningLiferaySevenLocalService;
	}

	/**
	* Adds the learning liferay seven to the database. Also notifies the appropriate model listeners.
	*
	* @param learningLiferaySeven the learning liferay seven
	* @return the learning liferay seven that was added
	*/
	@Override
	public com.learn.liferay.model.LearningLiferaySeven addLearningLiferaySeven(
		com.learn.liferay.model.LearningLiferaySeven learningLiferaySeven) {
		return _learningLiferaySevenLocalService.addLearningLiferaySeven(learningLiferaySeven);
	}

	/**
	* Creates a new learning liferay seven with the primary key. Does not add the learning liferay seven to the database.
	*
	* @param LearningLiferaySevenId the primary key for the new learning liferay seven
	* @return the new learning liferay seven
	*/
	@Override
	public com.learn.liferay.model.LearningLiferaySeven createLearningLiferaySeven(
		long LearningLiferaySevenId) {
		return _learningLiferaySevenLocalService.createLearningLiferaySeven(LearningLiferaySevenId);
	}

	/**
	* Deletes the learning liferay seven from the database. Also notifies the appropriate model listeners.
	*
	* @param learningLiferaySeven the learning liferay seven
	* @return the learning liferay seven that was removed
	*/
	@Override
	public com.learn.liferay.model.LearningLiferaySeven deleteLearningLiferaySeven(
		com.learn.liferay.model.LearningLiferaySeven learningLiferaySeven) {
		return _learningLiferaySevenLocalService.deleteLearningLiferaySeven(learningLiferaySeven);
	}

	/**
	* Deletes the learning liferay seven with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param LearningLiferaySevenId the primary key of the learning liferay seven
	* @return the learning liferay seven that was removed
	* @throws PortalException if a learning liferay seven with the primary key could not be found
	*/
	@Override
	public com.learn.liferay.model.LearningLiferaySeven deleteLearningLiferaySeven(
		long LearningLiferaySevenId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _learningLiferaySevenLocalService.deleteLearningLiferaySeven(LearningLiferaySevenId);
	}

	@Override
	public com.learn.liferay.model.LearningLiferaySeven fetchLearningLiferaySeven(
		long LearningLiferaySevenId) {
		return _learningLiferaySevenLocalService.fetchLearningLiferaySeven(LearningLiferaySevenId);
	}

	/**
	* Returns the learning liferay seven matching the UUID and group.
	*
	* @param uuid the learning liferay seven's UUID
	* @param groupId the primary key of the group
	* @return the matching learning liferay seven, or <code>null</code> if a matching learning liferay seven could not be found
	*/
	@Override
	public com.learn.liferay.model.LearningLiferaySeven fetchLearningLiferaySevenByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _learningLiferaySevenLocalService.fetchLearningLiferaySevenByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the learning liferay seven with the primary key.
	*
	* @param LearningLiferaySevenId the primary key of the learning liferay seven
	* @return the learning liferay seven
	* @throws PortalException if a learning liferay seven with the primary key could not be found
	*/
	@Override
	public com.learn.liferay.model.LearningLiferaySeven getLearningLiferaySeven(
		long LearningLiferaySevenId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _learningLiferaySevenLocalService.getLearningLiferaySeven(LearningLiferaySevenId);
	}

	/**
	* Returns the learning liferay seven matching the UUID and group.
	*
	* @param uuid the learning liferay seven's UUID
	* @param groupId the primary key of the group
	* @return the matching learning liferay seven
	* @throws PortalException if a matching learning liferay seven could not be found
	*/
	@Override
	public com.learn.liferay.model.LearningLiferaySeven getLearningLiferaySevenByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _learningLiferaySevenLocalService.getLearningLiferaySevenByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the learning liferay seven in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param learningLiferaySeven the learning liferay seven
	* @return the learning liferay seven that was updated
	*/
	@Override
	public com.learn.liferay.model.LearningLiferaySeven updateLearningLiferaySeven(
		com.learn.liferay.model.LearningLiferaySeven learningLiferaySeven) {
		return _learningLiferaySevenLocalService.updateLearningLiferaySeven(learningLiferaySeven);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _learningLiferaySevenLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _learningLiferaySevenLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _learningLiferaySevenLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _learningLiferaySevenLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _learningLiferaySevenLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _learningLiferaySevenLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of learning liferay sevens.
	*
	* @return the number of learning liferay sevens
	*/
	@Override
	public int getLearningLiferaySevensCount() {
		return _learningLiferaySevenLocalService.getLearningLiferaySevensCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _learningLiferaySevenLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _learningLiferaySevenLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.learn.liferay.model.impl.LearningLiferaySevenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _learningLiferaySevenLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.learn.liferay.model.impl.LearningLiferaySevenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _learningLiferaySevenLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the learning liferay sevens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.learn.liferay.model.impl.LearningLiferaySevenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of learning liferay sevens
	* @param end the upper bound of the range of learning liferay sevens (not inclusive)
	* @return the range of learning liferay sevens
	*/
	@Override
	public java.util.List<com.learn.liferay.model.LearningLiferaySeven> getLearningLiferaySevens(
		int start, int end) {
		return _learningLiferaySevenLocalService.getLearningLiferaySevens(start,
			end);
	}

	/**
	* Returns all the learning liferay sevens matching the UUID and company.
	*
	* @param uuid the UUID of the learning liferay sevens
	* @param companyId the primary key of the company
	* @return the matching learning liferay sevens, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.learn.liferay.model.LearningLiferaySeven> getLearningLiferaySevensByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _learningLiferaySevenLocalService.getLearningLiferaySevensByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of learning liferay sevens matching the UUID and company.
	*
	* @param uuid the UUID of the learning liferay sevens
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of learning liferay sevens
	* @param end the upper bound of the range of learning liferay sevens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching learning liferay sevens, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.learn.liferay.model.LearningLiferaySeven> getLearningLiferaySevensByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.learn.liferay.model.LearningLiferaySeven> orderByComparator) {
		return _learningLiferaySevenLocalService.getLearningLiferaySevensByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _learningLiferaySevenLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _learningLiferaySevenLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public LearningLiferaySevenLocalService getWrappedService() {
		return _learningLiferaySevenLocalService;
	}

	@Override
	public void setWrappedService(
		LearningLiferaySevenLocalService learningLiferaySevenLocalService) {
		_learningLiferaySevenLocalService = learningLiferaySevenLocalService;
	}

	private LearningLiferaySevenLocalService _learningLiferaySevenLocalService;
}