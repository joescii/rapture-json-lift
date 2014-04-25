/**********************************************************************************************\
* Rapture JSON Library                                                                         *
* Version 0.9.0                                                                                *
*                                                                                              *
* The primary distribution site is                                                             *
*                                                                                              *
*   http://rapture.io/                                                                         *
*                                                                                              *
* Copyright 2010-2014 Jon Pretty, Propensive Ltd.                                              *
*                                                                                              *
* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file    *
* except in compliance with the License. You may obtain a copy of the License at               *
*                                                                                              *
*   http://www.apache.org/licenses/LICENSE-2.0                                                 *
*                                                                                              *
* Unless required by applicable law or agreed to in writing, software distributed under the    *
* License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,    *
* either express or implied. See the License for the specific language governing permissions   *
* and limitations under the License.                                                           *
\**********************************************************************************************/
package rapture.json.jsonParsers.lift

import rapture.json._
import rapture.core._

import net.liftweb.json._
import JsonAST._

object `package` {
  implicit val liftStringParser: JsonBufferParser[String] = LiftStringParser

  implicit val jValueExtractor: BasicExtractor[JValue] =
    BasicExtractor(_.json.asInstanceOf[JValue])
  
  implicit val jStringExtractor: BasicExtractor[JString] =
    BasicExtractor(_.json.asInstanceOf[JString])
  
  implicit val jIntExtractor: BasicExtractor[JInt] =
    BasicExtractor(_.json.asInstanceOf[JInt])
  
  implicit val jDoubleExtractor: BasicExtractor[JDouble] =
    BasicExtractor(_.json.asInstanceOf[JDouble])
  
  implicit val jArrayExtractor: BasicExtractor[JArray] =
    BasicExtractor(_.json.asInstanceOf[JArray])
  
  implicit val jObjectExtractor: BasicExtractor[JObject] =
    BasicExtractor(_.json.asInstanceOf[JObject])

}
