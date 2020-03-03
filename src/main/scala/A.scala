package A

import B.B._

object A {
    def f(implicit x: Int): Int = x
}
