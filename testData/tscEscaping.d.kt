package tscEscaping

@module
object atpl {
    var __foo: Any = noImpl
    fun __express(filename: String, options: Any, callback: Function): Any = noImpl
}
external open class __A {
    open var __foo: Number = noImpl
    open fun __express(filename: String, options: Any, callback: Function): Any = noImpl
}
external interface __B {
    var __foo: Number
    fun __express(filename: String, options: Any, callback: Function): Any
}
enum class __E {
    __A,
    __B
}
@module
object __M {
    var __foo: Number = noImpl
    fun __express(filename: String, options: Any, callback: Function): Any = noImpl
    @module
    object __N {
        var __foo: Number = noImpl
        fun __express(filename: String, options: Any, callback: Function): Any = noImpl
        open class __C
    }
}
external fun <__T> foo(__a: __T, _b: __M.__N.__C): Unit = noImpl
