import lara.epfl.scalasca.core.ScalaSCAPluginBase
import lara.epfl.scalasca.rules._
import com.example.scalascaplugin._
import scala.tools.nsc._

class ScalaSCAPlugin {

	def createRules(global: Global): List[Rule] =
		List(new SampleRule(global, List()))
}