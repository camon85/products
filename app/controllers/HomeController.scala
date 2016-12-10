package controllers

import play.api.mvc._

//@Singleton
class HomeController extends Controller {
  def index = Action {
    // 상품 목록으로 리다이렉트
    Redirect(routes.ProductController.list())
  }
}
