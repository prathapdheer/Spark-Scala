package somePackage

/**
 * This resource singleton was autogenerated based on the contents of the following files :
 * <ul><li>examples/somePackage.Test2.properties</li></ul> 
 */
    
import java.util._
import java.text._
object Test2 {
	private var $resourceBundle: ResourceBundle = _

  private var $locale = Locale.getDefault
  private def $loadBundle(loc: Locale) = this synchronized {
    $resourceBundle = ResourceBundle.getBundle("somePackage.Test2", $locale)
  }
  $loadBundle($locale)
  
  def locale = $locale
  def locale_=(loc: Locale) = this synchronized {
    $loadBundle(loc)
    $locale = loc
  }
    
	/** Reference message : "Acme, Inc." */
	lazy val companyName = $resourceBundle.getString("companyName")

	private lazy val error1$fmt = new MessageFormat($resourceBundle.getString("error1"))
	/** Reference message : "You got error message {0,number,integer}" */
	def error1(arg0: Long) = error1$fmt.format(Array[AnyRef](arg0.asInstanceOf[AnyRef]))

	private lazy val error2$fmt = new MessageFormat($resourceBundle.getString("error2"))
	/** Reference message : "Weird amount {0,number}" */
	def error2(arg0: Double) = error2$fmt.format(Array[AnyRef](arg0.asInstanceOf[AnyRef]))

	private lazy val error3$fmt = new MessageFormat($resourceBundle.getString("error3"))
	/** Reference message : "Weird date {0,date}, {1}" */
	def error3(arg0: java.util.Date, arg1: Any) = error3$fmt.format(Array[AnyRef](arg0.asInstanceOf[AnyRef], arg1.asInstanceOf[AnyRef]))

	private lazy val error4$fmt = new MessageFormat($resourceBundle.getString("error4"))
	/** Reference message : "Weird text {0}" */
	def error4(arg0: Any) = error4$fmt.format(Array[AnyRef](arg0.asInstanceOf[AnyRef]))

	/** Reference message : "Resource Compiler" */
	lazy val productName = $resourceBundle.getString("productName")

	/** Reference message : "Hello" */
	lazy val title = $resourceBundle.getString("title")

}