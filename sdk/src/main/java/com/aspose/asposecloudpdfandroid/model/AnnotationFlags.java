/**
 *
 * Copyright (c) 2022 Aspose.PDF Cloud
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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * A set of flags specifying various characteristics of the annotation.
 */
@JsonAdapter(AnnotationFlags.Adapter.class)
public enum AnnotationFlags {
  
  DEFAULT("Default"),
  
  INVISIBLE("Invisible"),
  
  HIDDEN("Hidden"),
  
  PRINT("Print"),
  
  NOZOOM("NoZoom"),
  
  NOROTATE("NoRotate"),
  
  NOVIEW("NoView"),
  
  READONLY("ReadOnly"),
  
  LOCKED("Locked"),
  
  TOGGLENOVIEW("ToggleNoView"),
  
  LOCKEDCONTENTS("LockedContents");

  private String value;

  AnnotationFlags(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AnnotationFlags fromValue(String text) {
    for (AnnotationFlags b : AnnotationFlags.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AnnotationFlags> {
    @Override
    public void write(final JsonWriter jsonWriter, final AnnotationFlags enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AnnotationFlags read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AnnotationFlags.fromValue(String.valueOf(value));
    }
  }
}

