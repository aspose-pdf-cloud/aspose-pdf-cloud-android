﻿
# SplitResultDocument
Represents split result document,

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Gets or sets the page number. | 
**href** | **String** | The "href" attribute contains the link's IRI. atom:link elements MUST have an href attribute, whose value MUST be a IRI reference | [optional]
**rel** | **String** | atom:link elements MAY have a "rel" attribute that indicates the link relation type. If the "rel" attribute is not present, the link element MUST be interpreted as if the link relation type is "alternate". | [optional]
**type** | **String** | On the link element, the "type" attribute's value is an advisory media type: it is a hint about the type of the representation that is expected to be returned when the value of the href attribute is dereferenced. Note that the type attribute does not override the actual media type returned with the representation. | [optional]
**title** | **String** | The "title" attribute conveys human-readable information about the link. The content of the "title" attribute is Language-Sensitive. | [optional]


[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)


