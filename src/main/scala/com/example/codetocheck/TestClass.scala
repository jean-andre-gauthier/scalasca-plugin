package com.example.codetocheck

class TestClass {
	def main(args: Array[String]) {
		try {
			println("""This is some sample code that will trigger a warning from scalasca
- Empty finally clauses usually indicate a programmer's mistake""")
		}
		finally{}
	}
}