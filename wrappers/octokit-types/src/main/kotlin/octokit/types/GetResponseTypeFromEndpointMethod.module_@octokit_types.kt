@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package octokit.types

import tsstdlib.ReturnType

typealias Unwrap<@Suppress("UNUSED_TYPEALIAS_PARAMETER") T> = Any

typealias AnyFunction = (args: Any) -> Any

typealias GetResponseTypeFromEndpointMethod<@Suppress("UNUSED_TYPEALIAS_PARAMETER") T> = Unwrap<ReturnType<T>>

typealias GetResponseDataTypeFromEndpointMethod<@Suppress("UNUSED_TYPEALIAS_PARAMETER") T> = Any
