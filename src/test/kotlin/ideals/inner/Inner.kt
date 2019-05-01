package ideals.inner

import com.fasterxml.jackson.annotation.JsonProperty
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class Inner(

	@field:JsonProperty("object_field")
	val objectField: Any? = null,

	@field:JsonProperty("second_inner")
	val secondInner: SecondInner? = null,

	@field:JsonProperty("int_field")
	val intField: Int? = null,

	@field:JsonProperty("double_field")
	val doubleField: Double? = null,

	@field:JsonProperty("string_field")
	val stringField: String? = null
)