/**
 *
 * Copyright (c) 2024 Aspose.PDF Cloud
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */


package com.aspose.asposecloudpdfandroid.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Xmp Metadata Property.
 */
@ApiModel(description = "Xmp Metadata Property.")

public class XmpMetadataProperty {
  @SerializedName("Key")
  private String key = null;

  @SerializedName("Value")
  private String value = null;

  @SerializedName("NamespaceUri")
  private String namespaceUri = null;

  public XmpMetadataProperty key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Xmp Metadata Property Key. Can take the form for default keys: xmp:DefaultKeyName or DefaultKeyName. Form for user defined properties: customNamespace:UserPropertyName.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "Xmp Metadata Property Key. Can take the form for default keys: xmp:DefaultKeyName or DefaultKeyName. Form for user defined properties: customNamespace:UserPropertyName.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public XmpMetadataProperty value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Xmp Metadata Property Value. Null for delete property.
   * @return value
  **/
  @ApiModelProperty(value = "Xmp Metadata Property Value. Null for delete property.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public XmpMetadataProperty namespaceUri(String namespaceUri) {
    this.namespaceUri = namespaceUri;
    return this;
  }

   /**
   * Namespace Uri. For user defined properties only.
   * @return namespaceUri
  **/
  @ApiModelProperty(value = "Namespace Uri. For user defined properties only.")
  public String getNamespaceUri() {
    return namespaceUri;
  }

  public void setNamespaceUri(String namespaceUri) {
    this.namespaceUri = namespaceUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmpMetadataProperty xmpMetadataProperty = (XmpMetadataProperty) o;
    return Objects.equals(this.key, xmpMetadataProperty.key) &&
        Objects.equals(this.value, xmpMetadataProperty.value) &&
        Objects.equals(this.namespaceUri, xmpMetadataProperty.namespaceUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, namespaceUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmpMetadataProperty {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    namespaceUri: ").append(toIndentedString(namespaceUri)).append("\n");
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
    return o.toString().replace("\n", "\n    ");
  }

}

