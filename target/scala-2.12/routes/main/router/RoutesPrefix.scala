// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/user/lab2/conf/routes
// @DATE:Thu Apr 12 13:28:48 CEST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
