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
import java.math.BigDecimal;
import java.time.OffsetDateTime;

/**
 * DebtCollectionReceipt
 */
public class DebtCollectionReceipt {

	@SerializedName("amount")
	private BigDecimal amount = null;

	@SerializedName("createdBy")
	private Long createdBy = null;

	@SerializedName("createdOn")
	private OffsetDateTime createdOn = null;

	@SerializedName("debtCollectionCase")
	private Long debtCollectionCase = null;

	@SerializedName("externalId")
	private String externalId = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("source")
	private Long source = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * amount
	 *
	 * @return amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * The created by field indicates the user which has created the receipt.
	 *
	 * @return The created by field indicates the user which has created the receipt.
	 */
	public Long getCreatedBy() {
		return createdBy;
	}

	/**
	 * The created on date indicates the date on which the entity was stored into the database.
	 *
	 * @return The created on date indicates the date on which the entity was stored into the database.
	 */
	public OffsetDateTime getCreatedOn() {
		return createdOn;
	}

	/**
	 * debtCollectionCase
	 *
	 * @return debtCollectionCase
	 */
	public Long getDebtCollectionCase() {
		return debtCollectionCase;
	}

	/**
	 * The external id is a unique identifier for the receipt. The external id has to be unique in combination with the debt collection case. When a receipt is sent with an existing external id the existing one is returned rather than a new one is created.
	 *
	 * @return The external id is a unique identifier for the receipt. The external id has to be unique in combination with the debt collection case. When a receipt is sent with an existing external id the existing one is returned rather than a new one is created.
	 */
	public String getExternalId() {
		return externalId;
	}

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
	 * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 *
	 * @return The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 */
	public OffsetDateTime getPlannedPurgeDate() {
		return plannedPurgeDate;
	}

	/**
	 * source
	 *
	 * @return source
	 */
	public Long getSource() {
		return source;
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
		DebtCollectionReceipt debtCollectionReceipt = (DebtCollectionReceipt) o;
		return Objects.equals(this.amount, debtCollectionReceipt.amount) &&
				Objects.equals(this.createdBy, debtCollectionReceipt.createdBy) &&
				Objects.equals(this.createdOn, debtCollectionReceipt.createdOn) &&
				Objects.equals(this.debtCollectionCase, debtCollectionReceipt.debtCollectionCase) &&
				Objects.equals(this.externalId, debtCollectionReceipt.externalId) &&
				Objects.equals(this.id, debtCollectionReceipt.id) &&
				Objects.equals(this.linkedSpaceId, debtCollectionReceipt.linkedSpaceId) &&
				Objects.equals(this.plannedPurgeDate, debtCollectionReceipt.plannedPurgeDate) &&
				Objects.equals(this.source, debtCollectionReceipt.source) &&
				Objects.equals(this.version, debtCollectionReceipt.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, createdBy, createdOn, debtCollectionCase, externalId, id, linkedSpaceId, plannedPurgeDate, source, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DebtCollectionReceipt {\n");
		
		sb.append("		amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("		createdBy: ").append(toIndentedString(createdBy)).append("\n");
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		debtCollectionCase: ").append(toIndentedString(debtCollectionCase)).append("\n");
		sb.append("		externalId: ").append(toIndentedString(externalId)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		source: ").append(toIndentedString(source)).append("\n");
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

