/**
*  SDK
*
* This library allows to interact with the  payment service.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


package com.wallee.sdk.model;

import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")

public class RenderedTerminalReceipt extends Indentable {
  
  @JsonProperty("data")
  protected List<byte[]> data;

  
  @JsonProperty("mimeType")
  protected String mimeType;

  
  
   /**
   * 
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<byte[]> getData() {
    return data;
  }

  
   /**
   * 
   * @return mimeType
  **/
  @ApiModelProperty(value = "")
  public String getMimeType() {
    return mimeType;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenderedTerminalReceipt renderedTerminalReceipt = (RenderedTerminalReceipt) o;
    return Objects.equals(this.data, renderedTerminalReceipt.data) &&
        Objects.equals(this.mimeType, renderedTerminalReceipt.mimeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, mimeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenderedTerminalReceipt {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("}");
    return sb.toString();
  }



}

