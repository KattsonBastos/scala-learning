
object Variables extends App {
    // NUMERICAL TYPES

    // Byte - 8-bit signed two’s complement integer (-2^7 to 2^7-1, inclusive) [-128 to 127]
    // Int - 32-bit two’s complement integer (-2^31 to 2^31-1, inclusive) [-2,147,483,648 to 2,147,483,647]
    // Long - 64-bit two’s complement integer (-2^63 to 2^63-1, inclusive) [(-2^63 to 2^63-1, inclusive)]
    // Short - 16-bit signed two’s complement integer (-2^15 to 2^15-1, inclusive) [-32,768 to 32,767]
    // Double - 64-bit IEEE 754 double-precision float []
    // Float - 32-bit IEEE 754 single-precision float

    val byteVal: Byte = 1 // if we don't specify the type, it defaults to an Int
    val intVal: Int = 1 // if we don't specify the type, it defaults to an Int
    val longVal: Long = 1 // if we don't specify the type, it defaults to an Int
    val shortVal: Short = 1 // if we don't specify the type, it defaults to an Int
    val doubleVal: Double = 3.5 // the default for decimals is Double
    val floatVal: Float = 3.5 // if we don't specify the type, it defaults to a Double

    // Int and Double are default, so, there's no need to specify the type
    val intVal = 1
    val doubleVal = 3.5

    // TEXT TYPES

    // Char - 16-bit unsigned Unicode character (0 to 2^16-1, inclusive) [0 to 65,535]
    // String - a sequence of Char

    val nameVal = "Bilbo"
    val charVal = "B"

    // merging strings
    val firstName = "Bilbo"
    val lastName = "Baggins"

    val stringAppending = firstName + " " + lastName

    // string interpolation
    val stringInterpolation = s"$firstName $lastName"

    // string interpolation way two
    val stringInterpolation = s"${firstName} ${lastName}"

    val opInterpolation = s"His name is ${firstName} ${lastName} and he has ${1+1} coins."

    // multiple string
    val riddle = """A box without hinges, key, or lid,
                    |Yet golden treasure inside is hid.""".stripMargin
}