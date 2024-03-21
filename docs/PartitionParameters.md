

# PartitionParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**files** | **File** | The file to extract |  [optional] |
|**strategy** | **String** | The strategy to use for partitioning PDF/image. Options are fast, hi_res, auto. Default: auto |  [optional] |
|**gzUncompressedContentType** | **String** | If file is gzipped, use this content type after unzipping |  [optional] |
|**outputFormat** | **String** | The format of the response. Supported formats are application/json and text/csv. Default: application/json. |  [optional] |
|**coordinates** | **Boolean** | If true, return coordinates for each element. Default: false |  [optional] |
|**encoding** | **String** | The encoding method used to decode the text input. Default: utf-8 |  [optional] |
|**hiResModelName** | **String** | The name of the inference model used when strategy is hi_res |  [optional] |
|**includePageBreaks** | **Boolean** | If True, the output will include page breaks if the filetype supports it. Default: false |  [optional] |
|**languages** | **List&lt;String&gt;** | The languages present in the document, for use in partitioning and/or OCR |  [optional] |
|**pdfInferTableStructure** | **Boolean** | If True and strategy&#x3D;hi_res, any Table Elements extracted from a PDF will include an additional metadata field, &#39;text_as_html&#39;, where the value (string) is a just a transformation of the data into an HTML &lt;table&gt;. |  [optional] |
|**skipInferTableTypes** | **List&lt;String&gt;** | The document types that you want to skip table extraction with. Default: [&#39;pdf&#39;, &#39;jpg&#39;, &#39;png&#39;] |  [optional] |
|**xmlKeepTags** | **Boolean** | If True, will retain the XML tags in the output. Otherwise it will simply extract the text from within the tags. Only applies to partition_xml. |  [optional] |
|**chunkingStrategy** | **String** | Use one of the supported strategies to chunk the returned elements. Currently supports: by_title |  [optional] |
|**multipageSections** | **Boolean** | If chunking strategy is set, determines if sections can span multiple sections. Default: true |  [optional] |
|**combineUnderNChars** | **Integer** | If chunking strategy is set, combine elements until a section reaches a length of n chars. Default: 500 |  [optional] |
|**newAfterNChars** | **Integer** | If chunking strategy is set, cut off new sections after reaching a length of n chars (soft max). Default: 1500 |  [optional] |
|**maxCharacters** | **Integer** | If chunking strategy is set, cut off new sections after reaching a length of n chars (hard max). Default: 1500 |  [optional] |
|**overlap** | **Integer** | A prefix of this many trailing characters from prior text-split chunk is applied to second and later chunks formed from oversized elements by text-splitting. Default: None |  [optional] |
|**overlapAll** | **Boolean** | When True, overlap is also applied to &#39;normal&#39; chunks formed by combining whole elements. Use with caution as this can introduce noise into otherwise clean semantic units. Default: None |  [optional] |
|**extractImageBlockTypes** | **List&lt;String&gt;** | The types of elements to extract, for use in extracting image blocks as base64 encoded data stored in metadata fields |  [optional] |



