// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The IpConfigurationProfile model. */
@JsonFlatten
@Fluent
public class IpConfigurationProfileInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IpConfigurationProfileInner.class);

    /*
     * The name of the resource. This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Sub Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The reference to the subnet resource to create a container network
     * interface ip configuration.
     */
    @JsonProperty(value = "properties.subnet")
    private SubnetInner subnet;

    /*
     * The provisioning state of the IP configuration profile resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: The name of the resource. This name can be used to access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource. This name can be used to access the resource.
     *
     * @param name the name value to set.
     * @return the IpConfigurationProfileInner object itself.
     */
    public IpConfigurationProfileInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Sub Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the subnet property: The reference to the subnet resource to create a container network interface ip
     * configuration.
     *
     * @return the subnet value.
     */
    public SubnetInner subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: The reference to the subnet resource to create a container network interface ip
     * configuration.
     *
     * @param subnet the subnet value to set.
     * @return the IpConfigurationProfileInner object itself.
     */
    public IpConfigurationProfileInner withSubnet(SubnetInner subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the IP configuration profile resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subnet() != null) {
            subnet().validate();
        }
    }
}
