/**
 * Wallee SDK Client
 *
 * This client allows to interact with the Wallee API.
 *
 * Wallee API: 1.0.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wallee.sdk.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.Space;
import java.time.OffsetDateTime;

/**
 * SpaceView
 */
public class SpaceView {

	@SerializedName("id")
	private Long id = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("space")
	private Space space = null;

	@SerializedName("state")
	private CreationEntityState state = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * The linked space id holds the ID of the space to which the entity belongs to.
	 *
	 * @return The linked space id holds the ID of the space to which the entity belongs to.
	 */
	public Long getLinkedSpaceId() {
		return linkedSpaceId;
	}

	/**
	 * The space view name is used internally to identify the space view in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.
	 *
	 * @return The space view name is used internally to identify the space view in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.
	 */
	public String getName() {
		return name;
	}

	/**
	 * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 *
	 * @return The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 */
	public OffsetDateTime getPlannedPurgeDate() {
		return plannedPurgeDate;
	}

	/**
	 * The space to which the view belongs to.
	 *
	 * @return The space to which the view belongs to.
	 */
	public Space getSpace() {
		return space;
	}

	/**
	 * state
	 *
	 * @return state
	 */
	public CreationEntityState getState() {
		return state;
	}

	/**
	 * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
	public Integer getVersion() {
		return version;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SpaceView spaceView = (SpaceView) o;
		return Objects.equals(this.id, spaceView.id) &&
				Objects.equals(this.linkedSpaceId, spaceView.linkedSpaceId) &&
				Objects.equals(this.name, spaceView.name) &&
				Objects.equals(this.plannedPurgeDate, spaceView.plannedPurgeDate) &&
				Objects.equals(this.space, spaceView.space) &&
				Objects.equals(this.state, spaceView.state) &&
				Objects.equals(this.version, spaceView.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, linkedSpaceId, name, plannedPurgeDate, space, state, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SpaceView {\n");
		
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		space: ").append(toIndentedString(space)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		version: ").append(toIndentedString(version)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n		");
	}

}

