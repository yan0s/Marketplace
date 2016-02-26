/*
 * Copyright 2016  CloudStreet Oy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tnova.service.catalog.domain.sla;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude( JsonInclude.Include.NON_NULL )
@JsonPropertyOrder( { "count", "penalties" } )
public class CustomBusinessValue
{

    @JsonProperty( "count" )
    private int count;

    @JsonProperty( "penalties" )
    private List<Penalty> penalties = new ArrayList<Penalty>();

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public CustomBusinessValue() {}

    public CustomBusinessValue( int count, List<Penalty> penalties )
    {
        this.count = count;
        this.penalties = penalties;
    }

    @JsonProperty( "count" )
    public int getCount()
    {
        return count;
    }

    @JsonProperty( "count" )
    public void setCount( int count )
    {
        this.count = count;
    }

    public CustomBusinessValue withCount( int count )
    {
        this.count = count;
        return this;
    }

    @JsonProperty( "penalties" )
    public List<Penalty> getPenalties()
    {
        return penalties;
    }

    @JsonProperty( "penalties" )
    public void setPenalties( List<Penalty> penalties )
    {
        this.penalties = penalties;
    }

    public CustomBusinessValue withPenalties( List<Penalty> penalties )
    {
        this.penalties = penalties;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties()
    {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty( String name, Object value )
    {
        this.additionalProperties.put( name, value );
    }

    public CustomBusinessValue withAdditionalProperty( String name, Object value )
    {
        this.additionalProperties.put( name, value );
        return this;
    }

}
