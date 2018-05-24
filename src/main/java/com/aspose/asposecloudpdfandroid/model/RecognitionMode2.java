/**
 *
 *   Copyright (c) 2018 Aspose.Pdf for Cloud
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
 * When PDF file (that usually has fixed layout) is being converted,             the conversion engine tries to perform grouping and multi-level analysis to restore             the original document author&#39;s intent and produce result in flow layout.  This property tunes that conversion for this or that             desirable method of recognition of content.             
 */
@JsonAdapter(RecognitionMode2.Adapter.class)
public enum RecognitionMode2 {
  
  FLOW("Flow"),
  
  PDFFLOW("PdfFlow"),
  
  FIXED("Fixed");

  private String value;

  RecognitionMode2(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RecognitionMode2 fromValue(String text) {
    for (RecognitionMode2 b : RecognitionMode2.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<RecognitionMode2> {
    @Override
    public void write(final JsonWriter jsonWriter, final RecognitionMode2 enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RecognitionMode2 read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RecognitionMode2.fromValue(String.valueOf(value));
    }
  }
}

