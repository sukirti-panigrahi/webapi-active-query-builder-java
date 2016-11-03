/**
 * QueryBuilderApi
 * Active Query Builder Web API lets create, analyze and modify SQL queries for different database servers using RESTful HTTP requests to a cloud-based service. It requires SQL execution context (information about database schema and used database server) to be stored under the registered account at https://webapi.activequerybuilder.com/.
 *
 * OpenAPI spec version: 1.1.8
 * Contact: support@activedbsoft.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package webapi.activequerybuilder.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * If any aggregations are defined there, the SELECT list of original query is replaced with the list of aggregations in transformed query. Filling aggregations is useful when you want to get totals for original query resultset.
 */
@ApiModel(description = "If any aggregations are defined there, the SELECT list of original query is replaced with the list of aggregations in transformed query. Filling aggregations is useful when you want to get totals for original query resultset.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-03T18:45:46.271+06:00")
public class Totals   {
  @JsonProperty("field")
  private String field = null;

  /**
   * Aggregate function name.
   */
  public enum AggregateEnum {
    AVG("avg"),
    
    COUNT("count"),
    
    MAX("max"),
    
    MIN("min"),
    
    SUM("sum");

    private String value;

    AggregateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("aggregate")
  private AggregateEnum aggregate = null;

  public Totals field(String field) {
    this.field = field;
    return this;
  }

   /**
   * Column of original query to which an aggregate function will be applied.
   * @return field
  **/
  @ApiModelProperty(example = "null", value = "Column of original query to which an aggregate function will be applied.")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public Totals aggregate(AggregateEnum aggregate) {
    this.aggregate = aggregate;
    return this;
  }

   /**
   * Aggregate function name.
   * @return aggregate
  **/
  @ApiModelProperty(example = "null", value = "Aggregate function name.")
  public AggregateEnum getAggregate() {
    return aggregate;
  }

  public void setAggregate(AggregateEnum aggregate) {
    this.aggregate = aggregate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Totals totals = (Totals) o;
    return Objects.equals(this.field, totals.field) &&
        Objects.equals(this.aggregate, totals.aggregate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, aggregate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Totals {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    aggregate: ").append(toIndentedString(aggregate)).append("\n");
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

