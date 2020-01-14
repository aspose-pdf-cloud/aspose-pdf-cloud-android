/**
 *
 *   Copyright (c) 2020 Aspose.PDF Cloud
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
 * Represents Pdf optimize options.
 */
@ApiModel(description = "Represents Pdf optimize options.")

public class OptimizeOptions {
  @SerializedName("AllowReusePageContent")
  private Boolean allowReusePageContent = null;

  @SerializedName("CompressImages")
  private Boolean compressImages = null;

  @SerializedName("ImageQuality")
  private Integer imageQuality = null;

  @SerializedName("LinkDuplcateStreams")
  private Boolean linkDuplcateStreams = null;

  @SerializedName("RemoveUnusedObjects")
  private Boolean removeUnusedObjects = null;

  @SerializedName("RemoveUnusedStreams")
  private Boolean removeUnusedStreams = null;

  @SerializedName("UnembedFonts")
  private Boolean unembedFonts = null;

  public OptimizeOptions allowReusePageContent(Boolean allowReusePageContent) {
    this.allowReusePageContent = allowReusePageContent;
    return this;
  }

   /**
   * If true page contents will be reused when document is optimized for equal pages.
   * @return allowReusePageContent
  **/
  @ApiModelProperty(required = true, value = "If true page contents will be reused when document is optimized for equal pages.")
  public Boolean isAllowReusePageContent() {
    return allowReusePageContent;
  }

  public void setAllowReusePageContent(Boolean allowReusePageContent) {
    this.allowReusePageContent = allowReusePageContent;
  }

  public OptimizeOptions compressImages(Boolean compressImages) {
    this.compressImages = compressImages;
    return this;
  }

   /**
   * If this flag is set to true images will be compressed in the document. compression level is specfied with ImageQuality property.
   * @return compressImages
  **/
  @ApiModelProperty(required = true, value = "If this flag is set to true images will be compressed in the document. compression level is specfied with ImageQuality property.")
  public Boolean isCompressImages() {
    return compressImages;
  }

  public void setCompressImages(Boolean compressImages) {
    this.compressImages = compressImages;
  }

  public OptimizeOptions imageQuality(Integer imageQuality) {
    this.imageQuality = imageQuality;
    return this;
  }

   /**
   * Specifie slevel of image compression when CompressIamges flag is used.
   * @return imageQuality
  **/
  @ApiModelProperty(required = true, value = "Specifie slevel of image compression when CompressIamges flag is used.")
  public Integer getImageQuality() {
    return imageQuality;
  }

  public void setImageQuality(Integer imageQuality) {
    this.imageQuality = imageQuality;
  }

  public OptimizeOptions linkDuplcateStreams(Boolean linkDuplcateStreams) {
    this.linkDuplcateStreams = linkDuplcateStreams;
    return this;
  }

   /**
   * If this flag is set to true, Resource streams will be analyzed. If duplicate streams are found (i.e. if stream contents is equal), then thes streams will be stored as one object.  This allows to decrease document size in some cases (for example, when same document was concatenedted multiple times).
   * @return linkDuplcateStreams
  **/
  @ApiModelProperty(required = true, value = "If this flag is set to true, Resource streams will be analyzed. If duplicate streams are found (i.e. if stream contents is equal), then thes streams will be stored as one object.  This allows to decrease document size in some cases (for example, when same document was concatenedted multiple times).")
  public Boolean isLinkDuplcateStreams() {
    return linkDuplcateStreams;
  }

  public void setLinkDuplcateStreams(Boolean linkDuplcateStreams) {
    this.linkDuplcateStreams = linkDuplcateStreams;
  }

  public OptimizeOptions removeUnusedObjects(Boolean removeUnusedObjects) {
    this.removeUnusedObjects = removeUnusedObjects;
    return this;
  }

   /**
   * If this flag is set to true, all document objects will be checked and unused objects (i.e. objects which does not have any reference) are removed from document.
   * @return removeUnusedObjects
  **/
  @ApiModelProperty(required = true, value = "If this flag is set to true, all document objects will be checked and unused objects (i.e. objects which does not have any reference) are removed from document.")
  public Boolean isRemoveUnusedObjects() {
    return removeUnusedObjects;
  }

  public void setRemoveUnusedObjects(Boolean removeUnusedObjects) {
    this.removeUnusedObjects = removeUnusedObjects;
  }

  public OptimizeOptions removeUnusedStreams(Boolean removeUnusedStreams) {
    this.removeUnusedStreams = removeUnusedStreams;
    return this;
  }

   /**
   * If this flag set to true, every resource is checked on it&#39;s usage. If resource is never used, then resources is removed. This may decrease document size for example when pages were extracted from document. 
   * @return removeUnusedStreams
  **/
  @ApiModelProperty(required = true, value = "If this flag set to true, every resource is checked on it's usage. If resource is never used, then resources is removed. This may decrease document size for example when pages were extracted from document. ")
  public Boolean isRemoveUnusedStreams() {
    return removeUnusedStreams;
  }

  public void setRemoveUnusedStreams(Boolean removeUnusedStreams) {
    this.removeUnusedStreams = removeUnusedStreams;
  }

  public OptimizeOptions unembedFonts(Boolean unembedFonts) {
    this.unembedFonts = unembedFonts;
    return this;
  }

   /**
   * Make fonts not embedded if set to true. 
   * @return unembedFonts
  **/
  @ApiModelProperty(required = true, value = "Make fonts not embedded if set to true. ")
  public Boolean isUnembedFonts() {
    return unembedFonts;
  }

  public void setUnembedFonts(Boolean unembedFonts) {
    this.unembedFonts = unembedFonts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizeOptions optimizeOptions = (OptimizeOptions) o;
    return Objects.equals(this.allowReusePageContent, optimizeOptions.allowReusePageContent) &&
        Objects.equals(this.compressImages, optimizeOptions.compressImages) &&
        Objects.equals(this.imageQuality, optimizeOptions.imageQuality) &&
        Objects.equals(this.linkDuplcateStreams, optimizeOptions.linkDuplcateStreams) &&
        Objects.equals(this.removeUnusedObjects, optimizeOptions.removeUnusedObjects) &&
        Objects.equals(this.removeUnusedStreams, optimizeOptions.removeUnusedStreams) &&
        Objects.equals(this.unembedFonts, optimizeOptions.unembedFonts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowReusePageContent, compressImages, imageQuality, linkDuplcateStreams, removeUnusedObjects, removeUnusedStreams, unembedFonts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizeOptions {\n");
    
    sb.append("    allowReusePageContent: ").append(toIndentedString(allowReusePageContent)).append("\n");
    sb.append("    compressImages: ").append(toIndentedString(compressImages)).append("\n");
    sb.append("    imageQuality: ").append(toIndentedString(imageQuality)).append("\n");
    sb.append("    linkDuplcateStreams: ").append(toIndentedString(linkDuplcateStreams)).append("\n");
    sb.append("    removeUnusedObjects: ").append(toIndentedString(removeUnusedObjects)).append("\n");
    sb.append("    removeUnusedStreams: ").append(toIndentedString(removeUnusedStreams)).append("\n");
    sb.append("    unembedFonts: ").append(toIndentedString(unembedFonts)).append("\n");
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

