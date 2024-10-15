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

package helpdesk.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Ticket service. Represents a row in the &quot;helpdesk_Ticket&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>helpdesk.service.model.impl.TicketModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>helpdesk.service.model.impl.TicketImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Ticket
 * @generated
 */
@ProviderType
public interface TicketModel extends BaseModel<Ticket> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ticket model instance should use the {@link Ticket} interface instead.
	 */

	/**
	 * Returns the primary key of this ticket.
	 *
	 * @return the primary key of this ticket
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this ticket.
	 *
	 * @param primaryKey the primary key of this ticket
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ticket ID of this ticket.
	 *
	 * @return the ticket ID of this ticket
	 */
	public long getTicketId();

	/**
	 * Sets the ticket ID of this ticket.
	 *
	 * @param ticketId the ticket ID of this ticket
	 */
	public void setTicketId(long ticketId);

	/**
	 * Returns the user ID of this ticket.
	 *
	 * @return the user ID of this ticket
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this ticket.
	 *
	 * @param userId the user ID of this ticket
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this ticket.
	 *
	 * @return the user uuid of this ticket
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this ticket.
	 *
	 * @param userUuid the user uuid of this ticket
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the requester of this ticket.
	 *
	 * @return the requester of this ticket
	 */
	@AutoEscape
	public String getRequester();

	/**
	 * Sets the requester of this ticket.
	 *
	 * @param requester the requester of this ticket
	 */
	public void setRequester(String requester);

	/**
	 * Returns the email of this ticket.
	 *
	 * @return the email of this ticket
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this ticket.
	 *
	 * @param email the email of this ticket
	 */
	public void setEmail(String email);

	/**
	 * Returns the subject of this ticket.
	 *
	 * @return the subject of this ticket
	 */
	@AutoEscape
	public String getSubject();

	/**
	 * Sets the subject of this ticket.
	 *
	 * @param subject the subject of this ticket
	 */
	public void setSubject(String subject);

	/**
	 * Returns the description of this ticket.
	 *
	 * @return the description of this ticket
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this ticket.
	 *
	 * @param description the description of this ticket
	 */
	public void setDescription(String description);

	/**
	 * Returns the department of this ticket.
	 *
	 * @return the department of this ticket
	 */
	@AutoEscape
	public String getDepartment();

	/**
	 * Sets the department of this ticket.
	 *
	 * @param department the department of this ticket
	 */
	public void setDepartment(String department);

	/**
	 * Returns the category of this ticket.
	 *
	 * @return the category of this ticket
	 */
	@AutoEscape
	public String getCategory();

	/**
	 * Sets the category of this ticket.
	 *
	 * @param category the category of this ticket
	 */
	public void setCategory(String category);

	/**
	 * Returns the subcategory of this ticket.
	 *
	 * @return the subcategory of this ticket
	 */
	@AutoEscape
	public String getSubcategory();

	/**
	 * Sets the subcategory of this ticket.
	 *
	 * @param subcategory the subcategory of this ticket
	 */
	public void setSubcategory(String subcategory);

	/**
	 * Returns the priority of this ticket.
	 *
	 * @return the priority of this ticket
	 */
	@AutoEscape
	public String getPriority();

	/**
	 * Sets the priority of this ticket.
	 *
	 * @param priority the priority of this ticket
	 */
	public void setPriority(String priority);

	/**
	 * Returns the imageattached of this ticket.
	 *
	 * @return the imageattached of this ticket
	 */
	@AutoEscape
	public String getImageattached();

	/**
	 * Sets the imageattached of this ticket.
	 *
	 * @param imageattached the imageattached of this ticket
	 */
	public void setImageattached(String imageattached);

	/**
	 * Returns the status of this ticket.
	 *
	 * @return the status of this ticket
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this ticket.
	 *
	 * @param status the status of this ticket
	 */
	public void setStatus(String status);

	/**
	 * Returns the createdate of this ticket.
	 *
	 * @return the createdate of this ticket
	 */
	@AutoEscape
	public String getCreatedate();

	/**
	 * Sets the createdate of this ticket.
	 *
	 * @param createdate the createdate of this ticket
	 */
	public void setCreatedate(String createdate);

	@Override
	public Ticket cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}