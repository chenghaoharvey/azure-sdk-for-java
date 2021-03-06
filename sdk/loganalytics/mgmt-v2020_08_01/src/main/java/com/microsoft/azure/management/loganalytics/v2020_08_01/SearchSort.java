/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The sort parameters for search.
 */
public class SearchSort {
    /**
     * The name of the field the search query is sorted on.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The sort order of the search. Possible values include: 'asc', 'desc'.
     */
    @JsonProperty(value = "order")
    private SearchSortEnum order;

    /**
     * Get the name of the field the search query is sorted on.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the field the search query is sorted on.
     *
     * @param name the name value to set
     * @return the SearchSort object itself.
     */
    public SearchSort withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the sort order of the search. Possible values include: 'asc', 'desc'.
     *
     * @return the order value
     */
    public SearchSortEnum order() {
        return this.order;
    }

    /**
     * Set the sort order of the search. Possible values include: 'asc', 'desc'.
     *
     * @param order the order value to set
     * @return the SearchSort object itself.
     */
    public SearchSort withOrder(SearchSortEnum order) {
        this.order = order;
        return this;
    }

}
