package com.learn.liferay;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserGroupRole;
import com.liferay.portal.kernel.search.BaseModelSearchResult;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.util.KeyValuePair;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
	},
	service = UserLocalService.class
)
public class LearnServiceComponentservice implements UserLocalService {

	@Override
	public User addDefaultAdminUser(long companyId, String screenName, String emailAddress, Locale locale,
			String firstName, String middleName, String lastName) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addDefaultGroups(long userId) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addDefaultRoles(long userId) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addDefaultUserGroups(long userId) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addGroupUser(long groupId, User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addGroupUser(long groupId, long userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addGroupUsers(long groupId, List<User> Users) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addGroupUsers(long groupId, long[] userIds) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addOrganizationUser(long organizationId, User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addOrganizationUser(long organizationId, long userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addOrganizationUsers(long organizationId, List<User> Users) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addOrganizationUsers(long organizationId, long[] userIds) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPasswordPolicyUsers(long passwordPolicyId, long[] userIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addRoleUser(long roleId, User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addRoleUser(long roleId, long userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addRoleUsers(long roleId, List<User> Users) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addRoleUsers(long roleId, long[] userIds) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTeamUser(long teamId, User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTeamUser(long teamId, long userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTeamUsers(long teamId, List<User> Users) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTeamUsers(long teamId, long[] userIds) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User addUser(long creatorUserId, long companyId, boolean autoPassword, String password1, String password2,
			boolean autoScreenName, String screenName, String emailAddress, long facebookId, String openId,
			Locale locale, String firstName, String middleName, String lastName, long prefixId, long suffixId,
			boolean male, int birthdayMonth, int birthdayDay, int birthdayYear, String jobTitle, long[] groupIds,
			long[] organizationIds, long[] roleIds, long[] userGroupIds, boolean sendEmail,
			ServiceContext serviceContext) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUserGroupUser(long userGroupId, User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addUserGroupUser(long userGroupId, long userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addUserGroupUsers(long userGroupId, List<User> Users) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addUserGroupUsers(long userGroupId, long[] userIds) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User addUserWithWorkflow(long creatorUserId, long companyId, boolean autoPassword, String password1,
			String password2, boolean autoScreenName, String screenName, String emailAddress, long facebookId,
			String openId, Locale locale, String firstName, String middleName, String lastName, long prefixId,
			long suffixId, boolean male, int birthdayMonth, int birthdayDay, int birthdayYear, String jobTitle,
			long[] groupIds, long[] organizationIds, long[] roleIds, long[] userGroupIds, boolean sendEmail,
			ServiceContext serviceContext) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int authenticateByEmailAddress(long companyId, String emailAddress, String password,
			Map<String, String[]> headerMap, Map<String, String[]> parameterMap, Map<String, Object> resultsMap)
			throws PortalException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int authenticateByScreenName(long companyId, String screenName, String password,
			Map<String, String[]> headerMap, Map<String, String[]> parameterMap, Map<String, Object> resultsMap)
			throws PortalException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int authenticateByUserId(long companyId, long userId, String password, Map<String, String[]> headerMap,
			Map<String, String[]> parameterMap, Map<String, Object> resultsMap) throws PortalException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long authenticateForBasic(long companyId, String authType, String login, String password)
			throws PortalException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long authenticateForDigest(long companyId, String username, String realm, String nonce, String method,
			String uri, String response) throws PortalException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean authenticateForJAAS(long userId, String encPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void checkLockout(User user) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkLoginFailure(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkLoginFailureByEmailAddress(long companyId, String emailAddress) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkLoginFailureById(long userId) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkLoginFailureByScreenName(long companyId, String screenName) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkPasswordExpired(User user) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearGroupUsers(long groupId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearOrganizationUsers(long organizationId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearRoleUsers(long roleId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearTeamUsers(long teamId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearUserGroupUsers(long userGroupId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void completeUserRegistration(User user, ServiceContext serviceContext) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User createUser(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public KeyValuePair decryptUserId(long companyId, String name, String password) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteGroupUser(long groupId, User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGroupUser(long groupId, long userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGroupUsers(long groupId, List<User> Users) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGroupUsers(long groupId, long[] userIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrganizationUser(long organizationId, User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrganizationUser(long organizationId, long userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrganizationUsers(long organizationId, List<User> Users) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrganizationUsers(long organizationId, long[] userIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePortrait(long userId) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRoleUser(long roleId, User user) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRoleUser(long roleId, long userId) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRoleUsers(long roleId, List<User> Users) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRoleUsers(long roleId, long[] userIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTeamUser(long teamId, User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTeamUser(long teamId, long userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTeamUsers(long teamId, List<User> Users) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTeamUsers(long teamId, long[] userIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User deleteUser(User user) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUser(long userId) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserGroupUser(long userGroupId, User user) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserGroupUser(long userGroupId, long userId) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserGroupUsers(long userGroupId, List<User> Users) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserGroupUsers(long userGroupId, long[] userIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DynamicQuery dynamicQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<T> orderByComparator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery, Projection projection) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String encryptUserId(String name) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User fetchUser(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User fetchUserByContactId(long contactId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User fetchUserByEmailAddress(long companyId, String emailAddress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User fetchUserByFacebookId(long companyId, long facebookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User fetchUserByGoogleUserId(long companyId, String googleUserId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User fetchUserById(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User fetchUserByOpenId(long companyId, String openId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User fetchUserByPortraitId(long portraitId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User fetchUserByScreenName(long companyId, String screenName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User fetchUserByUuidAndCompanyId(String uuid, long companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getCompanyUsers(long companyId, int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCompanyUsersCount(long companyId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User getDefaultUser(long companyId) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getDefaultUserId(long companyId) throws PortalException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(PortletDataContext portletDataContext) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long[] getGroupPrimaryKeys(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long[] getGroupUserIds(long groupId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getGroupUsers(long groupId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getGroupUsers(long groupId, int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getGroupUsers(long groupId, int start, int end, OrderByComparator<User> orderByComparator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getGroupUsersCount(long groupId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getGroupUsersCount(long groupId, int status) throws PortalException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getInheritedRoleUsers(long roleId, int start, int end, OrderByComparator<User> obc)
			throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getNoAnnouncementsDeliveries(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getNoContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getNoGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getOSGiServiceIdentifier() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long[] getOrganizationPrimaryKeys(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long[] getOrganizationUserIds(long organizationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getOrganizationUsers(long organizationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getOrganizationUsers(long organizationId, int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getOrganizationUsers(long organizationId, int start, int end,
			OrderByComparator<User> orderByComparator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getOrganizationUsersCount(long organizationId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getOrganizationUsersCount(long organizationId, int status) throws PortalException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long[] getRolePrimaryKeys(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long[] getRoleUserIds(long roleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getRoleUsers(long roleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getRoleUsers(long roleId, int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getRoleUsers(long roleId, int start, int end, OrderByComparator<User> orderByComparator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRoleUsersCount(long roleId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRoleUsersCount(long roleId, int status) throws PortalException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> getSocialUsers(long userId, int socialRelationType, String socialRelationTypeComparator,
			int start, int end, OrderByComparator<User> obc) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getSocialUsers(long userId, int socialRelationType, int start, int end,
			OrderByComparator<User> obc) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getSocialUsers(long userId, int start, int end, OrderByComparator<User> obc)
			throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getSocialUsers(long userId1, long userId2, int socialRelationType, int start, int end,
			OrderByComparator<User> obc) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getSocialUsers(long userId1, long userId2, int start, int end, OrderByComparator<User> obc)
			throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSocialUsersCount(long userId) throws PortalException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSocialUsersCount(long userId, int socialRelationType) throws PortalException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSocialUsersCount(long userId, int socialRelationType, String socialRelationTypeComparator)
			throws PortalException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSocialUsersCount(long userId1, long userId2) throws PortalException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSocialUsersCount(long userId1, long userId2, int socialRelationType) throws PortalException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long[] getTeamPrimaryKeys(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getTeamUsers(long teamId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getTeamUsers(long teamId, int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getTeamUsers(long teamId, int start, int end, OrderByComparator<User> orderByComparator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTeamUsersCount(long teamId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User getUser(long userId) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByContactId(long contactId) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByEmailAddress(long companyId, String emailAddress) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByFacebookId(long companyId, long facebookId) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByGoogleUserId(long companyId, String googleUserId) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(long companyId, long userId) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(long userId) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByOpenId(long companyId, String openId) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByPortraitId(long portraitId) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByScreenName(long companyId, String screenName) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByUuidAndCompanyId(String uuid, long companyId) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long[] getUserGroupPrimaryKeys(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserGroupUsers(long userGroupId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserGroupUsers(long userGroupId, int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserGroupUsers(long userGroupId, int start, int end,
			OrderByComparator<User> orderByComparator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getUserGroupUsersCount(long userGroupId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getUserGroupUsersCount(long userGroupId, int status) throws PortalException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getUserIdByEmailAddress(long companyId, String emailAddress) throws PortalException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getUserIdByScreenName(long companyId, String screenName) throws PortalException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> getUsers(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getUsersCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasGroupUser(long groupId, long userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasGroupUsers(long groupId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasOrganizationUser(long organizationId, long userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasOrganizationUsers(long organizationId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasPasswordPolicyUser(long passwordPolicyId, long userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasRoleUser(long companyId, String name, long userId, boolean inherited) throws PortalException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasRoleUser(long roleId, long userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasRoleUsers(long roleId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasTeamUser(long teamId, long userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasTeamUsers(long teamId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasUserGroupUser(long userGroupId, long userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasUserGroupUsers(long userGroupId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPasswordExpired(User user) throws PortalException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPasswordExpiringSoon(User user) throws PortalException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User loadGetDefaultUser(long companyId) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> search(long companyId, String firstName, String middleName, String lastName, String screenName,
			String emailAddress, int status, LinkedHashMap<String, Object> params, boolean andSearch, int start,
			int end, OrderByComparator<User> obc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hits search(long companyId, String firstName, String middleName, String lastName, String screenName,
			String emailAddress, int status, LinkedHashMap<String, Object> params, boolean andSearch, int start,
			int end, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hits search(long companyId, String firstName, String middleName, String lastName, String screenName,
			String emailAddress, int status, LinkedHashMap<String, Object> params, boolean andSearch, int start,
			int end, Sort[] sorts) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> search(long companyId, String keywords, int status, LinkedHashMap<String, Object> params,
			int start, int end, OrderByComparator<User> obc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hits search(long companyId, String keywords, int status, LinkedHashMap<String, Object> params, int start,
			int end, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hits search(long companyId, String keywords, int status, LinkedHashMap<String, Object> params, int start,
			int end, Sort[] sorts) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int searchCount(long companyId, String firstName, String middleName, String lastName, String screenName,
			String emailAddress, int status, LinkedHashMap<String, Object> params, boolean andSearch) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int searchCount(long companyId, String keywords, int status, LinkedHashMap<String, Object> params) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<Long, Integer> searchCounts(long companyId, int status, long[] groupIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> searchSocial(long companyId, long[] groupIds, String keywords, int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> searchSocial(long[] groupIds, long userId, int[] socialRelationTypes, String keywords, int start,
			int end) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> searchSocial(long userId, int[] socialRelationTypes, String keywords, int start, int end)
			throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseModelSearchResult<User> searchUsers(long companyId, String firstName, String middleName, String lastName,
			String screenName, String emailAddress, int status, LinkedHashMap<String, Object> params, boolean andSearch,
			int start, int end, Sort sort) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseModelSearchResult<User> searchUsers(long companyId, String firstName, String middleName, String lastName,
			String screenName, String emailAddress, int status, LinkedHashMap<String, Object> params, boolean andSearch,
			int start, int end, Sort[] sorts) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseModelSearchResult<User> searchUsers(long companyId, String keywords, int status,
			LinkedHashMap<String, Object> params, int start, int end, Sort sort) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseModelSearchResult<User> searchUsers(long companyId, String keywords, int status,
			LinkedHashMap<String, Object> params, int start, int end, Sort[] sorts) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendEmailAddressVerification(User user, String emailAddress, ServiceContext serviceContext)
			throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean sendPassword(long companyId, String emailAddress, String fromName, String fromAddress,
			String subject, String body, ServiceContext serviceContext) throws PortalException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sendPasswordByEmailAddress(long companyId, String emailAddress) throws PortalException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sendPasswordByScreenName(long companyId, String screenName) throws PortalException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sendPasswordByUserId(long userId) throws PortalException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setGroupUsers(long groupId, long[] userIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setOrganizationUsers(long organizationId, long[] userIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRoleUsers(long roleId, long[] userIds) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTeamUsers(long teamId, long[] userIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setUserGroupUsers(long userGroupId, long[] userIds) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unsetGroupTeamsUsers(long groupId, long[] userIds) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unsetGroupUsers(long groupId, long[] userIds, ServiceContext serviceContext) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unsetOrganizationUsers(long organizationId, long[] userIds) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unsetPasswordPolicyUsers(long passwordPolicyId, long[] userIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unsetRoleUsers(long roleId, long[] userIds) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unsetRoleUsers(long roleId, List<User> users) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unsetTeamUsers(long teamId, long[] userIds) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unsetUserGroupUsers(long userGroupId, long[] userIds) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User updateAgreedToTermsOfUse(long userId, boolean agreedToTermsOfUse) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAsset(long userId, User user, long[] assetCategoryIds, String[] assetTagNames)
			throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User updateCreateDate(long userId, Date createDate) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateEmailAddress(long userId, String password, String emailAddress1, String emailAddress2)
			throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateEmailAddress(long userId, String password, String emailAddress1, String emailAddress2,
			ServiceContext serviceContext) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateEmailAddressVerified(long userId, boolean emailAddressVerified) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateFacebookId(long userId, long facebookId) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateGoogleUserId(long userId, String googleUserId) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateGroups(long userId, long[] newGroupIds, ServiceContext serviceContext) throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User updateIncompleteUser(long creatorUserId, long companyId, boolean autoPassword, String password1,
			String password2, boolean autoScreenName, String screenName, String emailAddress, long facebookId,
			String openId, Locale locale, String firstName, String middleName, String lastName, long prefixId,
			long suffixId, boolean male, int birthdayMonth, int birthdayDay, int birthdayYear, String jobTitle,
			boolean updateUserInformation, boolean sendEmail, ServiceContext serviceContext) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateJobTitle(long userId, String jobTitle) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateLastLogin(long userId, String loginIP) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateLockout(User user, boolean lockout) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateLockoutByEmailAddress(long companyId, String emailAddress, boolean lockout)
			throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateLockoutById(long userId, boolean lockout) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateLockoutByScreenName(long companyId, String screenName, boolean lockout) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateModifiedDate(long userId, Date modifiedDate) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateOpenId(long userId, String openId) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateOrganizations(long userId, long[] newOrganizationIds, ServiceContext serviceContext)
			throws PortalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User updatePassword(long userId, String password1, String password2, boolean passwordReset)
			throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updatePassword(long userId, String password1, String password2, boolean passwordReset,
			boolean silentUpdate) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updatePasswordManually(long userId, String password, boolean passwordEncrypted, boolean passwordReset,
			Date passwordModifiedDate) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updatePasswordReset(long userId, boolean passwordReset) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updatePortrait(long userId, byte[] bytes) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateReminderQuery(long userId, String question, String answer) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateScreenName(long userId, String screenName) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateStatus(long userId, int status) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateStatus(long userId, int status, ServiceContext serviceContext) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(long userId, String oldPassword, String newPassword1, String newPassword2,
			boolean passwordReset, String reminderQueryQuestion, String reminderQueryAnswer, String screenName,
			String emailAddress, long facebookId, String openId, String languageId, String timeZoneId, String greeting,
			String comments, String firstName, String middleName, String lastName, long prefixId, long suffixId,
			boolean male, int birthdayMonth, int birthdayDay, int birthdayYear, String smsSn, String facebookSn,
			String jabberSn, String skypeSn, String twitterSn, String jobTitle, long[] groupIds, long[] organizationIds,
			long[] roleIds, List<UserGroupRole> userGroupRoles, long[] userGroupIds, ServiceContext serviceContext)
			throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(long userId, String oldPassword, String newPassword1, String newPassword2,
			boolean passwordReset, String reminderQueryQuestion, String reminderQueryAnswer, String screenName,
			String emailAddress, long facebookId, String openId, boolean portrait, byte[] portraitBytes,
			String languageId, String timeZoneId, String greeting, String comments, String firstName, String middleName,
			String lastName, long prefixId, long suffixId, boolean male, int birthdayMonth, int birthdayDay,
			int birthdayYear, String smsSn, String facebookSn, String jabberSn, String skypeSn, String twitterSn,
			String jobTitle, long[] groupIds, long[] organizationIds, long[] roleIds,
			List<UserGroupRole> userGroupRoles, long[] userGroupIds, ServiceContext serviceContext)
			throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void verifyEmailAddress(String ticketKey) throws PortalException {
		// TODO Auto-generated method stub
		
	}
	
}