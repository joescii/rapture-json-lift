object project extends ProjectSettings {
  def scalaVersion = "2.11.4"
  def version = "1.0.6"
  def name = "json-lift"
  def description = "Rapture JSON/Lift provides support the Lift parser in Rapture JSON"
  
  def dependencies = Seq(
    "json" -> "1.0.6"
  )
  
  def thirdPartyDependencies = Seq(
    ("net.liftweb", "lift-json_2.11", "2.5")
  )

  def imports = Seq(
    "rapture.core._",
    "rapture.json._",
    "jsonBackends.lift._"
  )
}
