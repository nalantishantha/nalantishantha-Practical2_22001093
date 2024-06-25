object ExpressionEvaluator {
  def main(args: Array[String]): Unit = {
    var i, j, k: Int = 2
    var m, n: Int = 5
    val f: Float = 12.0f
    val g: Float = 4.0f
    val c: Char = 'X'

    val exprA = k + 12 * m
    val exprB = m / j
    val exprC = n % j
    val exprD = m / j * j
    val exprE = f + 10 * 5 + g

    i += 1
    val exprF = i * n

    println(s" k + 12 * m = $exprA")
    println(s" m / j = $exprB")
    println(s" n % j = $exprC")
    println(s" m / j * j = $exprD")
    println(s" f + 10*5 + g = $exprE")
    println(s" ++i * n = $exprF")
  }
}
