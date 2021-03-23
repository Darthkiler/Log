package darthkilersprojects.com.darthkilerslog

import darthkilersprojects.com.log.L
import darthkilersprojects.com.log.show
import darthkilersprojects.com.log.showDebug

object TestLog {

    fun simpleShow() {
        5.show()
        6.5.show("int")
        "qwe".show(null)
    }

    fun showObject() {
        L.show(5)
        L.show(5.3)
        L.show("asd")
        L.show("zxc", "dfhg")
        L.show("kdljfglkjdf", null)
    }

    fun showLambda() {
        5.show("5") + 11.show("11").show("result")

        7.show("qwe")
    }

    fun showDebug() {
        666.showDebug()
        777.showDebug("debag show")
    }

    fun showNull() {
        null.show()
        null.show("qqqqqqq")
    }
}