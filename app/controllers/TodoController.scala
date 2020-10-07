package controllers

import javax.inject.Inject
import models.Todo
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, ControllerComponents}

class TodoController @Inject()(
                                cc: ControllerComponents
                              ) extends AbstractController(cc) {

  implicit val todoFormat = Json.format[Todo]

  def getAll = Action {
    val todo = new Todo(1, "item 1", false)
    Ok(Json.toJson(todo))
  }
}
