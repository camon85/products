package controllers

import javax.inject.Inject

import models.Product
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc.{Action, Controller}

class ProductController @Inject() (val messagesApi: MessagesApi) extends Controller with I18nSupport {


  def list = Action { implicit request =>
    val products = Product.findAll
    Ok(views.html.products.list(products))
  }
}
