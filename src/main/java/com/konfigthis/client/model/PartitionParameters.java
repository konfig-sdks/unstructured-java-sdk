/*
 * Unstructured Pipeline API
 * At Unstructured, we're on a mission to give organizations access to all of their data. We know the world runs on documents—from research reports and memos, to quarterly filings and plans of action, documents are the unit of information that companies depend on. And yet, 80% of this information is trapped in inaccessible formats, and businesses have long struggled to unlock this data, leading to information silos, inefficient decision-making, and repetitive work. Until now.  Unstructured captures this unstructured data wherever it lives and transforms it into AI-friendly JSON files for companies who are eager to fold AI into their business.
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * PartitionParameters
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PartitionParameters {
  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private File files;

  public static final String SERIALIZED_NAME_STRATEGY = "strategy";
  @SerializedName(SERIALIZED_NAME_STRATEGY)
  private String strategy;

  public static final String SERIALIZED_NAME_GZ_UNCOMPRESSED_CONTENT_TYPE = "gz_uncompressed_content_type";
  @SerializedName(SERIALIZED_NAME_GZ_UNCOMPRESSED_CONTENT_TYPE)
  private String gzUncompressedContentType;

  public static final String SERIALIZED_NAME_OUTPUT_FORMAT = "output_format";
  @SerializedName(SERIALIZED_NAME_OUTPUT_FORMAT)
  private String outputFormat;

  public static final String SERIALIZED_NAME_COORDINATES = "coordinates";
  @SerializedName(SERIALIZED_NAME_COORDINATES)
  private Boolean coordinates;

  public static final String SERIALIZED_NAME_ENCODING = "encoding";
  @SerializedName(SERIALIZED_NAME_ENCODING)
  private String encoding;

  public static final String SERIALIZED_NAME_HI_RES_MODEL_NAME = "hi_res_model_name";
  @SerializedName(SERIALIZED_NAME_HI_RES_MODEL_NAME)
  private String hiResModelName;

  public static final String SERIALIZED_NAME_INCLUDE_PAGE_BREAKS = "include_page_breaks";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PAGE_BREAKS)
  private Boolean includePageBreaks;

  public static final String SERIALIZED_NAME_LANGUAGES = "languages";
  @SerializedName(SERIALIZED_NAME_LANGUAGES)
  private List<String> languages = null;

  public static final String SERIALIZED_NAME_PDF_INFER_TABLE_STRUCTURE = "pdf_infer_table_structure";
  @SerializedName(SERIALIZED_NAME_PDF_INFER_TABLE_STRUCTURE)
  private Boolean pdfInferTableStructure;

  public static final String SERIALIZED_NAME_SKIP_INFER_TABLE_TYPES = "skip_infer_table_types";
  @SerializedName(SERIALIZED_NAME_SKIP_INFER_TABLE_TYPES)
  private List<String> skipInferTableTypes = null;

  public static final String SERIALIZED_NAME_XML_KEEP_TAGS = "xml_keep_tags";
  @SerializedName(SERIALIZED_NAME_XML_KEEP_TAGS)
  private Boolean xmlKeepTags;

  public static final String SERIALIZED_NAME_CHUNKING_STRATEGY = "chunking_strategy";
  @SerializedName(SERIALIZED_NAME_CHUNKING_STRATEGY)
  private String chunkingStrategy;

  public static final String SERIALIZED_NAME_MULTIPAGE_SECTIONS = "multipage_sections";
  @SerializedName(SERIALIZED_NAME_MULTIPAGE_SECTIONS)
  private Boolean multipageSections;

  public static final String SERIALIZED_NAME_COMBINE_UNDER_N_CHARS = "combine_under_n_chars";
  @SerializedName(SERIALIZED_NAME_COMBINE_UNDER_N_CHARS)
  private Integer combineUnderNChars;

  public static final String SERIALIZED_NAME_NEW_AFTER_N_CHARS = "new_after_n_chars";
  @SerializedName(SERIALIZED_NAME_NEW_AFTER_N_CHARS)
  private Integer newAfterNChars;

  public static final String SERIALIZED_NAME_MAX_CHARACTERS = "max_characters";
  @SerializedName(SERIALIZED_NAME_MAX_CHARACTERS)
  private Integer maxCharacters;

  public static final String SERIALIZED_NAME_OVERLAP = "overlap";
  @SerializedName(SERIALIZED_NAME_OVERLAP)
  private Integer overlap;

  public static final String SERIALIZED_NAME_OVERLAP_ALL = "overlap_all";
  @SerializedName(SERIALIZED_NAME_OVERLAP_ALL)
  private Boolean overlapAll;

  public static final String SERIALIZED_NAME_EXTRACT_IMAGE_BLOCK_TYPES = "extract_image_block_types";
  @SerializedName(SERIALIZED_NAME_EXTRACT_IMAGE_BLOCK_TYPES)
  private List<String> extractImageBlockTypes = null;

  public PartitionParameters() {
  }

  public PartitionParameters files(File files) {
    
    
    
    
    this.files = files;
    return this;
  }

   /**
   * The file to extract
   * @return files
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[B@1a28df8d", value = "The file to extract")

  public File getFiles() {
    return files;
  }


  public void setFiles(File files) {
    
    
    
    this.files = files;
  }


  public PartitionParameters strategy(String strategy) {
    
    
    
    
    this.strategy = strategy;
    return this;
  }

   /**
   * The strategy to use for partitioning PDF/image. Options are fast, hi_res, auto. Default: auto
   * @return strategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "hi_res", value = "The strategy to use for partitioning PDF/image. Options are fast, hi_res, auto. Default: auto")

  public String getStrategy() {
    return strategy;
  }


  public void setStrategy(String strategy) {
    
    
    
    this.strategy = strategy;
  }


  public PartitionParameters gzUncompressedContentType(String gzUncompressedContentType) {
    
    
    
    
    this.gzUncompressedContentType = gzUncompressedContentType;
    return this;
  }

   /**
   * If file is gzipped, use this content type after unzipping
   * @return gzUncompressedContentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "application/pdf", value = "If file is gzipped, use this content type after unzipping")

  public String getGzUncompressedContentType() {
    return gzUncompressedContentType;
  }


  public void setGzUncompressedContentType(String gzUncompressedContentType) {
    
    
    
    this.gzUncompressedContentType = gzUncompressedContentType;
  }


  public PartitionParameters outputFormat(String outputFormat) {
    
    
    
    
    this.outputFormat = outputFormat;
    return this;
  }

   /**
   * The format of the response. Supported formats are application/json and text/csv. Default: application/json.
   * @return outputFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "application/json", value = "The format of the response. Supported formats are application/json and text/csv. Default: application/json.")

  public String getOutputFormat() {
    return outputFormat;
  }


  public void setOutputFormat(String outputFormat) {
    
    
    
    this.outputFormat = outputFormat;
  }


  public PartitionParameters coordinates(Boolean coordinates) {
    
    
    
    
    this.coordinates = coordinates;
    return this;
  }

   /**
   * If true, return coordinates for each element. Default: false
   * @return coordinates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, return coordinates for each element. Default: false")

  public Boolean getCoordinates() {
    return coordinates;
  }


  public void setCoordinates(Boolean coordinates) {
    
    
    
    this.coordinates = coordinates;
  }


  public PartitionParameters encoding(String encoding) {
    
    
    
    
    this.encoding = encoding;
    return this;
  }

   /**
   * The encoding method used to decode the text input. Default: utf-8
   * @return encoding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "utf-8", value = "The encoding method used to decode the text input. Default: utf-8")

  public String getEncoding() {
    return encoding;
  }


  public void setEncoding(String encoding) {
    
    
    
    this.encoding = encoding;
  }


  public PartitionParameters hiResModelName(String hiResModelName) {
    
    
    
    
    this.hiResModelName = hiResModelName;
    return this;
  }

   /**
   * The name of the inference model used when strategy is hi_res
   * @return hiResModelName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "yolox", value = "The name of the inference model used when strategy is hi_res")

  public String getHiResModelName() {
    return hiResModelName;
  }


  public void setHiResModelName(String hiResModelName) {
    
    
    
    this.hiResModelName = hiResModelName;
  }


  public PartitionParameters includePageBreaks(Boolean includePageBreaks) {
    
    
    
    
    this.includePageBreaks = includePageBreaks;
    return this;
  }

   /**
   * If True, the output will include page breaks if the filetype supports it. Default: false
   * @return includePageBreaks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If True, the output will include page breaks if the filetype supports it. Default: false")

  public Boolean getIncludePageBreaks() {
    return includePageBreaks;
  }


  public void setIncludePageBreaks(Boolean includePageBreaks) {
    
    
    
    this.includePageBreaks = includePageBreaks;
  }


  public PartitionParameters languages(List<String> languages) {
    
    
    
    
    this.languages = languages;
    return this;
  }

  public PartitionParameters addLanguagesItem(String languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<>();
    }
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * The languages present in the document, for use in partitioning and/or OCR
   * @return languages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[eng]", value = "The languages present in the document, for use in partitioning and/or OCR")

  public List<String> getLanguages() {
    return languages;
  }


  public void setLanguages(List<String> languages) {
    
    
    
    this.languages = languages;
  }


  public PartitionParameters pdfInferTableStructure(Boolean pdfInferTableStructure) {
    
    
    
    
    this.pdfInferTableStructure = pdfInferTableStructure;
    return this;
  }

   /**
   * If True and strategy&#x3D;hi_res, any Table Elements extracted from a PDF will include an additional metadata field, &#39;text_as_html&#39;, where the value (string) is a just a transformation of the data into an HTML &lt;table&gt;.
   * @return pdfInferTableStructure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If True and strategy=hi_res, any Table Elements extracted from a PDF will include an additional metadata field, 'text_as_html', where the value (string) is a just a transformation of the data into an HTML <table>.")

  public Boolean getPdfInferTableStructure() {
    return pdfInferTableStructure;
  }


  public void setPdfInferTableStructure(Boolean pdfInferTableStructure) {
    
    
    
    this.pdfInferTableStructure = pdfInferTableStructure;
  }


  public PartitionParameters skipInferTableTypes(List<String> skipInferTableTypes) {
    
    
    
    
    this.skipInferTableTypes = skipInferTableTypes;
    return this;
  }

  public PartitionParameters addSkipInferTableTypesItem(String skipInferTableTypesItem) {
    if (this.skipInferTableTypes == null) {
      this.skipInferTableTypes = new ArrayList<>();
    }
    this.skipInferTableTypes.add(skipInferTableTypesItem);
    return this;
  }

   /**
   * The document types that you want to skip table extraction with. Default: [&#39;pdf&#39;, &#39;jpg&#39;, &#39;png&#39;]
   * @return skipInferTableTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The document types that you want to skip table extraction with. Default: ['pdf', 'jpg', 'png']")

  public List<String> getSkipInferTableTypes() {
    return skipInferTableTypes;
  }


  public void setSkipInferTableTypes(List<String> skipInferTableTypes) {
    
    
    
    this.skipInferTableTypes = skipInferTableTypes;
  }


  public PartitionParameters xmlKeepTags(Boolean xmlKeepTags) {
    
    
    
    
    this.xmlKeepTags = xmlKeepTags;
    return this;
  }

   /**
   * If True, will retain the XML tags in the output. Otherwise it will simply extract the text from within the tags. Only applies to partition_xml.
   * @return xmlKeepTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If True, will retain the XML tags in the output. Otherwise it will simply extract the text from within the tags. Only applies to partition_xml.")

  public Boolean getXmlKeepTags() {
    return xmlKeepTags;
  }


  public void setXmlKeepTags(Boolean xmlKeepTags) {
    
    
    
    this.xmlKeepTags = xmlKeepTags;
  }


  public PartitionParameters chunkingStrategy(String chunkingStrategy) {
    
    
    
    
    this.chunkingStrategy = chunkingStrategy;
    return this;
  }

   /**
   * Use one of the supported strategies to chunk the returned elements. Currently supports: by_title
   * @return chunkingStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "by_title", value = "Use one of the supported strategies to chunk the returned elements. Currently supports: by_title")

  public String getChunkingStrategy() {
    return chunkingStrategy;
  }


  public void setChunkingStrategy(String chunkingStrategy) {
    
    
    
    this.chunkingStrategy = chunkingStrategy;
  }


  public PartitionParameters multipageSections(Boolean multipageSections) {
    
    
    
    
    this.multipageSections = multipageSections;
    return this;
  }

   /**
   * If chunking strategy is set, determines if sections can span multiple sections. Default: true
   * @return multipageSections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If chunking strategy is set, determines if sections can span multiple sections. Default: true")

  public Boolean getMultipageSections() {
    return multipageSections;
  }


  public void setMultipageSections(Boolean multipageSections) {
    
    
    
    this.multipageSections = multipageSections;
  }


  public PartitionParameters combineUnderNChars(Integer combineUnderNChars) {
    
    
    
    
    this.combineUnderNChars = combineUnderNChars;
    return this;
  }

   /**
   * If chunking strategy is set, combine elements until a section reaches a length of n chars. Default: 500
   * @return combineUnderNChars
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "500", value = "If chunking strategy is set, combine elements until a section reaches a length of n chars. Default: 500")

  public Integer getCombineUnderNChars() {
    return combineUnderNChars;
  }


  public void setCombineUnderNChars(Integer combineUnderNChars) {
    
    
    
    this.combineUnderNChars = combineUnderNChars;
  }


  public PartitionParameters newAfterNChars(Integer newAfterNChars) {
    
    
    
    
    this.newAfterNChars = newAfterNChars;
    return this;
  }

   /**
   * If chunking strategy is set, cut off new sections after reaching a length of n chars (soft max). Default: 1500
   * @return newAfterNChars
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1500", value = "If chunking strategy is set, cut off new sections after reaching a length of n chars (soft max). Default: 1500")

  public Integer getNewAfterNChars() {
    return newAfterNChars;
  }


  public void setNewAfterNChars(Integer newAfterNChars) {
    
    
    
    this.newAfterNChars = newAfterNChars;
  }


  public PartitionParameters maxCharacters(Integer maxCharacters) {
    
    
    
    
    this.maxCharacters = maxCharacters;
    return this;
  }

   /**
   * If chunking strategy is set, cut off new sections after reaching a length of n chars (hard max). Default: 1500
   * @return maxCharacters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1500", value = "If chunking strategy is set, cut off new sections after reaching a length of n chars (hard max). Default: 1500")

  public Integer getMaxCharacters() {
    return maxCharacters;
  }


  public void setMaxCharacters(Integer maxCharacters) {
    
    
    
    this.maxCharacters = maxCharacters;
  }


  public PartitionParameters overlap(Integer overlap) {
    
    
    
    
    this.overlap = overlap;
    return this;
  }

   /**
   * A prefix of this many trailing characters from prior text-split chunk is applied to second and later chunks formed from oversized elements by text-splitting. Default: None
   * @return overlap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25", value = "A prefix of this many trailing characters from prior text-split chunk is applied to second and later chunks formed from oversized elements by text-splitting. Default: None")

  public Integer getOverlap() {
    return overlap;
  }


  public void setOverlap(Integer overlap) {
    
    
    
    this.overlap = overlap;
  }


  public PartitionParameters overlapAll(Boolean overlapAll) {
    
    
    
    
    this.overlapAll = overlapAll;
    return this;
  }

   /**
   * When True, overlap is also applied to &#39;normal&#39; chunks formed by combining whole elements. Use with caution as this can introduce noise into otherwise clean semantic units. Default: None
   * @return overlapAll
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "When True, overlap is also applied to 'normal' chunks formed by combining whole elements. Use with caution as this can introduce noise into otherwise clean semantic units. Default: None")

  public Boolean getOverlapAll() {
    return overlapAll;
  }


  public void setOverlapAll(Boolean overlapAll) {
    
    
    
    this.overlapAll = overlapAll;
  }


  public PartitionParameters extractImageBlockTypes(List<String> extractImageBlockTypes) {
    
    
    
    
    this.extractImageBlockTypes = extractImageBlockTypes;
    return this;
  }

  public PartitionParameters addExtractImageBlockTypesItem(String extractImageBlockTypesItem) {
    if (this.extractImageBlockTypes == null) {
      this.extractImageBlockTypes = new ArrayList<>();
    }
    this.extractImageBlockTypes.add(extractImageBlockTypesItem);
    return this;
  }

   /**
   * The types of elements to extract, for use in extracting image blocks as base64 encoded data stored in metadata fields
   * @return extractImageBlockTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"image\",\"table\"]", value = "The types of elements to extract, for use in extracting image blocks as base64 encoded data stored in metadata fields")

  public List<String> getExtractImageBlockTypes() {
    return extractImageBlockTypes;
  }


  public void setExtractImageBlockTypes(List<String> extractImageBlockTypes) {
    
    
    
    this.extractImageBlockTypes = extractImageBlockTypes;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the PartitionParameters instance itself
   */
  public PartitionParameters putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartitionParameters partitionParameters = (PartitionParameters) o;
    return Objects.equals(this.files, partitionParameters.files) &&
        Objects.equals(this.strategy, partitionParameters.strategy) &&
        Objects.equals(this.gzUncompressedContentType, partitionParameters.gzUncompressedContentType) &&
        Objects.equals(this.outputFormat, partitionParameters.outputFormat) &&
        Objects.equals(this.coordinates, partitionParameters.coordinates) &&
        Objects.equals(this.encoding, partitionParameters.encoding) &&
        Objects.equals(this.hiResModelName, partitionParameters.hiResModelName) &&
        Objects.equals(this.includePageBreaks, partitionParameters.includePageBreaks) &&
        Objects.equals(this.languages, partitionParameters.languages) &&
        Objects.equals(this.pdfInferTableStructure, partitionParameters.pdfInferTableStructure) &&
        Objects.equals(this.skipInferTableTypes, partitionParameters.skipInferTableTypes) &&
        Objects.equals(this.xmlKeepTags, partitionParameters.xmlKeepTags) &&
        Objects.equals(this.chunkingStrategy, partitionParameters.chunkingStrategy) &&
        Objects.equals(this.multipageSections, partitionParameters.multipageSections) &&
        Objects.equals(this.combineUnderNChars, partitionParameters.combineUnderNChars) &&
        Objects.equals(this.newAfterNChars, partitionParameters.newAfterNChars) &&
        Objects.equals(this.maxCharacters, partitionParameters.maxCharacters) &&
        Objects.equals(this.overlap, partitionParameters.overlap) &&
        Objects.equals(this.overlapAll, partitionParameters.overlapAll) &&
        Objects.equals(this.extractImageBlockTypes, partitionParameters.extractImageBlockTypes)&&
        Objects.equals(this.additionalProperties, partitionParameters.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files, strategy, gzUncompressedContentType, outputFormat, coordinates, encoding, hiResModelName, includePageBreaks, languages, pdfInferTableStructure, skipInferTableTypes, xmlKeepTags, chunkingStrategy, multipageSections, combineUnderNChars, newAfterNChars, maxCharacters, overlap, overlapAll, extractImageBlockTypes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartitionParameters {\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    gzUncompressedContentType: ").append(toIndentedString(gzUncompressedContentType)).append("\n");
    sb.append("    outputFormat: ").append(toIndentedString(outputFormat)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    hiResModelName: ").append(toIndentedString(hiResModelName)).append("\n");
    sb.append("    includePageBreaks: ").append(toIndentedString(includePageBreaks)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    pdfInferTableStructure: ").append(toIndentedString(pdfInferTableStructure)).append("\n");
    sb.append("    skipInferTableTypes: ").append(toIndentedString(skipInferTableTypes)).append("\n");
    sb.append("    xmlKeepTags: ").append(toIndentedString(xmlKeepTags)).append("\n");
    sb.append("    chunkingStrategy: ").append(toIndentedString(chunkingStrategy)).append("\n");
    sb.append("    multipageSections: ").append(toIndentedString(multipageSections)).append("\n");
    sb.append("    combineUnderNChars: ").append(toIndentedString(combineUnderNChars)).append("\n");
    sb.append("    newAfterNChars: ").append(toIndentedString(newAfterNChars)).append("\n");
    sb.append("    maxCharacters: ").append(toIndentedString(maxCharacters)).append("\n");
    sb.append("    overlap: ").append(toIndentedString(overlap)).append("\n");
    sb.append("    overlapAll: ").append(toIndentedString(overlapAll)).append("\n");
    sb.append("    extractImageBlockTypes: ").append(toIndentedString(extractImageBlockTypes)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("files");
    openapiFields.add("strategy");
    openapiFields.add("gz_uncompressed_content_type");
    openapiFields.add("output_format");
    openapiFields.add("coordinates");
    openapiFields.add("encoding");
    openapiFields.add("hi_res_model_name");
    openapiFields.add("include_page_breaks");
    openapiFields.add("languages");
    openapiFields.add("pdf_infer_table_structure");
    openapiFields.add("skip_infer_table_types");
    openapiFields.add("xml_keep_tags");
    openapiFields.add("chunking_strategy");
    openapiFields.add("multipage_sections");
    openapiFields.add("combine_under_n_chars");
    openapiFields.add("new_after_n_chars");
    openapiFields.add("max_characters");
    openapiFields.add("overlap");
    openapiFields.add("overlap_all");
    openapiFields.add("extract_image_block_types");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PartitionParameters
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PartitionParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PartitionParameters is not found in the empty JSON string", PartitionParameters.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("strategy") != null && !jsonObj.get("strategy").isJsonNull()) && !jsonObj.get("strategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `strategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("strategy").toString()));
      }
      if ((jsonObj.get("gz_uncompressed_content_type") != null && !jsonObj.get("gz_uncompressed_content_type").isJsonNull()) && !jsonObj.get("gz_uncompressed_content_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gz_uncompressed_content_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gz_uncompressed_content_type").toString()));
      }
      if ((jsonObj.get("output_format") != null && !jsonObj.get("output_format").isJsonNull()) && !jsonObj.get("output_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `output_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("output_format").toString()));
      }
      if ((jsonObj.get("encoding") != null && !jsonObj.get("encoding").isJsonNull()) && !jsonObj.get("encoding").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encoding` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encoding").toString()));
      }
      if ((jsonObj.get("hi_res_model_name") != null && !jsonObj.get("hi_res_model_name").isJsonNull()) && !jsonObj.get("hi_res_model_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hi_res_model_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hi_res_model_name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("languages") != null && !jsonObj.get("languages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `languages` to be an array in the JSON string but got `%s`", jsonObj.get("languages").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("skip_infer_table_types") != null && !jsonObj.get("skip_infer_table_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `skip_infer_table_types` to be an array in the JSON string but got `%s`", jsonObj.get("skip_infer_table_types").toString()));
      }
      if ((jsonObj.get("chunking_strategy") != null && !jsonObj.get("chunking_strategy").isJsonNull()) && !jsonObj.get("chunking_strategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chunking_strategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chunking_strategy").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("extract_image_block_types") != null && !jsonObj.get("extract_image_block_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `extract_image_block_types` to be an array in the JSON string but got `%s`", jsonObj.get("extract_image_block_types").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PartitionParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PartitionParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PartitionParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PartitionParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<PartitionParameters>() {
           @Override
           public void write(JsonWriter out, PartitionParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public PartitionParameters read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PartitionParameters instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PartitionParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PartitionParameters
  * @throws IOException if the JSON string is invalid with respect to PartitionParameters
  */
  public static PartitionParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PartitionParameters.class);
  }

 /**
  * Convert an instance of PartitionParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
