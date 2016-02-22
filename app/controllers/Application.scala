package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    //Ok("Hello world")
    Redirect(routes.Products.list())
  }

  def hello(name: String) = Action {
    //Ok("Hello from scala " + name)
    Ok(views.html.hello(name))
  }

}
