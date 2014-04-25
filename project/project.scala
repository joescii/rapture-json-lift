object project extends ProjectSettings {
  def scalaVersion = "2.10.4"
  def version = "0.10.0"
  def name = "json-json4s"
  def description = "Rapture JSON/JSON4S provides support the JSON4S parser in Rapture JSON"
  
  def dependencies = Seq(
    "core" -> "0.9.0",
    "json" -> "0.9.1"
  )
  
  def thirdPartyDependencies = Seq(
    ("net.liftweb", "lift-json_2.10", "2.5")
  )

  def imports = Seq(
    "rapture.core._",
    "rapture.json._",
    "jsonParsers.json4s._",
    "strategy.throwExceptions"
  )
}
