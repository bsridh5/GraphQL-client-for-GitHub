package client.json

import scala.reflect.ClassTag

/**
 * Json Parser trait contains one method definition which needs to be implemented
 * by the Json Parser Class(Jackson). The Parser is used for Json to scala object
 */

trait JsonDeserializer {

  /**
   *
   * @param json
   * @tparam T the scala case class that is passed to which the json string is deserialized
   * @return The object of the case class to which the json parts are mapped
   */
  def deserialize[T:Manifest](json:String):T

}
